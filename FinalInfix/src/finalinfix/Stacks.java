/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalinfix;

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
    
    public int Prefixprecedence(char c) throws Exception
    {
        switch(c)
        {
            case '-':
            case '+':
                return 1;
            case '/':
            case '*':
            case '%':
                return 2;
            case '^':
                return 3;
        }
        return 0;
    }
    
    public int Postfixprecedence(char c) throws Exception
    {
        switch(c)
        {
            case '-':
            case '+':
                return 1;
            case '%':
            case '/':
            case '*':
                return 2;
            case '^':
                return 3;
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

//Strings Stacks
class StringStacks
{
    public class Node {
        String data;
        Node next;
    }
    
    public Node top;

    public Node createNewNode(String data) throws Exception{
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
    
    public void push(String data) throws Exception {
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

    public String peek() throws Exception {

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