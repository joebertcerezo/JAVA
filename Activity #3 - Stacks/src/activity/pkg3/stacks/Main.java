/*
    File: Main.java
    Description: Create a stack application that converts an infix to prefix, and infix to post fix. Before the conversion your program should:

                    Step 1: Input an expression
                    Step 2: Check the parenthesis, if balanced parenthesis , proceed to step 3 else back to step 1.
                    Step 3: Remove any space/blank in the expression. (Example: From A ( B + C ) to A(B+C) You cannot proceed to step 4 if an expression has a space/blank, even a single space/blank.
                    Step 4: Display the expression (epxression without space/blank)
                    Step 5: Convert the expression to postfix and prefix.
                    Step 6: Display the result of prefix.
                    Step 7: Display the result of postfix.

                    You should have methods for checking if the parenthesis is balanced or not, and the conversion to postfix and prefix.
    Programmer: Joebert L. Cerezo
    Date: Novembert 22, 2021
*/
package activity.pkg3.stacks;

import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) throws Exception
    {
        //method call parentheses check
        ParenthesesCheck();
    }
    
    public static void ParenthesesCheck() throws Exception
    {
        Scanner input =  new Scanner(System.in);
        
        //create object stacks on class Stacks
        Stacks checker = new Stacks();
        
        System.out.print("\nInput infix: ");
        String infix = input.nextLine();
        
        //for loop to separate character on String
        for(int i = 0; i < infix.length(); i++)
        {
            //initialize character on char c variable
            char c = infix.charAt(i);
            
            //condition to check if incoming char is an open braces, parentheses or brackets
            if(c == '(' || c == '{' || c == '[')
            {
                //push to stacks
                checker.push(c);
            }
            
            //condition to check if incoming char is an closing braces, parentheses or brackets
            else if (c == ')' || c == '}' || c == ']')
            {
                //condition to check if incoming char is equal to current element on stack
                if(c == ')' && checker.peek() == '(')
                {
                    checker.pop();
                }
                if(c == '}' && checker.peek() == '{')
                {
                    checker.pop();
                }
                if(c == ']' && checker.peek() == '[')
                {
                    checker.pop();
                }
            }
        }
            //condition to check if stacks is empty or not
            if(checker.empty())
            {
                System.out.println("Balanced Parentheses");
                Stacks stacks = new Stacks();
                String output = "";
                
                //for loop to separate char on Strings
                for(int i=0; i<infix.length(); i++)
                {
                    char c = infix.charAt(i);
                    
                    //condition to check if there is white spaces or blank character on string
                    if(c==' ')
                    {
                        //push white spaces to stacks
                        stacks.push(c);
                    }
                    else
                    {
                        //add character to output excluding the white spaces
                        output+=c;
                    }
                }
                
                //while loop to remove all white spaces in stacks
                while(!stacks.empty())
                {
                    stacks.pop();
                }
                
                System.out.println("Infix: " + output);
                
                //method call that converts Infix to Prefix
                InfixtoPrefix(output);
                
                //method call that converts Infix to Postfix
                InfixtoPostfix(output);
            }
            else
            {
                System.out.println("Unbalanced Parentheses");
                
                //call again the method ParenthesesCheck if not balanced parentheses
                ParenthesesCheck();
            }
    }
    
    //method to convert infix to prefix
    public static void InfixtoPrefix(String infix) throws Exception
    {
        Scanner input = new Scanner(System.in);
        Stacks stacks = new Stacks();
        
        String prefix = "";
        
        //reverse string
        for(int i=infix.length()-1; i>=0; i--)
        {
            char c = infix.charAt(i);
            
            //condition to check if characters on Strings is an operand
            if((c>='a' && c<='z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))
            {
                //add to output string all operand
                prefix+=c;
            }
            else if(c ==')' || c =='}'  || c ==']')
            {
                stacks.push(c);
            }
            else if(c =='(' || c =='{'  || c =='[')
            {
                if(c =='(')
                {
                    while(stacks.peek()!=')')
                    {
                        char check = stacks.peek();
                        prefix+=check;
                        stacks.pop();
                    }
                    stacks.pop();
                }
                if(c =='{')
                {
                    while(stacks.peek()!='}')
                    {
                        char check = stacks.peek();
                        prefix+=check;
                        stacks.pop();
                    }
                    stacks.pop();
                }
                if(c =='[')
                {
                    while(stacks.peek()!=']')
                    {
                        char check = stacks.peek();
                        prefix+=check;
                        stacks.pop();
                    }
                    stacks.pop();
                }
            }
            else
            {
                if((stacks.empty()) || (stacks.Precedence(c) >= stacks.Precedence(stacks.peek())))
                {
                    stacks.push(c);
                }
                else if(stacks.Precedence(c) < stacks.Precedence(stacks.peek()))
                {
                    while(stacks.Precedence(c) < stacks.Precedence(stacks.peek()))
                    {
                        char check = stacks.peek();
                        prefix+=check;
                        stacks.pop();
                        if(stacks.empty())
                        {
                            break;
                        }
                    }
                    stacks.push(c);
                }
            }
        }
        while(!stacks.empty())
        {
            char check = stacks.peek();
            prefix+=check;
            stacks.pop();
        }
        
        //reverse again string
        String finalprefix="";
        for(int i=prefix.length()-1; i>=0; i--)
        {
            char c = prefix.charAt(i);
            finalprefix+=c;
        }
        System.out.println("Prefix: " + finalprefix);
    }
    
    public static void InfixtoPostfix(String infix) throws Exception
    {
        Scanner input = new Scanner(System.in);
        Stacks stacks = new Stacks();
        
        String postfix = "";
        
        for(int i=0; i<infix.length(); i++)
        {
            char c = infix.charAt(i);
            
            if((c>='a' && c<='z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))
            {
                postfix+=c;
            }
            else if(c =='(' || c =='{'  || c =='[')
            {
                stacks.push(c);
            }
            else if(c ==')' || c =='}'  || c ==']')
            {
                if(c ==')')
                {
                    while(stacks.peek()!='(')
                    {
                        char check = stacks.peek();
                        postfix+=check;
                        stacks.pop();
                    }
                    stacks.pop();
                }
                if(c =='}')
                {
                    while(stacks.peek()!='{')
                    {
                        char check = stacks.peek();
                        postfix+=check;
                        stacks.pop();
                    }
                    stacks.pop();
                }
                if(c ==']')
                {
                    while(stacks.peek()!='[')
                    {
                        char check = stacks.peek();
                        postfix+=check;
                        stacks.pop();
                    }
                    stacks.pop();
                }
            }
            else
            {
                if((stacks.empty()) || (stacks.Precedence(c) > stacks.Precedence(stacks.peek())))
                {
                    stacks.push(c);
                }
                else if(stacks.Precedence(c) <= stacks.Precedence(stacks.peek()))
                {
                    while(stacks.Precedence(c) <= stacks.Precedence(stacks.peek()))
                    {
                        char check = stacks.peek();
                        postfix+=check;
                        stacks.pop();
                        if(stacks.empty())
                        {
                            break;
                        }
                    }
                    stacks.push(c);
                }
            }
        }
        while(!stacks.empty())
        {
            char check = stacks.peek();
            postfix+=check;
            stacks.pop();
        }
        System.out.println("Postfix: " + postfix);
    }
}
