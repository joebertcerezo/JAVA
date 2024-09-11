/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inpost;

import java.util.Scanner;
 
public class inpost{
 
    static char[] stk = new char[20];
    static int top = -1;
    static int MAX = 20;
 
    public static void main(String arg[]){
        String infix, postfix;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Infix Expression : ");
        infix = sc.next();
        postfix = in2postfix(infix);
    }
 
    // method that pushes the elements onto the character stack
    static void push(char oper)
    {
        if(top==MAX-1)
        {
            System.out.println("stackfull!!!!");
        }
 
        else
        {
            top++;
            stk[top]=oper;
        }
    }
 
    // method that removes character from stack and returns them
    static char pop()
    {
        char ch;
        if(top==-1)
        {
            System.out.println("stackempty!!!!");
        }
        else
        {
            ch = stk[top];
            stk[top]='\0';
            top--;
            return(ch);
        }
        return 0;
    }
 
    // method that converts String from infix to postfix
    // all the strings are assumed to be valid expressions
    static String in2postfix(String infix)
    {
        int i=0;
       
        // result string variable
        String postfix = "";
 
        // loop till i is in the range of the length of string
        while(i < infix.length())
        {
            // if an alphabet is found then copy it to the output string
            if(infix.charAt(i)>='a' && infix.charAt(i)<='z')          
            {
                postfix += infix.charAt(i);
                i++;
            }
 
            // if an opening bracket is found then put it in stack
            else if(infix.charAt(i)=='(' || infix.charAt(i)=='{'  || infix.charAt(i)=='[')      
            {
                push(infix.charAt(i));
                i++;
            }
           
            // if an closing bracket is found then
            // keep removing the operators from the stack and add them to postfix string until you find the corresponding opening bracket
            else if(infix.charAt(i)==')' || infix.charAt(i)=='}'  || infix.charAt(i)==']')
            {
                if(infix.charAt(i)==')')
                {
                    while(stk[top]!='(')
                    {
                        postfix += pop();
                    }
                    pop();
                    i++;
                }
 
                if(infix.charAt(i)==']')
                {
                    while(stk[top]!='[')
                    {
                        postfix += pop();
                    }
                    pop();
                    i++;
                }
 
                if(infix.charAt(i)=='}')
                {
                    while(stk[top]!='{')
                    {
                        postfix += pop();
                    }
                    pop();
                    i++;
                }
            }
            // if none of the above cases are satisfied then we surely have an operator
            else            
            {
               
                // if the stack if empty then we simply put the operator in stack
                if(top==-1)
                {
                    push(infix.charAt(i));
                    i++;
                }
 
                // if the priority of current operator is less than or equal to the stack top then
                // pop the stack top and add it to the postfix string
                else if( priority(infix.charAt(i)) <= priority(stk[top])) {
                    postfix += pop();
                   
                    // now if you have an operator that has equal priority as of current operator then pop
                    while(priority(stk[top]) == priority(infix.charAt(i))){
                        postfix += pop();
                        if(top < 0) {
                            break;
                        }
                    }
                    push(infix.charAt(i));
                    i++;
                }
 
                // if the priority of current operator if high then push it onto the stack
                else if(priority(infix.charAt(i)) > priority(stk[top])) {
                    push(infix.charAt(i));
                    i++;
                }
            }
        }
 
        // at the end remove all the operators from the stack
        while(top!=-1)
        {
            postfix += pop();
        }
        System.out.println("The converted postfix String is : " + postfix);
        return postfix;
    }
 
    // method that returns priority for operators according to their precedence
    static int priority ( char alpha )
    {
        if(alpha == '+' || alpha =='-')
        {
            return(1);
        }
 
        if(alpha == '*' || alpha =='/')
        {
            return(2);
        }
 
        if(alpha == '$')
        {
            return(3);
        }
 
        return 0;
    }
 
}
