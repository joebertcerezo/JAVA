/*
    File: Emp_Record.java
    Description: Create 2 sets of java programs that show the application of public and private access modifiers. Class: Main, Emp_Record
    Programmer: Joebert L. Cerezo
    Date: October 25, 2021
*/
package oop;

public class Emp_Record 
{
    String EmpNum, name, designation;
    
    public Emp_Record(String EmpNum, String name, String designation)
            {
                this.EmpNum = EmpNum;
                this.name = name;
                this.designation = designation;
            }
    
    public void displayEmp_Record()
    {
        System.out.println("Employee number: " + this.EmpNum);
        System.out.println("Employee Name: " + this.name);
        System.out.println("Employee's Designation: " + this.designation);
    }
}
