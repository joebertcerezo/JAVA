/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketreservation;

/**
 *
 * @author CEREZO
 */
import java.util.Scanner;
public class TicketReservation1 
{
    Scanner input = new Scanner(System.in);
    public class Node 
    {
        String fname;
        String lname;
        String address;
        String ticketNum;
        Node next;
    }

    public Node start;
    
    public Node createNewNode(String fname, String lname, String address, String ticketNum) throws  Exception 
    {
        Node node = new Node();
        
        if(node == null)
        {
            throw  new Exception("Memory not allocated");
        }
        else 
        {
            node.fname = fname;
            node.lname = lname;
            node.address = address;
            node.ticketNum = ticketNum;
            node.next = null;
            return node;
        }
    }
    
    public void insertAtTheEnd(String fname, String lname, String address, String ticketNum) throws Exception 
    {
        Node node = createNewNode(fname, lname, address, ticketNum);
        Node ptr = new Node();

        if (start == null)
        {
            start = node;
        }
        else {
            ptr = start;

            while(ptr.next != null ) 
            {
                ptr = ptr.next;
            }

            ptr.next = node;
        }
    }
    
    public void deleteGiven() throws Exception 
    {
        
        String ticketNum = input.nextLine();
        Node ptr, preptr = new Node();
        
        ptr = start;
        if(ptr.ticketNum.equalsIgnoreCase(ticketNum))
            {
               System.out.println("Ticket Number " + ptr.ticketNum + " canceled");
               start = start.next;
            }
        else
            {
                while(!(ptr.ticketNum.equalsIgnoreCase(ticketNum))) 
                {
                    preptr = ptr;
                    ptr = ptr.next;
                }
                System.out.println("Ticket Number " + ptr.ticketNum + " canceled");
                preptr.next = ptr.next; 
            }
    }
    
    public void display() throws Exception 
    {
        Node ptr = start;
        System.out.printf("%s", "First Name");
        System.out.printf("%17s", "Last Name");
        System.out.printf("%17s", "Address");
        System.out.printf("%25s\n", "Ticket Number");
        
        if (getSize() == 0)
        {
            throw new Exception("Linked List is emtpy");
        }
        else 
        {
            ptr = start;
            while(ptr != null) 
            {
                System.out.printf("%s", ptr.fname);
                System.out.printf("%15s", ptr.lname);
                System.out.printf("%22s", ptr.address);
                System.out.printf("%23s\n", ptr.ticketNum);
                ptr = ptr.next;
            }
        }
    }
    
    public void displayInfo() throws Exception 
    {
        
        String ticketNum = input.nextLine();
        Node ptr, preptr = new Node();
        
        ptr = start;
        if(ptr.ticketNum.equalsIgnoreCase(ticketNum))
            {
               System.out.println("Ticket Number: " + ptr.ticketNum);
               System.out.println("Name: " + ptr.fname + " " + ptr.lname);
               System.out.println("Address: " + ptr.address);
            }
        else
            {
                while(!(ptr.ticketNum.equalsIgnoreCase(ticketNum))) 
                {
                    preptr = ptr;
                    ptr = ptr.next;
                }
               System.out.println("Ticket Number: " + ptr.ticketNum);
               System.out.println("Name: " + ptr.fname + " " + ptr.lname);
               System.out.println("Address: " + ptr.address);
            }
    }

    public int getSize() throws Exception 
    {
        int size = 0;
        Node ptr = start;

        while(ptr != null) 
        {
            size++;
            ptr = ptr.next;
        }

        return size;
    }
    
    
}
