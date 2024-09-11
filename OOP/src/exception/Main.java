/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        //try keyword to try the block of code
        try
        {
            System.out.println("Enter a number: ");
            int number = input.nextInt();
            
            //condition to check if input number is even or odd
            if(number%2==0)
            {
                System.out.println("The entered number is even");
            }
            else
            {
                System.out.println("The entered number is odd");
            }
        }
        
        //catch keyword to catch invalid input number
        catch(Exception e)
        {
            System.out.println("Invalid entry.");
        }
        
        //display finally after try and catch
        finally
        {
            System.out.println("Run the program again.");
        }
    }
    
}
