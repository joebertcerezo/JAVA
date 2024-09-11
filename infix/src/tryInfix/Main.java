/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tryInfix;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        Stacks2 stacks = new Stacks2();
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Infix: ");
        String infix = input.nextLine();
        
        String postfix = "";
        for(int i = 0; i < infix.length(); i++)
        {
            char c = infix.charAt(i);
            
            if((c>='a' && c<='z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))   
            {
                postfix += c;
            }
            else if(c =='(' || c =='{'  || c =='[')
            {
                stacks.push(c);
            }
            else if(c == ')' || c == '}'  || c== ']')
            {
                if(c==')')
                {
                    while(stacks.peek()!='(')
                    {
                        postfix += stacks.pop(c);
                    }
                    stacks.pop(c);
                }
                if(c=='}')
                {
                    while(stacks.peek()!='{')
                    {
                        postfix += stacks.pop(c);
                    }
                    stacks.pop(c);
                }
                if(c==']')
                {
                    while(stacks.peek()!='[')
                    {
                        postfix += stacks.pop(c);
                    }
                    stacks.pop(c);
                }
            }
            else            
            {
               if(stacks.top == null)
                {
                    stacks.push(c);
                }
                else if(stacks.precedence(stacks.peek()) > stacks.precedence(c)) 
                {
                    while(stacks.precedence(stacks.peek()) > stacks.precedence(c))
                    {
                        postfix += stacks.pop(c);
                        if(stacks.top == null) 
                        {
                            break;
                        }
                    }
                    stacks.push(c);
                }
                else if(stacks.precedence(stacks.peek()) == stacks.precedence(c)) 
                {
                    while(stacks.precedence(stacks.peek()) == stacks.precedence(c))
                    {
                        postfix += stacks.pop(c);
                        if(stacks.top == null) 
                        {
                            break;
                        }
                    }
                    stacks.push(c);
                }
                else if(stacks.precedence(c) > stacks.precedence(stacks.peek())) 
                {
                    stacks.push(c);
                }
            }
        }
        while(stacks.top!=null)
        {
            postfix += stacks.pop(stacks.top.data);
        }
        System.out.println("Postfix: " + postfix);
                
    }
    
}
