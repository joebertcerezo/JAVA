/*
    File: Main.java
    Description: Create 2 sets of java programs that show the application of public and private access modifiers. Class: Main, Emp_Record
    Programmer: Joebert L. Cerezo
    Date: October 25, 2021
*/
package oop;

public class Main 
{
    public static void main(String[] args)
    {
        Emp_Record Emp1 = new Emp_Record("001", "Marian Bautista", "Clerk");
        Emp1.displayEmp_Record();
        
        Emp_Record Emp2 = new Emp_Record("002", "Marcus Scott", "Manager");
        Emp2.displayEmp_Record();
        
        Emp_Record Emp3 = new Emp_Record("003", "Edna McCartney", "Supervisor");
        Emp3.displayEmp_Record();
    }
}
