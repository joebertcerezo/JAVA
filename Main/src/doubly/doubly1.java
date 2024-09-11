/*
    File: doubly1.java
    Description: 
    Programmer: Joebert L. Cerezo
    Date: October 19, 2021
*/
package doubly;

import java.util.Scanner;
import java.util.Random;
public class doubly1 
{
    public static void main(String[] args) throws Exception
    {
        Scanner input = new Scanner(System.in);
        doubly list = new doubly();
        System.out.println("Doubly LinkedList");
        int choice = 0;
        
        while(choice<15)
        {
            System.out.println("1. Generate 5 numbers");
            System.out.println("2. insertBeginning");
            System.out.println("3. insertEnd");
            System.out.println("4. insertBefore");
            System.out.println("5. insertAfter");
            System.out.println("6. deleteBeginning");
            System.out.println("7. deleteEnd");
            System.out.println("8. deleteBefore");
            System.out.println("9. deleteAfter");
            System.out.println("10. deleteGivenNode");
            System.out.println("11. deleteRepeatingNode");
            System.out.println("12. destroyWholeNode");
            System.out.println("13. displayReverse");
            System.out.println("14. display");
            System.out.print("Enter Selected Number: ");
            choice = input.nextInt();
            
            switch(choice)
            {
                case 1:
                    System.out.println("\nGenerate 5 number numbers");
                    list.randomNumbers();
                    list.display();
                    System.out.println();
                    break;
                case 2:
                    System.out.println("\ninsertAtTheBeginning");
                    System.out.print("Enter data: ");
                    int data = input.nextInt();
                    list.insertBeginning(data);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("\ninsertAtTheBeginning");
                    System.out.print("Enter data: ");
                    data = input.nextInt();
                    list.insertEnd(data);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("\ninsertBefore");
                    System.out.print("Enter data: ");
                    data = input.nextInt();
                    System.out.print("Enter value: ");
                    int value = input.nextInt();
                    list.insertBefore(data, value);
                    System.out.println();
                    break;
                case 5:
                    System.out.println("\ninsertAfter");
                    System.out.print("Enter data: ");
                    data = input.nextInt();
                    System.out.print("Enter value: ");
                    value = input.nextInt();
                    list.insertAfter(data, value);
                    System.out.println();
                    break;
                case 6:
                    System.out.println("\ndeleteBeginning");
                    list.deleteBeginning();
                    System.out.println();
                    break;
                case 7:
                    System.out.println("\ndeleteEnd");
                    list.deleteEnd();
                    System.out.println();
                    break;
                case 8:
                    System.out.println("\ndeleteBefore");
                    System.out.print("Enter keyValue: ");
                    value = input.nextInt();
                    list.deleteBefore(value);
                    System.out.println();
                    break;
                case 9:
                    System.out.println("\ndeleteAfter");
                    System.out.print("Enter keyValue: ");
                    value = input.nextInt();
                    list.deleteAfter(value);
                    System.out.println();
                    break;
                case 10:
                    System.out.println("\ndeleteGiven");
                    System.out.print("Enter keyValue: ");
                    value = input.nextInt();
                    list.deleteGivenNode(value);
                    System.out.println();
                    break;
                case 11:
                    System.out.println("\ndeleteRepeatingNode");
                    list.display();
                    System.out.print("Enter value: ");
                    value = input.nextInt();
                    list.deleteRepeatingNode(value);
                    System.out.println();
                    break;    
                case 12:
                    System.out.println("\nALL NODE DESTROYED");
                    list.destroyWholeNode();
                    System.out.println();
                    break;
                case 13:
                    System.out.println("\nDISPLAY REVERSE");
                    list.displayReverse();
                    System.out.println();
                    break;
                case 14:
                    System.out.println("\nDISPLAY");
                    list.display();
                    System.out.println();
                    break;
            }
        }
        
    }
    
}


class doubly {

    private class Node {
        Node prev;
        int data;
        Node next;
    }

    private Node start;

    private Node createNewNode(int data) throws Exception {
        Node node = new Node();

        if (node == null)
            throw new Exception("List Overflow");
        else {
            node.prev = null;
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
            insertEnd(rand.nextInt(99));
        }
    }
    
    public void insertBeginning(int data) throws Exception {
        Node node = createNewNode(data);

        if (start == null) {
            start = node;
        }
        else  {
            node.next = start;
            start.prev = node;
            start = node;
        }
    }

    public void insertEnd(int data) throws Exception {
        Node node = createNewNode(data);
        Node ptr;

        if (start == null) {
            start = node;
        }
        else  {
            ptr = start;

            while (ptr.next != null) {
                ptr = ptr.next;
            }

            ptr.next = node;
            node.prev = ptr;
        }
    }
    
    public void insertBefore(int data, int keyValue) throws Exception {
        Node node = createNewNode(data);
        Node ptr = start;

        if (start == null) {
            throw new Exception("List is NULL");
        }
        else  
        {
            ptr = start;

            while (ptr.data != keyValue) {
                ptr = ptr.next;
            }

            node.next = ptr;
            node.prev = ptr.prev;
            ptr.prev.next = node;
            ptr.prev = node;
        }
    }

    public void insertAfter(int data, int keyValue) throws Exception 
    {
        Node node = createNewNode(data);
        Node ptr;


        if (start == null) {
            throw new Exception("List is NULL");
        }
        else 
        {
            ptr = start;

            while (ptr.data != keyValue) {
                ptr = ptr.next;
            }

            node.next = ptr.next;
            node.prev = ptr;
            ptr.next = node;
            ptr.next.prev = node;
        }
    }

    public void deleteBeginning() throws  Exception {

        if (start == null) {
            throw new Exception("List is NULL");
        }
        else {
            System.out.println("Node deleted : " + start.data);
            start = start.next;
            start.prev =  null;
        }
    }

    public void deleteEnd() throws Exception {
        Node ptr;

        if (start == null) {
            throw new Exception("List is NULL");
        }
        else  {
            ptr = start;

            while (ptr.next != null) {
                ptr =  ptr.next;
            }

            System.out.println("Node deleted : " + ptr.data);
            ptr.prev.next = null;
        }
    }
    
    public void deleteBefore(int keyValue) throws Exception 
    {
        Node ptr;

        if (start == null) {
            throw new Exception("List is NULL");
        }
        else 
        {
            ptr = start;

            while (ptr.data != keyValue) 
            {
                ptr = ptr.next;
            }
            System.out.println("Node deleted : " + ptr.prev.data);
            ptr.prev.prev.next = ptr.prev.next;
            ptr.prev = ptr.prev.prev;
            
           
        }
    }
    
    public void deleteAfter(int keyValue) throws Exception 
    {
        Node ptr;

        if (start == null) {
            throw new Exception("List is NULL");
        }
        else 
        {
            ptr = start;

            while (ptr.data != keyValue) 
            {
                ptr = ptr.next;
            }
            System.out.println("Node deleted : " + ptr.next.data);
            ptr.next.next.prev = ptr.next.prev;
            ptr.next = ptr.next.next;
            
        }
    }

    public void deleteGivenNode(int keyValue) throws Exception {
        Node ptr = start;

        if (start == null) {
            throw new Exception("List is NULL");
        }
        else  
        {
            ptr = start;

            while (ptr.data != keyValue) 
            {
                ptr = ptr.next;
            }
            if(ptr.next == null)
            {
                deleteEnd();
            }
            else
            {
                ptr.prev.next = ptr.next;
                ptr.next.prev = ptr.prev;
                System.out.println("Node deleted : " + ptr.data);
            }
        }
    }
    
    public void deleteRepeatingNode(int value) throws Exception
    {
        Node ptr = new Node();
        
        ptr = start;
        
        if(ptr.data == value)
        {
            while(ptr.next.data == value)
            {
                start =  start.next;
                ptr = ptr.next;
            }
            start = start.next;
        }
        
            while(ptr.next != null)
            {
                ptr = ptr.next;
                if(ptr.data == value)
                {
                    deleteGivenNode(ptr.data);
                }
            }
        
    }
    
    public void destroyWholeNode() throws Exception
    {
        Node ptr = new Node();
        
        ptr = start;
        
        while(ptr.next != null)
        {
            ptr = ptr.next;
            deleteGivenNode(ptr.data);
        }
        System.out.println("Node deleted : " + start.data);
        start = null;
        //mao ni akong code sa destroy whole node...
    }
    
    public void display() throws Exception {
        Node ptr;

        if (start == null) {
            throw new Exception("List Underflow");
        }
        else  {
            ptr = start;

            while(ptr != null) {
                System.out.print(ptr.data + "   ");
                ptr = ptr.next;
            }
        }

        System.out.println();
    }

    public void displayReverse() throws Exception {
        Node ptr;

        if (start == null)
            throw new Exception("List Underflow");
        else 
        {
            ptr = start;

            while (ptr.next != null) {
                ptr = ptr.next;
            }


            while (ptr.prev != null) 
            {
                System.out.print(ptr.data + "   ");
                ptr = ptr.prev;
            }
        }

        System.out.println(ptr.data);
    }
}
