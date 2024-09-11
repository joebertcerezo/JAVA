/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tryInfix1;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        Stacks stacks = new Stacks();
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Infix: ");
        String infix = input.nextLine();
        
        infix = new StringBuffer(infix).reverse().toString();
        
        String prefix = "";
        for(int i = 0; i < infix.length(); i++)
        {
            char c = infix.charAt(i);
            
            if((c>='a' && c<='z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))          
            {
                prefix += c;
            }
            else if(c==')' || c=='}'  || c==']')
            {
                stacks.push(c);
            }
            else if(c=='(' || c=='{'  || c=='[')
            {
                if(infix.charAt(i)=='(')
                {
                    while(stacks.peek()!=')')
                    {
                        prefix += stacks.pop(c);
                    }
                    stacks.pop(c);
                }
                if(infix.charAt(i)=='{')
                {
                    while(stacks.peek()!='}')
                    {
                        prefix += stacks.pop(c);
                    }
                    stacks.pop(c);
                }
                if(infix.charAt(i)=='[')
                {
                    while(stacks.peek()!=']')
                    {
                        prefix += stacks.pop(c);
                    }
                    stacks.pop(c);
                }
            }
            else            
            {
                if(stacks.checkTop())
                {
                    stacks.push(c);
                }
                else if(stacks.precedence(c) < stacks.precedence(stacks.peek())) 
                {
                    prefix += stacks.pop(c);
                    while(stacks.precedence(stacks.peek()) > stacks.precedence(c))
                    {
                        prefix += stacks.pop(c);
                        if(stacks.checkTop()) 
                        {
                            break;
                        }
                    }
                    stacks.push(c);
                }
                else if(stacks.precedence(c) >= stacks.precedence(stacks.peek())) 
                {
                    stacks.push(c);
                }
            }
        }
        while(stacks.top!=null)
        {
            prefix += stacks.pop(stacks.top.data);
        }
        prefix = new StringBuffer(prefix).reverse().toString();
        System.out.println("Prefix: " + prefix);
                
    }
    
}
