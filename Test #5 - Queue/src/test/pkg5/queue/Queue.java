package test.pkg5.queue;

import java.util.Random;

/**
 *
 * @author CEREZO
 */
public class Queue {
    private class Node {
        int data;
        Node next;
    }

    public Node front; //head, begin
    public Node rear;  //tail, end

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
    
    public void display10X10() throws Exception {

        int countRow = 0, countCol = 0;
        
        if (front == null) {
            throw new Exception("Queue is empty");
        }
        else {
            Node ptr = front;

            while(ptr != null) {
                System.out.printf("%-5d", ptr.data);
                countCol++;
                ptr = ptr.next;
                
                if(countCol%10 == 0)
                {
                    System.out.println();
                    countRow++;
                    if(countRow%10 == 0)
                    {
                        break;
                    }
                }
            }
        }
    }
    
    public void display10X5() throws Exception {

        int countRow = 0, countCol = 0;
        
        if (front == null) {
            throw new Exception("Queue is empty");
        }
        else {
            Node ptr = front;

            while(ptr != null) {
                System.out.printf("%-5d", ptr.data);
                countCol++;
                ptr = ptr.next;
                
                if(countCol%10 == 0)
                {
                    System.out.println();
                    countRow++;
                    if(countRow%5 == 0)
                    {
                        break;
                    }
                }
            }
        }
    }
    
    public void display5X10() throws Exception {
        
        int countRow = 0, countCol = 0;
        
        if (front == null) {
            throw new Exception("Queue is empty");
        }
        else {
            Node ptr = front;

            while(ptr != null) {
                System.out.printf("%-5d", ptr.data);
                countCol++;
                ptr = ptr.next;
                
                if(countCol%5 == 0)
                {
                    System.out.println();
                    countRow++;
                    if(countRow%10 == 0)
                    {
                        break;
                    }
                }
            }
        }
    }
    
    public int getSum() throws Exception {

        int sum = 0;
        
        if (front == null) {
            throw new Exception("Queue is empty");
        }
        else {
            Node ptr = front;

            while(ptr != null) {
                sum += ptr.data;
                ptr = ptr.next;
            }
        }
        System.out.println("Sum is " + sum);
        System.out.println();
        return sum;
    }
}
