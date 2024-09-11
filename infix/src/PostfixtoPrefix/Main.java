/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PostfixtoPrefix;

import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) throws Exception
    {
        Scanner input = new Scanner(System.in);
        Stacks stacks = new Stacks();
        
        System.out.println("\nPOSTFIX TO PREFIX");
        System.out.print("Input postfix: ");
        String postfix = input.nextLine();
        
        for(int i=0; i < postfix.length(); i++)
        {
            char c = postfix.charAt(i);
            
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
                stacks.push(c + check1 + check);
            }
        }
        
        //reverse string from stacks
        /*String finalInfix="";
        for(int i=stacks.peek().length()-1; i>=0; i--)
        {
            char c = stacks.peek().charAt(i);
            finalInfix += c;
        }*/
        System.out.println("Prefix: " + stacks.peek());
    }
    
}
