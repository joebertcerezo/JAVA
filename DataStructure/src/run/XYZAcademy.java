/*
    File: XYZAcademy.java
    Description: 
    Programmer: Marianne Kate B. Bejec
    Date: Novembert 4, 2021
*/

package run;

import java.util.Scanner;

public class XYZAcademy{

    private static XYZAcademy list = new XYZAcademy();

    private class Node {
        Node prev;
        int studentId;
        String lastName;
        String firstName;
        String course;
        String section;
        int yearLevel;
        String status;
        Node next;
    } private Node start;

    private Node createNewNode(int studentId, String lastName, String firstName, String course, String section, int yearLevel, String status) throws Exception{
        Node node = new Node();

        if(node == null){
            throw new Exception("List overflow");
        }

        else{
            node.prev = null;
            node.studentId = studentId;
            node.lastName = lastName;
            node.firstName = firstName;
            node.course = course;
            node.section = section;
            node.yearLevel = yearLevel;
            node.status = status;
            node.next = null;
            return node;
        }
    }


    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to XYZ Academy!");
        menu();
    }

    public static void menu()throws Exception{
        Scanner input = new Scanner(System.in);

        int option = -1;
        int studentId, yearLevel;
        String lastName, firstName, course, section, status;
        
        //gi while loop nako tanan diri kay di ko kagamit sa break mu out kalit
        while(option!=0)
        {
        System.out.println("1. Input Student Record");
        System.out.println("2. Search student record by ID");
        System.out.println("3. Search student record by name");
        System.out.println("4. Search student record by course");
        System.out.println("5. Display students based on year level");
        System.out.println("6. Display all students in ascending order based on year level");
        System.out.println("7. Display all students in ascending order based on student ID");
        System.out.println("8. Display all the courses in ascending order");
        System.out.println("9. Display how many students are currently enrolled in a particular course");
        System.out.println("10. Display how many students are currently active");
        System.out.println("11. Displays how many students are currently inactive");
        System.out.println("12. Delete a student by a student ID");
        System.out.println("0. Exit");
        System.out.print("What would you like to do? ");
        option = input.nextInt();

        switch (option){
            case 1:
                System.out.print("Student ID: ");
                studentId = input.nextInt();
                input.nextLine();
                if(list.checkID(studentId)>0)
                    {
                        System.out.println(studentId + " already Existed.\n\n");
                        break;
                    }
                System.out.print("Last Name: ");
                lastName = input.nextLine().toUpperCase();
                System.out.print("First Name: ");
                firstName = input.nextLine().toUpperCase();
                System.out.print("Course: ");
                course = input.nextLine().toUpperCase();
                System.out.print("Section: ");
                section = input.nextLine().toUpperCase();
                System.out.print("Year Level: ");
                yearLevel = input.nextInt();

                if (yearLevel <= 0 || yearLevel >= 5){
                    System.out.println("Error!");
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    menu();
                }

                System.out.print("Status: ");
                input.nextLine();
                status = input.nextLine().toUpperCase();
                
                //ka arte sa imong code diri oiee...haha di ko kalahos og input kailangan gyud sakto..hahaahha
                if (!status.equalsIgnoreCase("not active")){
                    if (!status.equalsIgnoreCase("active")) {
                        System.out.println("Error!");
                        menu();
                    }
                }

                list.inputStudentRecord(studentId, lastName, firstName, course, section, yearLevel, status);
                menu();
                break;

            case 2:
                System.out.print("Student ID:");
                studentId = input.nextInt();
                list.searchByID(studentId);
                menu();
                break;

            case 3:
                System.out.print("Input Last Name or First Name: ");
                String name = input.nextLine();
                name = input.nextLine();
                list.searchByName(name);
                menu();
                break;

            case 4:
                System.out.println("Course: ");
                input.nextLine();
                course = input.nextLine();
                list.searchByCourse(course);
                menu();
                break;

            case 5:
                System.out.print("Enter yearLevel: ");
                yearLevel = input.nextInt();
                list.displayByyearLevel(yearLevel);
                menu();
                break;

            case 6:
                list.displayAscendingYearLevel();
                menu();
                break;

            case 7:
                list.displayAscendingStudentID();
                menu();
                break;

            case 8:
                list.displayAscendingCourse();
                menu();
                break;

            case 9:
                System.out.print("Course: ");
                input.nextLine();
                course = input.nextLine();
                list.displayEnrolledStudentsInCourse(course);
                menu();
                break;

            case 10:
                list.displayActiveStudents();
                menu();
                break;

            case 11:
                list.displayInactiveStudents();
                menu();
                break;

            case 12:
                System.out.print("Student ID: ");
                studentId = input.nextInt();
                list.deleteAStudentByStudentID(studentId);
                menu();
                break;

            case 0:
                System.out.println("Thank You!");
                break;

            default:
                System.out.println("Invalid key! Please reselect.");
        }
    }
    }

    public void inputStudentRecord(int studentId, String lastName, String firstName, String course, String section, int yearLevel, String status) throws Exception {
        Node node = createNewNode(studentId, lastName, firstName, course, section, yearLevel, status);
        Node ptr;

        if (start == null){
            start = node;
        }

        else{
            ptr = start;


            while(ptr.next != null){
                    if (node.studentId == ptr.studentId) {
                        System.out.println("The record already exists");
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        menu();
                    }
                    else {
                        ptr = ptr.next;
                    }
            }
            ptr.next = node;
            node.prev = ptr;
        }
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public void searchByID(int studentID) throws Exception{
        Node ptr;

        if (start == null){
            throw new Exception("List is empty");
        }

        else {
            ptr = start;

            while (ptr.studentId != studentID) {
                ptr = ptr.next;
            }
            System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%n","Student ID","Last Name","First Name","Course","Section","Year Level","Status");
            System.out.printf("%-15d%-15s%-15s%-15s%-15s%-15d%-15s%n",ptr.studentId, ptr.lastName, ptr.firstName, ptr.course, ptr.section, ptr.yearLevel, ptr.status);
        }
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public void searchByName(String name)throws Exception{
        Node ptr = start;
        
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%n","Student ID","Last Name","First Name","Course","Section","Year Level","Status");
            
        if (start == null){
            throw new Exception("List is empty");
        }
        else if(ptr.firstName.equalsIgnoreCase(name) || ptr.lastName.equalsIgnoreCase(name))
        {
            System.out.printf("%-15d%-15s%-15s%-15s%-15s%-15d%-15s%n",ptr.studentId, ptr.lastName, ptr.firstName, ptr.course, ptr.section, ptr.yearLevel, ptr.status);
        }
        else 
        {
            while(!(ptr.firstName.equalsIgnoreCase(name) || ptr.lastName.equalsIgnoreCase(name))) 
            {
                ptr = ptr.next;
            }
            System.out.printf("%-15d%-15s%-15s%-15s%-15s%-15d%-15s%n",ptr.studentId, ptr.lastName, ptr.firstName, ptr.course, ptr.section, ptr.yearLevel, ptr.status);
        }
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public void searchByCourse(String course) throws Exception{
        Node ptr;

        if (start == null){
            throw new Exception("List is empty");
        }

        else {
            ptr = start;

            System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%n","Student ID","Last Name","First Name","Course","Section","Year Level","Status");

            while (ptr !=null){
                if (ptr.course.equalsIgnoreCase(course)){
                    System.out.printf("%-15d%-15s%-15s%-15s%-15s%-15d%-15s%n",ptr.studentId, ptr.lastName, ptr.firstName, ptr.course, ptr.section, ptr.yearLevel, ptr.status);
                }
                ptr = ptr.next;
            }
        }
        System.out.println();
        System.out.println();
        System.out.println();
    }
    
    //gipuno lang ko ni, basin ganahan ka ing anion...
    public void displayByyearLevel(int yearLevel) throws Exception 
    {
        Node ptr = start;
        
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%n","Student ID","Last Name","First Name","Course","Section","Year Level","Status");
        
        if (start == null) {
            throw new Exception("List Underflow");
        }
        else
        {
            while(ptr.next != null)
            {
                if(ptr.yearLevel == yearLevel)
                {
                    System.out.printf("%-15d%-15s%-15s%-15s%-15s%-15d%-15s%n",ptr.studentId, ptr.lastName, ptr.firstName, ptr.course, ptr.section, ptr.yearLevel, ptr.status);
                }
                ptr = ptr.next;
            }
            System.out.printf("%-15d%-15s%-15s%-15s%-15s%-15d%-15s%n",ptr.studentId, ptr.lastName, ptr.firstName, ptr.course, ptr.section, ptr.yearLevel, ptr.status);
        }
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public void displayByYearLevel() throws Exception {
        Node ptr, comparator, temp;

        if (start == null){
            throw new Exception("List is empty");
        }

        else{
            ptr = start;
            comparator = ptr.next;

            System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%n","Student ID","Last Name","First Name","Course","Section","Year Level","Status");

            while (ptr.next != null){
                while (comparator != null){
                    if (ptr.yearLevel > comparator.yearLevel){
                        temp = ptr;
                        ptr = comparator;
                        comparator = temp;
                    }
                }
                System.out.printf("%-15d%-15s%-15s%-15s%-15s%-15d%-15s%n",ptr.studentId, ptr.lastName, ptr.firstName, ptr.course, ptr.section, ptr.yearLevel, ptr.status);
                ptr = ptr.next;
            }
        }
        System.out.println();
        System.out.println();
        System.out.println();
    }
    
    //sakto ni imohang code...ako lang gi pun an ang swap...gi data nako...
    public void displayAscendingYearLevel()throws Exception{
        Node ptr, comparator;
        Node temp = new Node();
        
        if(start == null){
            throw new Exception("List is empty");
        }

        else{
            ptr = start;
            comparator = ptr;

            while(ptr != null)
            {
                Node min = ptr;
                comparator = ptr;
                while (comparator != null) 
                {
                    if (min.yearLevel > comparator.yearLevel) 
                    {
                        min = comparator;
                    }
                    comparator = comparator.next;
                }
                temp.yearLevel = ptr.yearLevel; temp.studentId = ptr.studentId; temp.lastName = ptr.lastName; temp.firstName = ptr.firstName; temp.course = ptr.course; temp.section = ptr.section; temp.status = ptr.status;                
                ptr.yearLevel = min.yearLevel; ptr.studentId = min.studentId; ptr.lastName = min.lastName; ptr.firstName = min.firstName; ptr.course = min.course; ptr.section = min.section; ptr.status = min.status;                
                min.yearLevel = temp.yearLevel; min.studentId = temp.studentId; min.lastName = temp.lastName; min.firstName = temp.firstName; min.course = temp.course; min.section = temp.section; min.status = temp.status;                
                ptr = ptr.next;    
            }
        }
        display();
        System.out.println();
        System.out.println();
        System.out.println();
    }

    
    public void displayAscendingStudentID()throws Exception{
        Node ptr, comparator;
        Node temp = new Node();
        
        if(start == null){
            throw new Exception("List is empty");
        }

        else{
            ptr = start;
            comparator = ptr;

            while(ptr != null)
            {
                Node min = ptr;
                comparator = ptr;
                while (comparator != null) 
                {
                    if (min.studentId > comparator.studentId) 
                    {
                        min = comparator;
                    }
                    comparator = comparator.next;
                }
                temp.yearLevel = ptr.yearLevel; temp.studentId = ptr.studentId; temp.lastName = ptr.lastName; temp.firstName = ptr.firstName; temp.course = ptr.course; temp.section = ptr.section; temp.status = ptr.status;                
                ptr.yearLevel = min.yearLevel; ptr.studentId = min.studentId; ptr.lastName = min.lastName; ptr.firstName = min.firstName; ptr.course = min.course; ptr.section = min.section; ptr.status = min.status;                
                min.yearLevel = temp.yearLevel; min.studentId = temp.studentId; min.lastName = temp.lastName; min.firstName = temp.firstName; min.course = temp.course; min.section = temp.section; min.status = temp.status;                
                ptr = ptr.next;    
            }
        }
        display();
        System.out.println();
        System.out.println();
        System.out.println();
    }

    
    public void displayAscendingCourse()throws Exception
    {
        Node ptr, comparator;
        Node temp = new Node();
        
        if(start == null){
            throw new Exception("List is empty");
        }

        else{
            ptr = start;
            comparator = ptr;

            while(ptr != null)
            {
                Node min = ptr;
                comparator = ptr;
                while (comparator != null) 
                {
                    if (min.course.compareTo(comparator.course) > 0) 
                    {
                        min = comparator;
                    }
                    comparator = comparator.next;
                }
                temp.yearLevel = ptr.yearLevel; temp.studentId = ptr.studentId; temp.lastName = ptr.lastName; temp.firstName = ptr.firstName; temp.course = ptr.course; temp.section = ptr.section; temp.status = ptr.status;                
                ptr.yearLevel = min.yearLevel; ptr.studentId = min.studentId; ptr.lastName = min.lastName; ptr.firstName = min.firstName; ptr.course = min.course; ptr.section = min.section; ptr.status = min.status;                
                min.yearLevel = temp.yearLevel; min.studentId = temp.studentId; min.lastName = temp.lastName; min.firstName = temp.firstName; min.course = temp.course; min.section = temp.section; min.status = temp.status;                
                ptr = ptr.next;    
            }
        }
        display();
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public void displayEnrolledStudentsInCourse(String course)throws Exception{
        Node ptr;

        if (start == null){
            throw new Exception("List is empty");
        }

        else {
            ptr = start;

            System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%n","Student ID","Last Name","First Name","Course","Section","Year Level","Status");

            while (ptr != null){
                if (ptr.course.equalsIgnoreCase(course)){
                    System.out.printf("%-15d%-15s%-15s%-15s%-15s%-15d%-15s%n",ptr.studentId, ptr.lastName, ptr.firstName, ptr.course, ptr.section, ptr.yearLevel, ptr.status);
                }
                ptr = ptr.next;
            }
        }
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public void displayActiveStudents()throws Exception{
        Node ptr;

        if (start == null){
            throw new Exception("List is empty");
        }

        else {
            ptr = start;

            System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%n","Student ID","Last Name","First Name","Course","Section","Year Level","Status");

            while (ptr != null){
                if (ptr.status.equalsIgnoreCase("active")){
                    System.out.printf("%-15d%-15s%-15s%-15s%-15s%-15d%-15s%n",ptr.studentId, ptr.lastName, ptr.firstName, ptr.course, ptr.section, ptr.yearLevel, ptr.status);
                }
                ptr = ptr.next;
            }
        }
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public void displayInactiveStudents()throws Exception{
        Node ptr;

        if (start == null){
            throw new Exception("List is empty");
        }

        else {
            ptr = start;

            System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%n","Student ID","Last Name","First Name","Course","Section","Year Level","Status");

            while (ptr != null){
                if (ptr.status.equalsIgnoreCase("not active")){
                    System.out.printf("%-15d%-15s%-15s%-15s%-15s%-15d%-15s%n",ptr.studentId, ptr.lastName, ptr.firstName, ptr.course, ptr.section, ptr.yearLevel, ptr.status);
                }
                ptr = ptr.next;
            }
        }
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public void deleteAStudentByStudentID(int studentID)throws Exception{
        Node ptr;

        if (start == null){
            throw new Exception("List is empty");
        }

        else{
            ptr = start;

            if (start.studentId == studentID){
                ptr = ptr.next;
                start = ptr;
            }

            else {
                while (ptr.studentId != studentID) {
                    ptr = ptr.next;
                }
                if (ptr.next == null){
                    ptr.prev.next = null;
                }
                else {
                    ptr.next.prev = ptr.prev;
                    ptr.prev.next = ptr.next;
                }
            }
            System.out.println("The student with the student id: "+studentID+ "was deleted");
        }
        System.out.println();
        System.out.println();
        System.out.println();
    }
    
    //pun an lang nako ani para sa sort...
    public void display() throws Exception 
    {
        Node ptr;
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%n","Student ID","Last Name","First Name","Course","Section","Year Level","Status");
        if (start == null) {
            throw new Exception("List Underflow");
        }
        else  {
            ptr = start;

            while(ptr != null) {
                System.out.printf("%-15d%-15s%-15s%-15s%-15s%-15d%-15s%n",ptr.studentId, ptr.lastName, ptr.firstName, ptr.course, ptr.section, ptr.yearLevel, ptr.status);
                ptr = ptr.next;
            }
        }

        System.out.println();
    }
    
    //check kung nibalik ba ang ID
    public int checkID(int studentId) throws Exception
    {
        Node ptr = start;
        int count = 0;
        
        while(ptr != null)
        {
            if(ptr.studentId == studentId)
            {
                count++;
            }
            ptr = ptr.next;
        }
        return count;
    }
}