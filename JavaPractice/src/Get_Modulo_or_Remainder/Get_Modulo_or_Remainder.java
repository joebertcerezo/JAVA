/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Get_Modulo_or_Remainder;

import java.util.Scanner;
import java.io.PrintStream;

/**
 *
 * @author CEREZO
 */
public class Get_Modulo_or_Remainder 
{
    public static void main(String[] args) 
    {
        PrintStream System_gawas = new PrintStream(System.out);
        Scanner input = new Scanner(System.in);
        
        System_gawas.print("Enter number: ");
        int dividend = input.nextInt();
        
        System_gawas.print("Enter number2: ");
        int divisor = input.nextInt();
        
        int modulo = dividend % divisor;
        System_gawas.println("modulo using modulo operator: " + modulo); 
        
        //using subtraction
        int quotient = dividend/divisor; //get quotient first
        int answer = dividend-(quotient*divisor); //subtract quotient multiply by divisor to dividend
        System_gawas.println("\n[1]manual using modulo: " + answer);
        
        //using divide and multiply
        double divide = ((double)dividend / (double)divisor); //divide first
//        System.out.println(divide);
        double getRemainder = (divide-(int)divide); //get decimal
//        System.out.println(getRemainder);
        System_gawas.println("[2]manual using modulo: " + String.format("%.0f", getRemainder*divisor)); // decimal multiply divisor
        
        
//        System.out.println("enter number: ");
//        int num = input.nextInt();
//        
//        switch(num)
//        {
//            case 1:
//                System.out.println("a");
//            case 2: 
//                System.out.println("b");
//                break;
//            default:
//                System.out.println("c");
//        }
    }
}
