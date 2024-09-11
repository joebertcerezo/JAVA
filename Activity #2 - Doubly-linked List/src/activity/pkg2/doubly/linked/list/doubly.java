/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity.pkg2.doubly.linked.list;
public class doubly 
{
    //Node declarations
    private class Node {
        Node prev;
        String lastName, firstName, course, section, status;
        int studentID, yearLevel;
        Node next;
    }

    //implement start as head in the node
    private Node start;

    //method to create new node
    private Node createNewNode(String lastName, String firstName, String course, String section, String status, int studentID, int yearLevel) throws Exception {
        Node node = new Node();

        if (node == null)
            throw new Exception("List Overflow");
        else {
            node.prev = null;
            node.lastName = lastName;
            node.firstName = firstName;
            node.course = course;
            node.section = section;
            node.status = status;
            node.studentID = studentID;
            node.yearLevel = yearLevel;
            node.next = null;
            return node;
        }
    }
    
    //method to input students record
    public void InputStudentRecord(String lastName, String firstName, String course, String section, String status, int studentID, int yearLevel) throws Exception 
    {
        Node node = createNewNode(lastName, firstName, course, section, status, studentID, yearLevel);
        Node ptr;

        if (start == null) {
            start = node;
        }
        else  {
            ptr = start;

            while (ptr.next != null) {
                ptr = ptr.next;
            }

            ptr.next = node;
            node.prev = ptr;
        }
    }
    
    //method to display all inputted data
    public void display() throws Exception 
    {
        Node ptr;
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n","studentID","lastName","firstName","course","section","yearLevel","status");
        if (start == null) {
            throw new Exception("List Underflow");
        }
        else  {
            ptr = start;

            while(ptr != null) {
                System.out.printf("%-15d%-15s%-15s%-15s%-15s%-15d%-15s\n",ptr.studentID,ptr.lastName,ptr.firstName,ptr.course,ptr.section,ptr.yearLevel,ptr.status);
                ptr = ptr.next;
            }
        }

        System.out.println();
    }
    
    //method to search student through student ID number
    public void searchbyID(int studentID) throws Exception 
    {
        Node ptr = start;

        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n","studentID","lastName","firstName","course","section","yearLevel","status");
        
        if (start == null) {
            throw new Exception("List Underflow");
        }
        else if(ptr.studentID == studentID)
        {
            System.out.printf("%-15d%-15s%-15s%-15s%-15s%-15d%-15s\n",ptr.studentID,ptr.lastName,ptr.firstName,ptr.course,ptr.section,ptr.yearLevel,ptr.status);
        }
        else 
        {
            while(ptr.studentID != studentID) 
            {
                ptr = ptr.next;
            }
            System.out.printf("%-15d%-15s%-15s%-15s%-15s%-15d%-15s\n",ptr.studentID,ptr.lastName,ptr.firstName,ptr.course,ptr.section,ptr.yearLevel,ptr.status);
        }
    }
    
    //method to search student through name either lastname or firstname
    public void searchbyName(String name) throws Exception 
    {
        Node ptr = start;

        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n","studentID","lastName","firstName","course","section","yearLevel","status");
        
        if (start == null) {
            throw new Exception("List Underflow");
        }
        else if(ptr.firstName.equalsIgnoreCase(name) || ptr.lastName.equalsIgnoreCase(name))
        {
            System.out.printf("%-15d%-15s%-15s%-15s%-15s%-15d%-15s\n",ptr.studentID,ptr.lastName,ptr.firstName,ptr.course,ptr.section,ptr.yearLevel,ptr.status);
        }
        else 
        {
            while(!(ptr.firstName.equalsIgnoreCase(name) || ptr.lastName.equalsIgnoreCase(name))) 
            {
                ptr = ptr.next;
            }
            System.out.printf("%-15d%-15s%-15s%-15s%-15s%-15d%-15s\n",ptr.studentID,ptr.lastName,ptr.firstName,ptr.course,ptr.section,ptr.yearLevel,ptr.status);
        }
    }
    
    //method to search student through course
    public void searchbyCourse(String course) throws Exception 
    {
        Node ptr = start;

        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n","studentID","lastName","firstName","course","section","yearLevel","status");
        
        if (start == null) {
            throw new Exception("List Underflow");
        }
        else 
        {
            while(ptr != null) 
            {
                if(ptr.course.equalsIgnoreCase(course))
                {
                    System.out.printf("%-15d%-15s%-15s%-15s%-15s%-15d%-15s\n",ptr.studentID,ptr.lastName,ptr.firstName,ptr.course,ptr.section,ptr.yearLevel,ptr.status);
                }
                ptr = ptr.next;
            }
        }
    }
    
    
    //method to display student through year level
    public void displayByyearLevel(int yearLevel) throws Exception 
    {
        Node ptr = start;

        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n","studentID","lastName","firstName","course","section","yearLevel","status");
        
        if (start == null) {
            throw new Exception("List Underflow");
        }
        else
        {
            /*
        while(ptr.yearLevel == yearLevel)
            {
                System.out.println(ptr.studentID + "  " + ptr.lastName + "  " + ptr.firstName + "  " + ptr.course + "  " + ptr.section + "  " + ptr.yearLevel + "  " + ptr.status + "  ");
                ptr = ptr.next;
            }
        }
            */
            while(ptr != null)
            {
                if(ptr.yearLevel == yearLevel)
                {
                    System.out.printf("%-15d%-15s%-15s%-15s%-15s%-15d%-15s\n",ptr.studentID,ptr.lastName,ptr.firstName,ptr.course,ptr.section,ptr.yearLevel,ptr.status);
                }
                ptr = ptr.next;
            }
        }
    }
    
    //method to display student through course
    public void displayNoStudentByCourse(String course) throws Exception
    {
        Node ptr = start;
        int count=0;
        
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n","studentID","lastName","firstName","course","section","yearLevel","status");
        
        if (start == null) {
            throw new Exception("List Underflow");
        }
        else
        {
        ptr = start;
            while(ptr != null) 
            {
                if(ptr.course.equalsIgnoreCase(course))
                {
                    System.out.printf("%-15d%-15s%-15s%-15s%-15s%-15d%-15s\n",ptr.studentID,ptr.lastName,ptr.firstName,ptr.course,ptr.section,ptr.yearLevel,ptr.status);
                    count++;
                }
                ptr = ptr.next;
            }
            System.out.println(count + " students enrolled in " + course);
        }
    }
    
    //method to display no of students that are active
    public void displayNoStudentActive() throws Exception
    {
        Node ptr = start;
        int count = 0;
        
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n","studentID","lastName","firstName","course","section","yearLevel","status");
        
        if (start == null) {
            throw new Exception("List Underflow");
        }
        else 
        {
            while(ptr != null) 
            {
                if(ptr.status.equalsIgnoreCase("active"))
                {
                    System.out.printf("%-15d%-15s%-15s%-15s%-15s%-15d%-15s\n",ptr.studentID,ptr.lastName,ptr.firstName,ptr.course,ptr.section,ptr.yearLevel,ptr.status);
                    count++;
                }
                ptr = ptr.next;
            }
            System.out.println("Total number of Active Students: " + count);
        }
        
    }
    
    //method to display no of students that are not active
    public void displayNoStudentInactive() throws Exception
    {
        Node ptr = start;
        int count = 0;
        
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n","studentID","lastName","firstName","course","section","yearLevel","status");
        
        if (start == null) {
            throw new Exception("List Underflow");
        }
        else 
        {
            while(ptr != null) 
            {
                if(ptr.status.contains("not".toUpperCase()))
                {
                    System.out.printf("%-15d%-15s%-15s%-15s%-15s%-15d%-15s\n",ptr.studentID,ptr.lastName,ptr.firstName,ptr.course,ptr.section,ptr.yearLevel,ptr.status);
                    count++;
                }
                ptr = ptr.next;
            }
            System.out.println("Total number of Inactive Students: " + count);
        }
        
    }
    
    //method to delete student through ID number
    public void deleteStudentbyID(int studentID) throws Exception
    {
        Node ptr = start;
        
        if(start.next == null)
        {
            System.out.println("Student ID " + start.studentID + " deleted.");
            start = null;
        }
        else if(ptr.studentID == studentID)
        {
            System.out.println("Student ID " + ptr.studentID + " deleted.");
            start = start.next;
            start.prev =  null;
        }
        else
        {
            while(ptr.studentID != studentID)
            {
                ptr = ptr.next;
            }
            if(ptr.next == null)
            {
                System.out.println("Student ID " + ptr.studentID + " deleted.");
                ptr.prev.next = null;
            }
            else
            {
            System.out.println("Student ID " + ptr.studentID + " deleted.");
            ptr.prev.next = ptr.next;
            ptr.next.prev = ptr.prev;
            }
        }
        
    }
    
    //sort student through year level
    public void sortbyYearLevel() throws Exception
    {
        Node temp = new Node();
        
        for(Node ptr = start; ptr != null; ptr = ptr.next)
        {
            Node min = ptr;
            for(Node preptr = ptr; preptr != null; preptr = preptr.next)
            {
                if(min.yearLevel > preptr.yearLevel)
                {
                    min = preptr;
                }
            }
            temp.yearLevel = ptr.yearLevel; temp.studentID = ptr.studentID; temp.lastName = ptr.lastName; temp.firstName = ptr.firstName; temp.course = ptr.course; temp.section = ptr.section; temp.status = ptr.status;                
            ptr.yearLevel = min.yearLevel; ptr.studentID = min.studentID; ptr.lastName = min.lastName; ptr.firstName = min.firstName; ptr.course = min.course; ptr.section = min.section; ptr.status = min.status;                
            min.yearLevel = temp.yearLevel; min.studentID = temp.studentID; min.lastName = temp.lastName; min.firstName = temp.firstName; min.course = temp.course; min.section = temp.section; min.status = temp.status;                
        }
        display();
    }
    
    //sort student through IDnumber
    public void sortbystudentID() throws Exception
    {
        Node temp = new Node();
        
        for(Node ptr = start; ptr != null; ptr = ptr.next)
        {
            Node min = ptr;
            for(Node preptr = ptr; preptr != null; preptr = preptr.next)
            {
                if(min.studentID > preptr.studentID)
                {
                    min = preptr;
                }
            }
            temp.yearLevel = ptr.yearLevel; temp.studentID = ptr.studentID; temp.lastName = ptr.lastName; temp.firstName = ptr.firstName; temp.course = ptr.course; temp.section = ptr.section; temp.status = ptr.status;                
            ptr.yearLevel = min.yearLevel; ptr.studentID = min.studentID; ptr.lastName = min.lastName; ptr.firstName = min.firstName; ptr.course = min.course; ptr.section = min.section; ptr.status = min.status;                
            min.yearLevel = temp.yearLevel; min.studentID = temp.studentID; min.lastName = temp.lastName; min.firstName = temp.firstName; min.course = temp.course; min.section = temp.section; min.status = temp.status;                
        }
        display();
    }
    
    //sort student through course using selection sort
    public void sortbycourse() throws Exception
    {
        Node temp = new Node();
        
        for(Node ptr = start; ptr != null; ptr = ptr.next)
        {
            Node min = ptr;
            for(Node preptr = ptr; preptr != null; preptr = preptr.next)
            {
                if(min.course.compareTo(preptr.course) > 0)
                {
                    min = preptr;
                }
            }
            temp.yearLevel = ptr.yearLevel; temp.studentID = ptr.studentID; temp.lastName = ptr.lastName; temp.firstName = ptr.firstName; temp.course = ptr.course; temp.section = ptr.section; temp.status = ptr.status;                
            ptr.yearLevel = min.yearLevel; ptr.studentID = min.studentID; ptr.lastName = min.lastName; ptr.firstName = min.firstName; ptr.course = min.course; ptr.section = min.section; ptr.status = min.status;                
            min.yearLevel = temp.yearLevel; min.studentID = temp.studentID; min.lastName = temp.lastName; min.firstName = temp.firstName; min.course = temp.course; min.section = temp.section; min.status = temp.status;                
        }
        display();
    }
    
    
    //check ID number if already registered
    public int checkID(int studentID) throws Exception
    {
        Node ptr = start;
        int count = 0;
        
        while(ptr != null)
        {
            if(ptr.studentID == studentID)
            {
                count++;
            }
            ptr = ptr.next;
        }
        
        return count;
    }
}
