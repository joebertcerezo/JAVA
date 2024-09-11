/*
    File: CEREZO_SemiFinal.java
    Description: SemiFInal OOP
    Programmer: Joebert L. Cerezo
    Date: December 13, 2021
*/
package Semi.Final.OOP;

import java.util.Scanner;
public class CEREZO_SemiFinal 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Convert Inches into ....");
        System.out.println("Type M for Meter <in to m>....");
        System.out.println("Type F is for Foot <in to ft> ....");
        char choice = input.next().charAt(0);
        
        //try keyword to try the block of code
        try
        {
            //swtich statement to check input from user
            switch(choice)
            {
                case 'm':
                case 'M':
                    System.out.println("Input a value for inch: ");
                    double inch = input.nextDouble();

                    System.out.println(inch + " inch/es is " + String.format("%.3f", inch/39.37)  + " meter/s");
                    break;
                case 'f':
                case 'F':
                    System.out.println("Input a value for inch: ");
                    inch = input.nextDouble();

                    System.out.println(inch + " inch/es is " + inch/12 + " ft.");
                    break;
            }
            
        }
        
        //catch keyword to catch invalid input number
        catch(Exception e)
        {
            System.out.println("Invalid value.");
        }
        
        //display finally after try and catch
        finally
        {
            switch(choice)
            {
                case 'm':
                case 'M':
                case 'f':
                case 'F':
                    System.out.println("Execution done!");
                    break;
                default:
                    System.out.println("Invalid entry or option. Program Execution Done.");
                    break;
            }
        }
    }
    
}
