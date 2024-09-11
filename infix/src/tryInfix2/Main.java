/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tryInfix2;

import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) throws Exception
    {
        Scanner input = new Scanner(System.in);
        prefix prefix = new prefix();
        
        System.out.print("Enter Infix: ");
        String infix = input.nextLine();
        System.out.println("Prefix: "+prefix.prefix(infix));
        
    }
}
class prefix
{
    public String prefix(String infix) throws Exception
        {
            Stacks operators = new Stacks();
            Stacks2 operands = new Stacks2();
            
        for(int i=0; i<infix.length(); i++)
        {
            char c = infix.charAt(i);
            
                if (c == '(')
		{
			operators.push(c);
		}

		// If current character is a
		// closing bracket, then pop from
		// both stacks and push result
		// in operands stack until
		// matching opening bracket is
		// not found.
		else if (c == ')')
		{
			while (!operators.empty() && operators.peek() != '(')
			{

				// operand 1
				String op1 = operands.peek();
				operands.pop();

				// operand 2
				String op2 = operands.peek();
				operands.pop();

				// operator
				char op = operators.peek();
				operators.pop();

				// Add operands and operator
				// in form operator +
				// operand1 + operand2.
				String tmp = op + op2 + op1;
				operands.push(tmp);
                        }

			// Pop opening bracket
			// from stack.
			operators.pop();
		}

		// If current character is an
		// operand then push it into
		// operands stack.
		else if (!operators.isOperator(c))
		{
			operands.push(c + "");
		}

		// If current character is an
		// operator, then push it into
		// operators stack after popping
		// high priority operators from
		// operators stack and pushing
		// result in operands stack.
		else
		{
			while (!operators.empty() && operators.precedence(c) <= operators.precedence(operators.peek()))
				{

				String op1 = operands.peek();
				operands.pop();

				String op2 = operands.peek();
				operands.pop();

				char op = operators.peek();
				operators.pop();

				String tmp = op + op2 + op1;
				operands.push(tmp);
			}

			operators.push(c);
		}
	}

	// Pop operators from operators
	// stack until it is empty and
	// operation in add result of
	// each pop operands stack.
	while (!operators.empty())
	{
		String op1 = operands.peek();
		operands.pop();

		String op2 = operands.peek();
		operands.pop();

		char op = operators.peek();
		operators.pop();

		String tmp = op + op2 + op1;
		operands.push(tmp);
	}
            // Final prefix expression is
	// present in operands stack.
	return operands.peek();
        }
}
    

