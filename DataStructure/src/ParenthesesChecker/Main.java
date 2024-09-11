/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParenthesesChecker;
import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner input = new Scanner(System.in);
        ParenthesesChecker checker = new ParenthesesChecker();
        
        System.out.print("Input Expression: ");
        String expression = input.nextLine();
        
        for(int i = 0; i < expression.length(); i++)
        {
            char c = expression.charAt(i);
            
            if(c == '(' || c == '{' || c == '[')
            {
                checker.push(c);
            }
            else if (c == ')' || c == '}' || c == ']')
            {
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
            if(checker.checkTop())
            {
                System.out.println("Balanced Parentheses");
            }
            else
            {
                System.out.println("Unbalanced Parentheses");
            }
        
    }
    
}
