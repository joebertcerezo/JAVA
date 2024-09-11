/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) throws Exception 
    {
        menu();
    }
    
    public static void menu() throws Exception
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Choose from the following: ");
        System.out.println("1. LinearQueue");
        System.out.println("2. CircularQueue");
        System.out.println("3. DoubleEndedQueue");
        System.out.println("4. PriorityQueue");
        System.out.println("0. Exit");
        System.out.print("Enter choice: ");
        int choice = input.nextInt();
        
        switch(choice)
        {
            case 1:
                LinearQueue();
                break;
            case 2:
                CircularQueue();
                break;
            case 3:
                DoubleEndedQueue();
                break;
            case 4:
                PriorityQueue();
                break;
            case 0:
                break;
        }
    }
    
    public static void LinearQueue() throws Exception
    {
        LinearQueue lq = new LinearQueue();
        Scanner input = new Scanner(System.in);
        int choice;
        
        do
        {
            System.out.println("\nLinearQueue");
            System.out.println("1. Generate 5 numbers");
            System.out.println("2. enQueue");
            System.out.println("3. deQueue");
            System.out.println("4. getFront");
            System.out.println("5. getRear");
            System.out.println("6. display");
            System.out.println("0. menu");
            System.out.print("Enter choice: ");
            choice = input.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.println("\n1. Generate 5 numbers");
                    lq.randomNumbers();
                    lq.display();
                    break;
                case 2:
                    System.out.println("\n2. enQueue");
                    System.out.print("Input data: ");
                    int data = input.nextInt();
                    lq.enQueue(data);
                    break;
                case 3:
                    System.out.println("\n3. deQueue");
                    lq.deQueue();
                    break;
                case 4:
                    System.out.println("\n4. getFront");
                    System.out.println("Front is " + lq.getFront());
                    break;
                case 5:
                    System.out.println("\n5. getRear");
                    System.out.println("Rear is " + lq.getRear());
                    break;
                case 6:
                    System.out.println("\n6. display");
                    lq.display();
                    break;
            }
        }while(choice != 0);
        System.out.println();
        menu();
    }
    
    public static void CircularQueue() throws Exception
    {
        CircularQueue cq = new CircularQueue();
        Scanner input = new Scanner(System.in);
        int choice;
        
        do
        {
            System.out.println("\nCircularQueue");
            System.out.println("1. Generate 5 numbers");
            System.out.println("2. enQueue");
            System.out.println("3. deQueue");
            System.out.println("4. getFront");
            System.out.println("5. getRear");
            System.out.println("6. display");
            System.out.println("0. menu");
            System.out.print("Enter choice: ");
            choice = input.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.println("\n1. Generate 5 numbers");
                    cq.randomNumbers();
                    cq.display();
                    break;
                case 2:
                    System.out.println("\n2. enQueue");
                    System.out.print("Input data: ");
                    int data = input.nextInt();
                    cq.enQueue(data);
                    break;
                case 3:
                    System.out.println("\n3. deQueue");
                    cq.deQueue();
                    break;
                case 4:
                    System.out.println("\n4. getFront");
                    System.out.println("Front is " + cq.getFront());
                    break;
                case 5:
                    System.out.println("\n5. getRear");
                    System.out.println("Rear is " + cq.getRear());
                    break;
                case 6:
                    System.out.println("\n6. display");
                    cq.display();
                    break;
            }
        }while(choice != 0);
        System.out.println();
        menu();
    }
    
    public static void DoubleEndedQueue() throws Exception
    {
        DoubleEndedQueue deq = new DoubleEndedQueue();
        Scanner input = new Scanner(System.in);
        int choice;
        
        do
        {
            System.out.println("\nDoubleEndedQueue");
            System.out.println("1. Generate 5 numbers");
            System.out.println("2. enQueueFront");
            System.out.println("3. enQueueRear");
            System.out.println("4. deQueueFront");
            System.out.println("5. deQueueEnd");
            System.out.println("6. getFront");
            System.out.println("7. getRear");
            System.out.println("8. display");
            System.out.println("0. menu");
            System.out.print("Enter choice: ");
            choice = input.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.println("\n1. Generate 5 numbers");
                    deq.randomNumbers();
                    deq.display();
                    break;
                case 2:
                    System.out.println("\n2. enQueueFront");
                    System.out.print("Input data: ");
                    int data = input.nextInt();
                    deq.enQueueFront(data);
                    break;
                case 3:
                    System.out.println("\n3. enQueueRear");
                    System.out.print("Input data: ");
                    data = input.nextInt();
                    deq.enQueueRear(data);
                    break;
                case 4:
                    System.out.println("\n4. deQueueFront");
                    deq.deQueueFront();
                    break;
                case 5:
                    System.out.println("\n5. deQueueEnd");
                    deq.deQueueEnd();
                    break;
                case 6:
                    System.out.println("\n6. getFront");
                    System.out.println("Front is " + deq.getFront());
                    break;
                case 7:
                    System.out.println("\n7. getRear");
                    System.out.println("Rear is " + deq.getRear());
                    break;
                case 8:
                    System.out.println("\n8. display");
                    deq.display();
                    break;
            }
        }while(choice != 0);
        System.out.println();
        menu();
    }
    
    public static void PriorityQueue() throws Exception
    {
        PriorityQueue pq = new PriorityQueue();
        Scanner input = new Scanner(System.in);
        int choice;
        
        do
        {
            System.out.println("\nPriorityQueue");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Front Value");
            System.out.println("4. Rear Value");
            System.out.println("5. Display");
            System.out.println("6. Empty Queue");
            System.out.println("0. menu");
            System.out.print("Enter choice: ");
            choice = input.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.println("\n1. Insert");
                    System.out.print("Input data: ");
                    int data = input.nextInt();
                    System.out.print("Input priority: ");
                    int priority = input.nextInt();
                    pq.enQueue(data, priority);
                    break;
                case 2:
                    System.out.println("\n2. Delete");
                    pq.deQueue();
                    break;
                case 3:
                    System.out.println("\n3. Front Value");
                    System.out.println("Front is " + pq.getFront());
                    break;
                case 4:
                    System.out.println("\n5. Rear Value");
                    System.out.println("Rear is " + pq.getRear());
                    break;
                case 5:
                    System.out.println("\n5. Display");
                    pq.display();
                    break;
                case 6:
                    System.out.println("\n6. Empty Queue");
                    System.out.println("All queue is empty");
                    pq.emptyQueue();
                    break;
            }
        }while(choice != 0);
        System.out.println();
        menu();
    }
}
