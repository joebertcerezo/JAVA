/*
    File: Main.java
    Description: Write a simple airline reservation program. The program should display a menu with the following options:
                    [1] - Reserve a ticket
                    [2] - Cancel a reservation
                    [3] - Check ticket information
                    [4] - Display passengers
                    [5] - Customer Query 
                    [0] - Exit
                        *For ticket reservation. your program should accept the ticket number, passenger's last name, first name, and address.
                        *For cancel reservation, you should input the ticket number.
                        *For check ticket information,  ticket number is necessary to display the information.
                        *Customer Query, your program should ask either the last name or first name.
    Programmer: Joebert L. Cerezo
    Date: October 19, 2021
*/
package pkgtry;

//import java.util package and access the Scanner class
import java.util.Scanner;
public class Try
{
    //main method
    public static void main(String[] args) throws Exception
    {
        //create object on class Scanner
        Scanner input = new Scanner(System.in);
        
        //create object on TicketReservation class
        TicketReservation ticket = new TicketReservation();
        int choice = -1;
        
        //while loop for printing the menu and ask user choice inpur; exit when 0
        while (choice != 0)
        {
            //Menu
            System.out.println("\n --------------------------------");
            System.out.println("| [1] - Reserve a ticket         |");
            System.out.println("| [2] - Cancel a reservation     |");
            System.out.println("| [3] - Check ticket information |");
            System.out.println("| [4] - Display passengers       |");
            System.out.println("| [5] - Customer Query           |");
            System.out.println("| [0] - Exit                     |");
            System.out.println(" --------------------------------");
            System.out.print("Enter number: ");
            //input choice
            choice = input.nextInt();
            
            //switch case on the corresponding user choice
            switch(choice)
            {
                //case 1 Reserve a ticket
                case 1:
                    System.out.println("\n[1] - Reserve a ticket");
                    System.out.print("Enter First Name: ");
                    String fname = input.nextLine();
                    fname = input.nextLine();
                    System.out.print("Enter Last Name: ");
                    String lname = input.nextLine();
                    System.out.print("Enter Address: ");
                    String address = input.nextLine();
                    System.out.print("Enter Ticket Number: ");
                    String ticketNum = input.nextLine();
                    ticket.ReserveATicket(fname, lname, address, ticketNum);
                    break;
                    
                //case 2 Cancel a reservation
                case 2:
                    System.out.println("\n[2] - Cancel a reservation");
                    System.out.print("Enter Ticket Number: ");
                    ticketNum = input.nextLine();
                    ticketNum = input.nextLine();
                    ticket.CancelAReservation(ticketNum);
                    break;
                    
                //case 3 Check ticket information
                case 3:
                    System.out.println("\n[3] - Check ticket information");
                    System.out.print("Enter Ticket Number: ");
                    ticketNum = input.nextLine();
                    ticketNum = input.nextLine();
                    ticket.CheckTicketInformation(ticketNum);
                    break;
                    
                //case 4 Display passengers
                case 4:
                    System.out.println("\n[4] - Display passengers");
                    ticket.DisplayPassengers();
                    break;
                    
                //case 5 Customer Query
                case 5:
                    System.out.println("\n[5] - Customer Query");
                    System.out.print("Enter Firstname or Lastname: ");
                    String name = input.nextLine();
                    name = input.nextLine();
                    ticket.CustomerQuery(name);
                    System.out.println("How may I help you?");
                    int choice1;
                    
                        System.out.println(" \t --------------------------------");
                        System.out.println("\t| [1] - Modify credentials       |");
                        System.out.println("\t| [2] - Cancel your reservation  |");
                        System.out.println(" \t --------------------------------");
                        System.out.print("\tEnter number: ");
                        choice1 = input.nextInt();
                        switch(choice1)
                        {
                            case 1:
                                System.out.print("\n[1] - Modify credentials");
                                System.out.print("\n\nCREDENTIALS MODIFIED");
                                ticket.ModifyCredentials(name);
                                break;
                            case 2:
                                System.out.print("\n[2] - Cancel your reservation");
                                System.out.print("\n\nRESERVATION CANCELED");
                                ticket.CancelAReserve(name);
                                break;
                            default:
                                System.out.println("\nInvalid Input");         
                        }
                    break;
                default:
                    System.out.println("\nInvalid Input");     
            }
        }
        
    }

//class for TicketReservation where methods on creation, insertion and deletion of nodes stored
public static class TicketReservation 
{
    Scanner input = new Scanner(System.in);
    
    //create class node with String variables stored and next node
    public class Node 
    {
        String fname, lname, address, ticketNum;
        Node next;
    }
    
    //set Node as start or head in a linkedlist
    public Node start;
    
    //method for creation of new node
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
    
    //method for insertion of new node in a list
    public void ReserveATicket(String fname, String lname, String address, String ticketNum) throws Exception 
    {
        Node node = createNewNode(fname, lname, address, ticketNum);
        Node ptr = new Node();

        if (start == null)
        {
            start = node;
        }
        else 
        {
            ptr = start;

            while(ptr.next != null ) 
            {
                ptr = ptr.next;
            }

            ptr.next = node;
        }
    }
    
    //method for deletion of the choosen node
    public void CancelAReservation(String ticketNum) throws Exception 
    {
        Node ptr, preptr = new Node();
        
        ptr = start;
        if(ptr.ticketNum.equalsIgnoreCase(ticketNum))
            {
                System.out.println("\nTicket Number " + ptr.ticketNum + " canceled");
                start = start.next;
            }
        else
            {
                while(!(ptr.ticketNum.equalsIgnoreCase(ticketNum))) 
                {
                    preptr = ptr;
                    ptr = ptr.next;
                }
                System.out.println("\nTicket Number " + ptr.ticketNum + " canceled");
                preptr.next = ptr.next;
            }
    }
    
    //method to display nodes
    public void DisplayPassengers() throws Exception 
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
                System.out.printf("%17s", ptr.lname);
                System.out.printf("%20s", ptr.address);
                System.out.printf("%23s\n", ptr.ticketNum);
                ptr = ptr.next;
            }
        }
    }
    
    //method to display info on specific node
    public void CheckTicketInformation(String ticketNum) throws Exception 
    {
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
    
    public void CustomerQuery(String name) throws Exception 
    {
        Node ptr, preptr = new Node();
        
        ptr = start;
        if(ptr.fname.equalsIgnoreCase(name) || ptr.lname.equalsIgnoreCase(name))
            {
               System.out.println("\nHello " + ptr.fname + " " + ptr.lname);
            }
        else
            {
                while(!(ptr.fname.equalsIgnoreCase(name) || ptr.lname.equalsIgnoreCase(name))) 
                {
                    preptr = ptr;
                    ptr = ptr.next;
                }
               System.out.println("\nHello " + ptr.fname + " " + ptr.lname);
            }
    }
    
    //customer query modify credentials
    public void ModifyCredentials(String name) throws Exception 
    {
        Node ptr, preptr = new Node();
        
        ptr = start;
        if(ptr.fname.equalsIgnoreCase(name) || ptr.lname.equalsIgnoreCase(name))
            {
               System.out.print("\nEnter First name: ");
               ptr.fname = input.nextLine();
               System.out.print("Enter Last name: ");
               ptr.lname = input.nextLine();
               System.out.print("Enter New Address: ");
               ptr.address = input.nextLine();
            }
        else
            {
                while(!(ptr.fname.equalsIgnoreCase(name) || ptr.lname.equalsIgnoreCase(name))) 
                {
                    preptr = ptr;
                    ptr = ptr.next;
                }
               System.out.print("\nEnter First name: ");
               ptr.fname = input.nextLine();
               System.out.print("Enter Last name: ");
               ptr.lname = input.nextLine();
               System.out.print("Enter New Address: ");
               ptr.address = input.nextLine();
            }
    }
    
    //customer query cancel reservation
    public void CancelAReserve(String name) throws Exception 
    {
        Node ptr, preptr = new Node();
        
        ptr = start;
        if(ptr.fname.equalsIgnoreCase(name) || ptr.lname.equalsIgnoreCase(name))
            {
                System.out.println("\nYour ticket Number " + ptr.ticketNum + " canceled");
                start = start.next;
            }
        else
            {
                while(!(ptr.fname.equalsIgnoreCase(name) || ptr.lname.equalsIgnoreCase(name))) 
                {
                    preptr = ptr;
                    ptr = ptr.next;
                }
                System.out.println("\nYour ticket Number " + ptr.ticketNum + " canceled");
                preptr.next = ptr.next;
            }
    }

    //method to get the size of the linkedlist
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

}


