/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

import java.util.Random;

/**
 *
 * @author CEREZO
 */
public class LinearQueue {
    private class Node {
        int data;
        Node next;
    }

    private Node front; //head, begin
    private Node rear;  //tail, end

    private Node createNewNode(int data) throws Exception {
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
    
    public void randomNumbers() throws Exception
    {
        Random rand = new Random();

        for(int i=0; i<5; i++)
        {
            enQueue(rand.nextInt(100) + 1);
        }
    }
    
    public void enQueue(int data)  throws Exception {
        Node node = createNewNode(data);

        if (front == null) {
            front = rear = node;
        }
        else {
            rear.next = node;
            rear = node;
        }
    }

    public void deQueue() throws Exception {

        if (front == null) {
            throw new Exception("Queue is empty");
        }
        else {
            System.out.println(front.data + " removed");
            front = front.next;
        }
    }

    public int getFront() throws Exception {

        if (front == null) {
            throw new Exception("Queue is empty");
        }
        else {
            return front.data;
        }
    }

    public int getRear() throws Exception {

        if (front == null) {
            throw new Exception("Queue is empty");
        }
        else {
            return rear.data;
        }
    }

    public void display() throws Exception {

        if (front == null) {
            throw new Exception("Queue is empty");
        }
        else {
            Node ptr = front;

            while(ptr != null) {
                System.out.print(ptr.data + " ");
                ptr = ptr.next;
            }
        }
        System.out.println();
    }
}
