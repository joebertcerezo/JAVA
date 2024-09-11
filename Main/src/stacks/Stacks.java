/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacks;
public class Stacks 
{
    private class Node {
        int data;
        Node next;
    }
    
    private Node top;

    private Node createNewNode(int data) throws Exception{
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

    public void push(int data) throws Exception {
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

    public int peek() throws Exception {

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