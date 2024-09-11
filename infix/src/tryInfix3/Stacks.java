/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tryInfix3;

//char Stacks
public class Stacks
{
    public class Node {
        char data;
        Node next;
    }
    
    public Node top;

    public Node createNewNode(char data) throws Exception{
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
    
    /*
    public boolean isOperator(char c) throws Exception
    {
        return (!(c >= 'a' && c <= 'z') && !(c >= '0' && c <= '9') && !(c >= 'A' && c <= 'Z'));
    }
    */
    
    public int precedence(char c) throws Exception
    {
        switch(c)
        {
            case '-':
                return 1;
            case '+':
                return 2;
            case '/':
                return 3;
            case '*':
                return 4;
            case '^':
                return 5;
        }
        return 0;
    }

    public boolean empty() throws Exception
    {
        if(top == null)
        {
            return true;
        }
        else
        {
            return false;
        }
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

    public void pop() throws Exception {

        if (top == null) {
            throw new Exception("Stack is empty");
        }
        else  {
            top = top.next;
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
