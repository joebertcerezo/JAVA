/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PriorityQueue;
import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) throws Exception
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
    }
    
}
