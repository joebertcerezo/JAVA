/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity.pkg2.doubly.linked.list;

import java.util.Scanner;
public class Activity2DoublyLinkedList
{
    public static void main(String[] args) throws Exception
    {
        Scanner input = new Scanner(System.in);
        doubly student = new doubly();
        System.out.println("Doubly LinkedList");
        int choice = 0;
        
        while(choice<14)
        {
            System.out.println("\n -------------------------------------------------------------------------------");
            System.out.println("| [1] - Input Student Record                                                    |");
            System.out.println("| [2] - Search student records by ID                                            |");
            System.out.println("| [3] - Search students by name                                                 |");
            System.out.println("| [4] - Search students by course                                               |");
            System.out.println("| [5] - Dislays student based on year level                                     |");
            System.out.println("| [6] - Displays all students in ascending order based on year level            |");
            System.out.println("| [7] - Displays all students in ascending order based on studentID             |");
            System.out.println("| [8] - Displays all the courses in ascending order                             |");
            System.out.println("| [9] - Display how many students are currently enrolled in a particular course |");
            System.out.println("|[10] - Displays how many students are currently active                         |");
            System.out.println("|[11] - Displays how many students are currently inactive                       |");
            System.out.println("|[12] - Delete a student by a studentID                                         |");
            System.out.println("| [0] - Exit                                                                    |");
            System.out.println(" -------------------------------------------------------------------------------");
            System.out.print("Enter number: ");
            choice = input.nextInt();
            
            switch(choice)
            {
                case 1:
                    System.out.println("\n[1] - Input Student Record");
                    System.out.print("Enter studentID: ");
                    int studentID = input.nextInt();
                    System.out.print("Enter lastName: ");
                    String lastName = input.nextLine().toUpperCase();
                    lastName = input.nextLine().toUpperCase();
                    System.out.print("Enter firstName: ");
                    String firstName = input.nextLine().toUpperCase();
                    System.out.print("Enter course: ");
                    String course = input.nextLine().toUpperCase();
                    System.out.print("Enter section: ");
                    String section = input.nextLine().toUpperCase();
                    System.out.print("Enter yearLevel: ");
                    int yearLevel = input.nextInt();
                    if(yearLevel>4)
                    {
                        System.out.println("Invalid yearLevel.");
                        break;
                    }
                    System.out.print("Enter status (ACTIVE/NOT ACTIVE): ");
                    String status = input.nextLine().toUpperCase();
                    status = input.nextLine().toUpperCase();
                    student.InputStudentRecord(lastName, firstName, course, section, status, studentID, yearLevel);
                    student.checkID(studentID);
                    break;
                case 2:
                    System.out.println("\n[2] - Search student records by ID");
                    System.out.print("Enter studentID: ");
                    studentID = input.nextInt();
                    student.searchbyID(studentID);
                    break;
                case 3:
                    System.out.println("\n[3] - Search students by name");
                    System.out.print("Enter firstName or lastName: ");
                    String name = input.next();
                    student.searchbyName(name);
                    break;
                case 4:
                    System.out.println("\n[4] - Search students by course");
                    System.out.print("Enter course: ");
                    course = input.next();
                    student.searchbyCourse(course);
                    break;
                case 5:
                    System.out.println("\n[5] - Dislays student based on year level");
                    System.out.print("Enter yearLevel: ");
                    yearLevel = input.nextInt();
                    student.displayByyearLevel(yearLevel);
                    break;
                case 6:
                    System.out.println("\n[6] - Displays all students in ascending order based on year level");
                    student.sortbyYearLevel();
                    break;
                case 7:
                    System.out.println("\n[7] - Displays all students in ascending order based on studentID");
                    student.sortbystudentID();
                    break;
                case 8:
                    System.out.println("\n[8] - Displays all the courses in ascending order");
                    student.sortbycourse();
                    break;
                case 9:
                    System.out.println("\n[9] - Display how many students are currently enrolled in a particular course");
                    System.out.print("Enter course: ");
                    course = input.next();
                    student.displayNoStudentByCourse(course);
                    break;
                case 10:
                    System.out.println("\n[10] - Displays how many students are currently active");
                    student.displayNoStudentActive();
                    break;
                case 11:
                    System.out.println("\n[11] - Displays how many students are currently inactive");
                    student.displayNoStudentInactive();
                    break;
                case 12:
                    System.out.println("\n[12] - Delete a student by a studentID");
                    System.out.print("Enter studentID: ");
                    studentID = input.nextInt();
                    student.deleteStudentbyID(studentID);
                    break;
                case 13:
                    System.out.println("\ndisplay");
                    student.display();
                    break;
            }
        }
    }
    
}
