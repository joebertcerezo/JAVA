/*
    File: Main.java
    Description: Conversion from Infix to Postfix
    Programmer: Joebert L. Cerezo
    Date: November 17, 2021
*/
package InfixtoPostFix;

//try infix-postfix
import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) throws Exception
    {
        Scanner input = new Scanner(System.in);
        Stacks stacks = new Stacks();
        
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
                if((stacks.top == null) || (stacks.precedence(c) > stacks.precedence(stacks.peek())))
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
                /*
                else if(stacks.precedence(c) == stacks.precedence(stacks.peek()))
                {
                    while(stacks.precedence(stacks.peek()) == stacks.precedence(c))
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
                else if(stacks.precedence(c) <= stacks.precedence(stacks.peek()))
                {
                    while(stacks.precedence(c) <= stacks.precedence(stacks.peek()))
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
    
}
