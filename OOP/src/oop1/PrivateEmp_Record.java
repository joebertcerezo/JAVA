/*
    File: PrivateEmp_Record.java
    Description: Create 2 sets of java programs that show the application of public and private access modifiers. Class: Main, Emp_Record
    Programmer: Joebert L. Cerezo
    Date: October 25, 2021
*/
package oop1;

public class PrivateEmp_Record 
{
    private String EmpNum, name, designation;
    
    public PrivateEmp_Record(String EmpNum, String name, String designation)
            {
                this.EmpNum = EmpNum;
                this.name = name;
                this.designation = designation;
            }
    
    public void setEmpNum(String EmpNum)
    {
        this.EmpNum = EmpNum;
    }
    
    public String getEmpNum()
    {
        System.out.println("Employee number: " + EmpNum);
        return this.EmpNum;
    }
    
    public void setname(String name)
    {
        this.name = name;
    }
    
    public String getname()
    {
        System.out.println("Employee Name: " + name);
        return this.name;
    }
    
    public void setdesignation(String designation)
    {
        this.designation = designation;
    }
    
    public String getdesignation()
    {
        System.out.println("Employee's Designation: " + designation);
        return this.designation;
    }
}
