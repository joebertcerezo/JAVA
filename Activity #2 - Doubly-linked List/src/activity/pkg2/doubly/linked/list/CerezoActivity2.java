/*
    File: CerezoActivity2.java
    Description: Write a menu based program for a XYZ Academy(you can name your own) that implement the following functionalities in a doubly-linked list:
                    1 – Input Student Record
                    2 - Search student records by ID
                    3 - Search students by name
                    4 - Search students by course
                    5 - Dislays student based on year level
                    6 - Displays all students in ascending order based on year level
                    7 - Displays all students in ascending order based on studentID
                    8 - Displays all the courses in ascending order
                    9 - Display how many students are currently enrolled in a particular course
                    10 - Displays how many students are currently active
                    11 - Displays how many students are currently inactive
                    12 - Delete a student by a studentID
                    0 – Exit

                    Your program should have the following constraints:
                    - The studentID should be unique, e.g., your program should not accept any record with an existing student ID number.
                    - Searching for the name should be case insensitive include the last name and first name, e.g., if you search for the name “Arroyo”, it should appear either in the last name or first name, or both.
                    - Searching for the course should be case insensitive and you have to use acronyms only, e.g., BSIT, BSIS, BSCS
                    - Year level ranges only from 1 to 4 only, any other year should consider an error.
                    - The status should only be “active” or “not active”.
                    - When displaying, the record should be converted all to uppercase
                    - For sorting, DON'T use any predefined prepackage

                    Variables are: studentID, lastName, firstName, course, section, yearLevel, and status
    Programmer: Joebert L. Cerezo
    Date: Novembert 3, 2021
*/
package activity.pkg2.doubly.linked.list;

import java.util.Scanner;
public class CerezoActivity2
{
    public static void main(String[] args) throws Exception
    {
        Scanner input = new Scanner(System.in);
        
        //create object on class doubly
        doubly student = new doubly();
        System.out.print("CEREZO Academia");
        int choice = -1;
        
        //while loop to loop menu
        while(choice!=0)
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
                //case to input student records
                case 1:
                    System.out.println("\n[1] - Input Student Record");
                    System.out.print("Enter studentID: ");
                    int studentID = input.nextInt();
                    student.checkID(studentID);
                    if(student.checkID(studentID)>0)
                    {
                        System.out.println(studentID + " already Existed.");
                        break;
                    }
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
                    if(yearLevel>4 || yearLevel<=0)
                    {
                        System.out.println("Invalid yearLevel.");
                        break;
                    }
                    System.out.print("Enter status (ACTIVE/NOT ACTIVE): ");
                    String status = input.nextLine().toUpperCase();
                    status = input.nextLine().toUpperCase();
                    if(!(status.equalsIgnoreCase("not active") || status.equalsIgnoreCase("active")))
                    {
                        System.out.println("Invalid Input");
                        break;
                    }
                    student.InputStudentRecord(lastName, firstName, course, section, status, studentID, yearLevel);
                    break;
                
                //case to search student records through ID number
                case 2:
                    System.out.println("\n[2] - Search student records by ID");
                    System.out.print("Enter studentID: ");
                    studentID = input.nextInt();
                    student.searchbyID(studentID);
                    break;
                    
                //case to seach student records through name
                case 3:
                    System.out.println("\n[3] - Search students by name");
                    System.out.print("Enter firstName or lastName: ");
                    String name = input.nextLine();
                    name = input.nextLine();
                    student.searchbyName(name);
                    break;
                
                //case to seach student records through course
                case 4:
                    System.out.println("\n[4] - Search students by course");
                    System.out.print("Enter course: ");
                    course = input.next();
                    student.searchbyCourse(course);
                    break;
                
                //case to display student based on year level
                case 5:
                    System.out.println("\n[5] - Dislays student based on year level");
                    System.out.print("Enter yearLevel: ");
                    yearLevel = input.nextInt();
                    student.displayByyearLevel(yearLevel);
                    break;
                
                //case to display all students in ascending order based on year level
                case 6:
                    System.out.println("\n[6] - Displays all students in ascending order based on year level");
                    student.sortbyYearLevel();
                    break;
                
                //case to display all students in ascending order based on studentID
                case 7:
                    System.out.println("\n[7] - Displays all students in ascending order based on studentID");
                    student.sortbystudentID();
                    break;
                
                //case to display all the courses in ascending order
                case 8:
                    System.out.println("\n[8] - Displays all the courses in ascending order");
                    student.sortbycourse();
                    break;
                
                //case to Display how many students are currently enrolled in a particular course
                case 9:
                    System.out.println("\n[9] - Display how many students are currently enrolled in a particular course");
                    System.out.print("Enter course: ");
                    course = input.nextLine().toUpperCase();
                    course = input.nextLine().toUpperCase();
                    student.displayNoStudentByCourse(course);
                    break;
                
                //case to Displays how many students are currently active
                case 10:
                    System.out.println("\n[10] - Displays how many students are currently active");
                    student.displayNoStudentActive();
                    break;
                
                //case to Displays how many students are currently inactive
                case 11:
                    System.out.println("\n[11] - Displays how many students are currently inactive");
                    student.displayNoStudentInactive();
                    break;
                
                //case to Delete a student by a studentID
                case 12:
                    System.out.println("\n[12] - Delete a student by a studentID");
                    System.out.print("Enter studentID: ");
                    studentID = input.nextInt();
                    student.deleteStudentbyID(studentID);
                    break;
                
                //display all data inputted
                case 13:
                    System.out.println("\ndisplay");
                    student.display();
                    break;
                
                //case when choice is more than 13.
                default: 
                    System.out.println("Invalid Input.");
            }
        }
    }
}

