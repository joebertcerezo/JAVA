/*
    File: Main.java
    Description: Final conversion
    Programmer: Joebert L. Cerezo
    Date: November 17, 2021
*/
package finalinfix;

import java.util.Scanner;
public class FinalInfix 
{
    public static void main(String[] args) throws Exception
    {
       Scanner input = new Scanner(System.in);
       menu();     
    }
    public static void menu() throws Exception
    {
        Scanner input = new Scanner(System.in);
        System.out.println("\n -------------------------");
        System.out.println("| [1] - Infix to Prefix   |");
        System.out.println("| [2] - Prefix to Infix   |");
        System.out.println("| [3] - Infix to Postfix  |");
        System.out.println("| [4] - Postfix to Infix  |");
        System.out.println("| [5] - Prefix to Postfix |");
        System.out.println("| [6] - Postfix to Prefix |");
        System.out.println("| [0] - Exit              |");
        System.out.println(" -------------------------");
        System.out.print("Enter number: ");
        int choice = input.nextInt();
        
        switch(choice)
        {
            case 1:
                InfixtoPrefix();
                menu();
                break;
            case 2:
                PrefixtoInfix();
                menu();
                break;
            case 3:
                InfixtoPostfix();
                menu();
                break;
            case 4:
                PostfixtoInfix();
                menu();
                break;
            case 5:
                PrefixtoPostfix();
                menu();
                break;
            case 6:
                PostfixtoPrefix();
                menu();
                break;
            case 0:
                break;
        }
    }
    
    public static void InfixtoPrefix() throws Exception
    {
        Scanner input = new Scanner(System.in);
        Stacks stacks = new Stacks();
        
        System.out.println("\nINFIX TO PREFIX");
        System.out.print("Input infix: ");
        String infix = input.nextLine();
        
        String prefix = "";
        
        //reverse string
        for(int i=infix.length()-1; i>=0; i--)
        {
            char c = infix.charAt(i);
            
            if((c>='a' && c<='z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))
            {
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
                /*if(stacks.top == null)
                {
                    stacks.push(c);
                }
                */
                if((stacks.top == null) || (stacks.Prefixprecedence(c) >= stacks.Prefixprecedence(stacks.peek())))
                {
                    stacks.push(c);
                }
                /*
                else if(c=='-' && stacks.peek()=='+')
                {
                    while(!(c=='-' && stacks.peek()=='+'))
                    {
                        char check = stacks.peek();
                        postfix+=check;
                        stacks.pop();
                    }
                    stacks.pop();
                }
                else if(c=='/' && stacks.peek()=='*')
                {
                    while(!(c=='/' && stacks.peek()=='*'))
                    {
                        char check = stacks.peek();
                        postfix+=check;
                        stacks.pop();
                    }
                    stacks.pop();
                }
                */
                
                else if(stacks.Prefixprecedence(c) < stacks.Prefixprecedence(stacks.peek()))
                {
                    while(stacks.Prefixprecedence(c) < stacks.Prefixprecedence(stacks.peek()))
                    {
                        char check = stacks.peek();
                        prefix+=check;
                        stacks.pop();
                        if(stacks.top == null)
                        {
                            break;
                        }
                    }
                    stacks.push(c);
                }
            }
        }
        while(stacks.top != null)
        {
            char check = stacks.peek();
            prefix+=check;
            stacks.pop();
            if(stacks.top == null)
            {
                break;
            }
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
    
    public static void PrefixtoInfix() throws Exception
    {
        Scanner input = new Scanner(System.in);
        StringStacks stacks = new StringStacks();
        
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
    
    public static void InfixtoPostfix() throws Exception
    {
        Scanner input = new Scanner(System.in);
        Stacks stacks = new Stacks();
        
        System.out.println("\nINFIX TO POSTFIX");
        System.out.print("Input infix: ");
        String infix = input.nextLine();
        
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
                /*if(stacks.top == null)
                {
                    stacks.push(c);
                }
                */
                if((stacks.top == null) || (stacks.Postfixprecedence(c) > stacks.Postfixprecedence(stacks.peek())))
                {
                    stacks.push(c);
                }
                /*
                else if(c=='-' && stacks.peek()=='+')
                {
                    while(!(c=='-' && stacks.peek()=='+'))
                    {
                        char check = stacks.peek();
                        postfix+=check;
                        stacks.pop();
                    }
                    stacks.pop();
                }
                else if(c=='/' && stacks.peek()=='*')
                {
                    while(!(c=='/' && stacks.peek()=='*'))
                    {
                        char check = stacks.peek();
                        postfix+=check;
                        stacks.pop();
                    }
                    stacks.pop();
                }
                */
                /*else if(stacks.Postfixprecedence(c) == stacks.Postfixprecedence(stacks.peek()))
                {
                    while(stacks.Postfixprecedence(stacks.peek()) == stacks.Postfixprecedence(c))
                    {
                        char check = stacks.peek();
                        postfix+=check;
                        stacks.pop();
                        if(stacks.top == null)
                        {
                            break;
                        }
                    }
                    stacks.push(c);
                }
                */
                else if(stacks.Postfixprecedence(c) <= stacks.Postfixprecedence(stacks.peek()))
                {
                    while(stacks.Postfixprecedence(c) <= stacks.Postfixprecedence(stacks.peek()))
                    {
                        char check = stacks.peek();
                        postfix+=check;
                        stacks.pop();
                        if(stacks.top == null)
                        {
                            break;
                        }
                    }
                    stacks.push(c);
                }
            }
        }
        while(stacks.top != null)
        {
            char check = stacks.peek();
            postfix+=check;
            stacks.pop();
            if(stacks.top == null)
            {
                break;
            }
        }
        System.out.println("Postfix: " + postfix);
    }
    
    public static void PostfixtoInfix() throws Exception
    {
        Scanner input = new Scanner(System.in);
        StringStacks stacks = new StringStacks();
        
        System.out.println("\nPOSTFIX TO INFIX");
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
                stacks.push("(" + check1 + c + check + ")");
            }
        }
        
        //reverse string from stacks
        /*String finalInfix="";
        for(int i=stacks.peek().length()-1; i>=0; i--)
        {
            char c = stacks.peek().charAt(i);
            finalInfix += c;
        }*/
        System.out.println("Infix: " + stacks.peek());
    }
    
    public static void PostfixtoPrefix() throws Exception
    {
        Scanner input = new Scanner(System.in);
        StringStacks stacks = new StringStacks();
        
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
    
    public static void PrefixtoPostfix() throws Exception
    {
        Scanner input = new Scanner(System.in);
        StringStacks stacks = new StringStacks();
        
        System.out.println("\nPREFIX TO POSTFIX");
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
                stacks.push(check + check1 + c);
            }
        }
        
        System.out.println("Postfix: " + stacks.peek());
    }
}
