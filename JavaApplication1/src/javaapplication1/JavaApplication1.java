/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;
import java.util.Scanner;

/**
 *
 * @author CEREZO
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner (System.in);
        int number;
        
        //Ask user for name in String data type
        /*
        System.out.print("Your name?: ");
        String name = input.nextLine();
        
        System.out.println("Your name is " +name);
        */
        
        //Ask user input number, and stop when inputs number 9
        /*
        do
        {
            System.out.print("Enter number: ");
            number = input.nextInt();
        }while (number != 9);
        */
        
        //Swrich statements using string in cases
        /*System.out.print("Enter you team: ");
        String team = input.next();
        */
        /*switch(team)
        {
            case "hotdog":
                System.out.println("You are team hotdog");
                break;
            case "ham":
                System.out.println("You are team ham");
                break;
            case "cheese":
                System.out.println("You are team cheese");
                break;
            case "egg":
                System.out.println("You are team egg");
                break;
            default:
                for(;;)
                {
                System.out.println("Team not available");
                }
        }
        */
        
        final int ar = 10;
        
        System.out.print(ar);
        
        
    }
    
}
