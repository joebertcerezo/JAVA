/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circular;
import java.util.Random;
public class Circular {

    private class Node {
        int data;
        Node next;
    }

    private Node start;

    private Node createNewNode(int data) throws Exception {
        Node node = new Node();

        node.data = data;
        return node;
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
        Node ptr;

        if (start == null) {
            node.next = node;
            start = node;
        }
        else {
            ptr = start;

            while(ptr.next != start) {
                ptr = ptr.next;
            }

            node.next = start;
            ptr.next = node;
            start = node;
        }
    }


    public void insertEnd(int data) throws Exception {
        Node node = createNewNode(data);
        Node ptr = start;

        if (start == null) {
            node.next = node;
            start = node;
        }
        else  {
            ptr = start;

            while (ptr.next != start) {
                ptr = ptr.next;
            }

            ptr.next = node;
            node.next  = start;

        }
    }
    
    public void insertBefore(int data, int keyValue) throws Exception {
        Node node = createNewNode(data);
        Node ptr, preptr = new Node();

        ptr = start;
        
        if(ptr.data == keyValue)
        {
            insertBeginning(data);
        }
        else
        {
            while (ptr.data != keyValue) 
            {
                preptr = ptr;
                ptr = ptr.next;
            }
            preptr.next = node;
            node.next = ptr;
        }
    }
    
    public void insertAfter(int data, int keyValue) throws Exception {
       Node node = createNewNode(data);
        Node ptr, preptr = new Node();

        ptr = start;

        while(preptr.data != keyValue) {
            preptr = ptr;
            ptr = ptr.next;
        }
        if(preptr.next == start)
        {
            insertEnd(data);
        }
        else
        {
            preptr.next = node;
            node.next = ptr;
        }
    }

    public void deleteBeginning() throws Exception {
        Node ptr;

        if (start == null) {
            throw new Exception("List is empty");
        }
        else {
            ptr = start;

            while (ptr.next != start) {
                ptr = ptr.next;
            }

            System.out.println("Node deleted : " + start.data);
            ptr.next = start.next;
            start = ptr.next;
        }

    }

    public void deleteEnd() throws  Exception {
        Node ptr, preptr;
        preptr = null;

        if (start == null) {
            throw new Exception("List is empty");
        }
        else {
            ptr = start;

            while (ptr.next != start) {
                preptr = ptr;
                ptr = ptr.next;
            }

            System.out.println("Node deleted : " + ptr.data);
            preptr.next = start;
        }
    }

    public void deleteBefore(int value) throws Exception 
    {
        Node ptr, preptr = new Node();
        Node prepreptr = new Node();

        ptr = start;
        
        if(ptr.data == value)
        {
            deleteEnd();
        }
        else
        {
            while(ptr.data != value) 
            {
                prepreptr = preptr;
                preptr = ptr;
                ptr = ptr.next; 
            }
            System.out.println("Node deleted : " + preptr.data);
            prepreptr.next = preptr.next;
        }
    }

    public void deleteAfter(int value) throws Exception 
    {
        Node ptr, preptr = new Node();

        ptr = start;

        while(preptr.data != value) {
            preptr = ptr;
            ptr = ptr.next;
        }
        if(preptr.next == start)
        {
            deleteBeginning();
        }
        else
        {
            System.out.println("Node deleted : " + ptr.data);
            preptr.next = ptr.next;
        }
    }

    public void deleteGiven(int keyValue) throws Exception 
    {
        Node ptr, preptr = new Node();

        ptr = start;
        if(ptr.data == keyValue)
        {
            deleteBeginning();
        }
        else
        {
        while(ptr.data != keyValue) 
            {
                preptr = ptr;
                ptr = ptr.next;
            }
            System.out.println("Node deleted : " + ptr.data);
            preptr.next = ptr.next;
        }
    }
    
    public void deleteEven() throws Exception
    {
        Node ptr =  new Node();
        
        ptr = start;
        
        while(ptr.next != start)
        {
            if(ptr.data % 2 ==0)
            {
               deleteGiven(ptr.data);
            }
            ptr = ptr.next;
        }
    }
    
    public void deleteRepeatingNode(int value) throws Exception
    {
        Node ptr = new Node();
        
        ptr = start;
        
        if(ptr.data == value)
        {
            while(ptr.data == value)
            {
                deleteBeginning();
                ptr = ptr.next;
            }
        }
        while(ptr.next != start)
        {
            ptr = ptr.next;
            if(ptr.data == value)
            {
                deleteGiven(ptr.data);
            }
        }
    }
    
    public void destroyWholeNode() throws Exception
    {
        Node ptr = new Node();
        
        ptr = start;
        
        while(ptr.next != start)
        {
            deleteGiven(ptr.data);
            ptr = ptr.next;
        }
        System.out.println("Node deleted : " + ptr.data);
        start = null;
    }
   
    public void display() throws Exception {
        Node ptr = start;

        if (start == null) {
            throw new Exception("List is empty");
        }

        while(ptr.next != start) {
            System.out.print(ptr.data + "  ");
            ptr = ptr.next;
        }

        System.out.println(ptr.data);
    }
}
