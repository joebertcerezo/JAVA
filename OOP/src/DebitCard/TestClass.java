package DebitCard;

import java.util.Scanner;

/**
 *
 * @author CEREZO
 */
public class TestClass
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        float amount = 0F, rate, balance = 0F;
        int choice = 0;
        
//        System.out.println(card.depositCash(amount));
        
        System.out.print("Enter name: ");
        String firstname = input.next();
        String middlename = input.next();
        String lastname = input.next();
        Name n = new Name(firstname , middlename, lastname);
        
        System.out.print("Enter account number: ");
        String accountNumber = input.next();
        
        System.out.print("Enter beginning balance: ");
        balance = input.nextFloat();
        
        DebitCard card = new DebitCard(accountNumber, n, balance);
        
        do
        {
            System.out.println("\nDEBIT CARD TRANSACTON");
            System.out.println("[1] Deposit Cash");
            System.out.println("[2] Withdraw Cash");
            System.out.println("[3] Inquire Balance");
            System.out.println("[4] Calculate Interest Rate");
            System.out.println("[5] Exit\n");
            System.out.print("Your choice: ");
            choice = input.nextInt();
            
            switch(choice)
            {
                case 1:
                    System.out.print("\nEnter amount: ");
                    amount = input.nextFloat();
                    balance += amount;
                    card = new DebitCard(accountNumber, n, balance);
                    card.getbalance();
                    //method to display output
//                    display(firstname, middlename, lastname, accountNumber, balance);
                    System.out.println(card);
                    System.out.println();
                    break;
                case 2:
                    System.out.print("\nEnter amount: ");
                    amount = input.nextFloat();
                    if(card.withdrawCash(amount))
                    {
                        balance = card.inquireBalance();
                        balance -= amount;
                        card = new DebitCard(accountNumber, n, balance);
                        card.getbalance();
                        System.out.println(card);
                    }
                    else
                    {
                        System.out.println("\nINSUFFICIENT FUNDS");
                    }
//                    display(firstname, middlename, lastname, accountNumber, balance);
                    System.out.println();
                    break;
                case 3:
                    card = new DebitCard(accountNumber, n, balance);
//                    display(firstname, middlename, lastname, accountNumber, card.inquireBalance());
                    card.inquireBalance();
                    System.out.println(card);
                    System.out.println();
                    break;
                case 4:
                    System.out.print("\nEnter rate: ");
                    rate = input.nextFloat();
                    System.out.println("\nInterest Incurred: " + String.format("%.2f", card.interest(rate)));
                    break;
            }
            card = new DebitCard(accountNumber, n, balance);
        }while(choice != 5);
        System.out.println("\nEnd of Transaction.");
    }
    
    public static void display(String firstname, String middlename, String lastname, String accountNumber, float balance)
    {
        Name n = new Name(firstname , middlename, lastname);
        
        System.out.println("\nName: " + n);
        System.out.println("Account number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
    
}
