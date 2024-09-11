/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_Quiz_3_2;

/**
 *
 * @author Aim
 */
public class StudentInfo 
{
    public String name, gradeLevel, adviser;
    private int IdNum, age;
    private String address, birthdate, guardian, contactNo;
    
    public StudentInfo(int IdNum, String name, String address, String birthdate, int age, String guardian, String contactNo, String gradeLevel, String adviser)
            {
                this.IdNum = IdNum;
                this.name = name;
                this.address = address;
                this.birthdate = birthdate;
                this.age = age;
                this.guardian = guardian;
                this.contactNo = contactNo;
                this.gradeLevel = gradeLevel;
                this.adviser = adviser;
            }
    public void displayname()
    {
        System.out.println("Name: " + this.name);
    }
    
     public void displaygradeLevel()
    {
        System.out.println("Grade Level: " + this.gradeLevel);
    }
     
      public void displayadviser()
    {
        System.out.println("Adviser: " + this.adviser);
    }
    
    public void setIdNum(int IdNum)
    {
        this.IdNum = IdNum;
    }
    
    public int getIdNum()
    {
        System.out.println("Id number: " + this.IdNum);
        return this.IdNum;
    }
    
    public void setage(int age)
    {
        this.age = age;
    }
    
    public int getage()
    {
        System.out.println("Age: " + this.age);
        return this.age;
    }
    
    public void setaddress(String address)
    {
        this.address = address;
    }
    
    public String getaddress()
    {
        System.out.println("Address: " + this.address);
        return this.address;
    }
    
    public void setbirthdate(String birthdate)
    {
        this.birthdate = birthdate;
    }
    
    public String getbirthdate()
    {
        System.out.println("Birthdate: " + this.birthdate);
        return this.birthdate;
    }
    
    public void setguardian(String guardian)
    {
        this.guardian = guardian;
    }
    
    public String getguardian()
    {
        System.out.println("Guardian: " + this.guardian);
        return this.guardian;
    }
    
    public void setcontactNo(String contactNo)
    {
        this.contactNo = contactNo;
    }
    
    public String getcontactNo()
    {
        System.out.println("Contact #: " + this.contactNo);
        return this.contactNo;
    }
    
}
