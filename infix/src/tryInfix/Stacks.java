/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tryInfix;

/**
 *
 * @author CEREZO
 */
public class Stacks 
{
    private class Node {
        char data;
        Node next;
    }
    
    private Node top;

    private Node createNewNode(char data) throws Exception{
        Node node = new Node();

        if (node == null) {
            throw new Exception("Memory not allocated");
        }
        else  {
            node.data = data;
            node.next = null;
            return node;
        }
    }
    
    public String prefix(String infix) throws Exception
    {
        Node node = new Node();
        
        String result = "";
        
        infix = new StringBuffer(infix).reverse().toString();
        
        for(int i = 0; i < infix.length(); i++)
        {
            char c = infix.charAt(i);
            
            if(c>='a' && c<='z')          
            {
                result += c;
            }
            else if(c==')' || c=='}'  || c==']')       
            {
                push(c);
            }
            else if(infix.charAt(i)=='(' || infix.charAt(i)=='{'  || infix.charAt(i)=='[')
            {
                if(c=='(')
                {
                    while(peek()!=')')
                    {
                        result += pop();
                    }
                    pop();
                }
 
                if(c=='[')
                {
                    while(peek()!=']')
                    {
                        result += pop();
                    }
                    pop();
                }
 
                if(c=='{')
                {
                    while(peek()!='}')
                    {
                        result += pop();
                    }
                    pop();
                }
            }
            else            
            {
                
                // if the stack if empty then we simply put the operator in stack
                if(top==null) 
                {
                    push(c);
                }
 
                // if the priority of current operator is less than the stack top then
                // pop the stack top and add it to the prefix string
                else if( precedence(c) < precedence(peek())) 
                {
                    result += pop();
                    
                    // now if you have an operator that has priority greater than current operator then pop
                    while(precedence(peek()) > precedence(c)){
                        result += pop();
                        if(top==null)  {
                            break;
                        }
                    }
                    push(c);
                }
 
                // if the priority of current operator is greater than or equal to the stack top then push it onto the stack
                else if(precedence(c) >= precedence(peek())) {
                    push(c);
                }
            }
        }
        while(top!=null)
        {
            result += pop();
        }
        
        // reverse the final string before output
        result = new StringBuffer(result).reverse().toString();
        
        System.out.println("The converted prefix String is : " + result);
        
        return result;
    }

    public int precedence(char c) throws Exception
    {
        switch(c)
        {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
        }
        return 0;
    }
    
    public void push(char data) throws Exception {
        Node node = createNewNode(data);

        if (top == null) {
            top = node;
        }
        else {
            node.next = top;
            top = node;
        }
    }

    public char pop() throws Exception {

        if (top == null) {
            throw new Exception("Stack is empty");
        }
        else  {
            top = top.next;
            return 0;
        }
    }

    public char peek() throws Exception {

        if (top == null) {
            throw new Exception("\nStack is empty");
        }
        else  {
            return top.data;
        }
    }

    public void display() throws Exception {
        Node ptr = top;

        if (ptr == null) {
            throw new Exception("Stack is empty");
        }
        else  {
            System.out.println();
            while (ptr != null) {
                System.out.print(ptr.data + "  ");
                ptr = ptr.next;
            }
        }
    }
}