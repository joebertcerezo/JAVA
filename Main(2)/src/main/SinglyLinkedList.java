/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Random;

public class SinglyLinkedList {

    //declaration of the Node
    private class Node {
        int data;
        Node next;
    }

    private Node start;
    
    //generate 5 random data
    public void randomNumbers() throws Exception
    {
        Random rand = new Random();

        for(int i=0; i<5; i++)
        {
            insertAtTheEnd(rand.nextInt(99));
        }
    }

    public Node createNewNode(int data) throws  Exception 
    {
        Node node = new Node();
        if(node == null)
            throw  new Exception("Memory not allocated");
        else {
            node.data = data;
            node.next = null;
            return node;
        }
    }

    public void insertAtTheBeginning(int data) throws Exception 
    {
        Node node = createNewNode(data);

        if (start == null) {
            start = node;
        }
        else {
           /* temp = start;
            start = node;
            start.next = temp;*/
            node.next = start;
            start = node;
        }
    }

    public void insertAtTheEnd(int data) throws Exception 
    {
        Node node = createNewNode(data);
        Node ptr = new Node();

        if (start == null)
            start = node;
        else {
            ptr = start;

            while(ptr.next != null ) {
                ptr = ptr.next;
            }

            ptr.next = node;
        }

    }

    public void insertBefore(int data, int value) throws Exception 
    {
        Node node = createNewNode(data);
        Node ptr, preptr = new Node();

        ptr = start;
        
        if(ptr.data == value)
        {
            insertAtTheBeginning(data);
        }
        else
        {
            while(ptr.data != value) 
            {
                preptr = ptr;
                ptr = ptr.next;
            }

        preptr.next = node;
        node.next = ptr;
        }

    }

    public void insertAfter(int data, int value) throws Exception 
    {
        Node node = createNewNode(data);
        Node ptr, preptr = new Node();

        ptr = start;

        while(preptr.data != value) {
            preptr = ptr;
            ptr = ptr.next;
        }

        preptr.next = node;
        node.next = ptr;

    }

    public void deleteBeginning() throws Exception 
    {

        if (start == null)
            throw new Exception("Linked list is empty");

        System.out.println(start.data + " deleted");
        start = start.next;
    }

    public void deleteEnd() throws  Exception 
    {
        Node ptr, preptr = new Node();

        if (start == null)
            throw new Exception("Linked List is empty");

        ptr = start;

        while (ptr.next != null) {
            preptr = ptr;
            ptr = ptr.next;
        }

        System.out.println(ptr.data + " deleted");
        preptr.next = null;
    }
    
    public void deleteBefore(int value) throws Exception 
    {
        Node ptr, preptr = new Node();
        Node prepreptr = new Node();

        ptr = start;
        
        if(ptr.next.data == value)
        {
            deleteBeginning();
        }
        while(ptr.data != value) 
        {
            prepreptr = preptr;
            preptr = ptr;
            ptr = ptr.next; 
        }

        prepreptr.next = preptr.next;
    }

    public void deleteAfter(int value) throws Exception 
    {
        Node ptr, preptr = new Node();

        ptr = start;

        while(preptr.data != value) {
            preptr = ptr;
            ptr = ptr.next;
        }

        preptr.next = ptr.next;
    }

    /*public void deleteGiven(int value) throws Exception 
    {
        Node ptr, preptr = new Node();

        ptr = start;
        
        while(ptr.data != value) {
            preptr = ptr;
            ptr = ptr.next;
        }

        preptr.next = ptr.next;
    }*/
    
     public void deleteGiven(int value) throws Exception 
    {
        Node ptr, preptr = new Node();

        ptr = start;
        if(ptr.data == value)
        {
            start = start.next;
        }
        else
        {
        while(ptr.data != value) 
        {
            preptr = ptr;
            ptr = ptr.next;
        }
        preptr.next = ptr.next;
        }
    }

    /*public void deleteRepeatingNode(int value) throws Exception
    {
        Node ptr, preptr = new Node();
        
        ptr = start;
        
        if(ptr.data == value)
        {
            while(ptr.next.data == value)
            {
                start = start.next;
                ptr = ptr.next;
            }
            start = start.next;
        }
        while(ptr.next != null)
        {
            ptr = ptr.next;
            if(ptr.data == value)
            {
                deleteGiven(value);
            }
        }
    }*/
    
    public void deleteRepeatingNode(int value) throws Exception
    {
        Node ptr, preptr = new Node();
        
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
                deleteGiven(ptr.data);
            }
        }
    }
    
    public void deleteOdd() throws Exception
    {
        Node ptr,preptr = new Node();
        
        ptr = start;
        if(ptr.data % 2 != 0)
        {
            while(ptr.next.data % 2 != 0)
            {
                start = start.next;
                ptr = ptr.next;
            }
            start = start.next;
        }
        while(ptr != null)
        {
            if(ptr.data % 2 != 0)
            {
                preptr.next = ptr.next;
            }
            preptr = ptr;
            ptr = ptr.next;
        }
    }
    
    public void destroyWholeNode() throws Exception
    {
        Node ptr, preptr = new Node();
        
        ptr = start;
        
        while(ptr.next != null)
        {
            ptr = ptr.next;
            deleteGiven(ptr.data);
        }
        start = null;
    }

    public void display() throws Exception 
    {
        if (getSize() == 0)
            throw new Exception("Linked List is emtpy");
        else {
            Node ptr = start;
            while(ptr != null) {
                System.out.print(ptr.data + " -> ");
                ptr = ptr.next;
            }

            System.out.println("NULL\n");
        }
    }

    public int getSize() throws Exception 
    {
        int size = 0;
        Node ptr = start;

        while(ptr != null) {
            size++;
            ptr = ptr.next;
        }

        return size;
    }



}
