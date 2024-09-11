/*
    File: PrivateMain.java
    Description: Create 2 sets of java programs that show the application of public and private access modifiers. Class: Main, Emp_Record
    Programmer: Joebert L. Cerezo
    Date: October 25, 2021
*/
package oop1;

public class PrivateMain 
{
    public static void main(String[] args)
    {
        PrivateEmp_Record Emp1 = new PrivateEmp_Record("001", "Marian Bautista", "Clerk");
        Emp1.getEmpNum();
        Emp1.getname();
        Emp1.getdesignation();
        
        PrivateEmp_Record Emp2 = new PrivateEmp_Record("002", "Marcus Scott", "Manager");
        Emp2.getEmpNum();
        Emp2.getname();
        Emp2.getdesignation();
        
        PrivateEmp_Record Emp3 = new PrivateEmp_Record("003", "Edna McCartney", "Supervisor");
        Emp3.getEmpNum();
        Emp3.getname();
        Emp3.getdesignation();
    }
}
