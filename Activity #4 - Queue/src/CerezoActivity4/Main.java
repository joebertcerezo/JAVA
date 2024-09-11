/*
    File: Main.java
    Description: Buy and Sell using Queue
    Programmer: Joebert L. Cerezo
    Date: December 10, 2021
*/
package CerezoActivity4;

import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) throws Exception
    {
        Scanner input = new Scanner(System.in);
        Queue queue = new Queue();
        int choice;
        
        do
        {
            System.out.println("\n ---------------------------------");
            System.out.println("| CEREZO buy & sell Company       |");
            System.out.println("| [1] - buy x share(s) at y each  |");
            System.out.println("| [2] - sell x share(s) at y each |");
            System.out.println("| [0] - Exit                      |");
            System.out.println(" ---------------------------------");
            System.out.print("Enter choice: ");
            choice  = input.nextInt();
            
            switch(choice)
            {
                case 1:
                    System.out.println("\nInput buy x share(s) at y each: ");
                    System.out.print("x: ");
                    int xBuy = input.nextInt();
                    System.out.print("y: ");
                    int yBuy = input.nextInt();
                    
                    //insert xBuy and yBuy to queue
                    queue.enQueue(xBuy, yBuy);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("\nInput sell x share(s) at y each: ");
                    System.out.print("x: ");
                    int xSell = input.nextInt();
                    System.out.print("y: ");
                    int ySell = input.nextInt();
                    int capital = 0;
                    
                    //loop to check if xSell is greater than 0
                    while(xSell > 0)
                    {
                        //condition to check if xSell is greater than 0, then compute capital
                        if(xSell > 0)
                        {
                            //computation to get the capital
                            capital += (queue.getFrontX() * (ySell - queue.getFrontY()));
                        }
                        
                        //subtract xSell to xBuy in queue
                        xSell -= queue.getFrontX();
                        
                        //conditon to check if xSell is less than 0,
                        //then get the previous xBuy of the prevoius node and insert in front
                        if(xSell < 0)
                        {
                            capital += (xSell * (ySell - queue.getFrontY()));
                            
                            //get value of front queue yBuy and assign to yBuy variable
                            yBuy = queue.getFrontY();
                            queue.deQueue();
                            
                            //assign the xSell value to xBuy
                            xBuy = xSell * (-1);
                            
                            //insert to front the new value of xBuy and yBuy
                            queue.enQueueFront(xBuy, yBuy);
                        }
                        
                        //remove node from queue after subtracting to xSell
                        else
                        {
                            queue.deQueue();
                        }
                    }
                    
                    //condition to check if total capital is gain or loss
                    if(capital > 0)
                    {
                        System.out.println("\nCapital Gain = $" + capital);
                        System.out.println("\nRemaining Shares");
                        queue.display();
                    }
                    else
                    {
                        System.out.println("\nCapital Loss = $" + capital);
                        System.out.println("\nRemaining Shares");
                        queue.display();
                    }
                    System.out.println();
                    break;
                case 3:
                    queue.display();
                    System.out.println();
                    break;
            }
        }while (choice != 0);
        //exit when choice is equal to zero
    }
}

class Queue 
{
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
