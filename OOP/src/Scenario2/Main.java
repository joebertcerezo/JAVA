/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Scenario2;

class Employee
{
  int salary = 40000;
}
class DataAnalyst extends Employee
{
  int bonus = 5000;
  int allowance = 1000;
  int deductions = 2000; 
}
class TechnicalSupport extends Employee
{
  int bonus = 3000;
  int deductions = 1500;
}

public class Main 
{
    public static void main(String[] args) 
    { 
     int totalPay = 0;
     
     DataAnalyst employee1 = new DataAnalyst();       
     totalPay = employee1.bonus + employee1.allowance + employee1.salary - employee1.deductions ;       
     
     System.out.println("Data Analyst total pay: " + totalPay);
     
     
     TechnicalSupport employee2 = new TechnicalSupport();       
     totalPay = employee2.bonus + employee2.salary - employee2.deductions ;       
     
     System.out.println("Technical Support total pay: " + totalPay);
   }
}
