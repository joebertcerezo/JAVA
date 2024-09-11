/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrefixtoInfix;

import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) throws Exception
    {
        Scanner input = new Scanner(System.in);
        Stacks stacks = new Stacks();
        
        System.out.println("\nPREFIX TO INFIX");
        System.out.print("Input prefix: ");
        String prefix = input.nextLine();
        
        for(int i=prefix.length()-1; i>=0; i--)
        {
            char c = prefix.charAt(i);
            
            if((c>='a' && c<='z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))
            {
                stacks.push(c + "");
            }
            else
            {
                String check = stacks.peek();
                stacks.pop();
                String check1 = stacks.peek();
                stacks.pop();
                stacks.push("(" + check + c + check1 + ")");
            }
        }
        
        System.out.println("Infix: " + stacks.peek());
    }
    
}
