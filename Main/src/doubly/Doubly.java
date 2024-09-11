/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */ 
package doubly;

import java.util.Random;
public class Doubly {

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
        else if(ptr.data == keyValue)
        {
            insertBeginning(data);
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
        else if(start.next == null)
        {
            System.out.println("Node deleted : " + start.data);
            start = null;
        }
        else 
        {
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
        else if(start.next == null)
        {
            System.out.println("Node deleted : " + start.data);
            start = null;
        }
        else  
        {
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
            if(ptr.prev == start)
            {
                deleteBeginning();
            }
            else
            {
                System.out.println("Node deleted : " + ptr.prev.data);
                ptr.prev.prev.next = ptr.prev.next;
                ptr.prev = ptr.prev.prev;
            }
           
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
            if(ptr.next.next == null)
            {
                deleteEnd();
            }
            else
            {
                System.out.println("Node deleted : " + ptr.next.data);
                ptr.next.next.prev = ptr.next.prev;
                ptr.next = ptr.next.next;
            }
        }
    }

    public void deleteGivenNode(int keyValue) throws Exception {
        Node ptr = start;

        if (start == null) {
            throw new Exception("List is NULL");
        }
        else if(ptr.next == null)
        {
            start = null;
        }
        else if (ptr.data == keyValue)
        {
            deleteBeginning();
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
            deleteGivenNode(ptr.data);
            ptr = ptr.next;
        }
        System.out.println("Node deleted : " + start.data);
        start = null;
    }

    public void swap(int keyValue) throws Exception
    {
        Node ptr = start;
        Node temp = new Node();
        
        while (ptr.data != keyValue)
        {
            ptr = ptr.next;
        }
        /*temp.data = ptr.data;
        ptr.prev.data = ptr.data;
        ptr.data = temp.data;*/
        temp.data = ptr.prev.data;
        ptr.prev.data = ptr.data;
        ptr.data = temp.data;
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
