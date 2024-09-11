/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity.pkg4.queue;

import java.util.Random;

/**
 *
 * @author CEREZO
 */
public class Queue {
    public class Node {
        int x, y;
        Node next;
    }

    public Node front; //head, begin
    public Node rear;  //tail, end

    public Node createNewNode(int x, int y) throws Exception {
        Node node = new Node();

        if (node == null) {
            throw new Exception("Memory not allocated");
        }
        else  {
            node.x = x;
            node.y = y;
            node.next = null;
            return node;
        }
    }
    
//    public void randomNumbers() throws Exception
//    {
//        Random rand = new Random();
//
//        for(int i=0; i<5; i++)
//        {
//            enQueue(rand.nextInt(100) + 1);
//        }
//    }
    public void enQueueFront(int x, int y) throws Exception {
        Node  node = createNewNode(x, y);

        if (front == null) {
            front = rear = node;
        }
        else {
            node.next = front;
            front = node;
        }
    }
    
    public void enQueue(int x, int y)  throws Exception {
        Node node = createNewNode(x, y);

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
            front = front.next;
        }
    }

    public int getFrontX() throws Exception {

        if (front == null) {
            throw new Exception("Queue is empty");
        }
        else {
            return front.x;
        }
    }
    
    public int getFrontY() throws Exception {

        if (front == null) {
            throw new Exception("Queue is empty");
        }
        else {
            return front.y;
        }
    }
//
//    public int getRear() throws Exception {
//
//        if (front == null) {
//            throw new Exception("Queue is empty");
//        }
//        else {
//            return rear.data;
//        }
//    }

    
    public void display() throws Exception {

        if (front == null) {
            System.out.println("No remaining shares");
        }
        else {
            Node ptr = front;

            while(ptr != null) {
                System.out.println(ptr.x + " shares at $" + ptr.y);
                ptr = ptr.next;
            }
        }
    }
}
