package NetbeansGUI_CEREZO;

import DebitCard.*;

/**
 *
 * @author CEREZO
 */
public class DebitCard 
{
    private String Name, accountNumber;
    private float balance;
    
//    Name Name = new Name(firstName,middleName,lastName);
            
    public DebitCard(String accountNumber, String Name, float balance)
    {
        this.accountNumber = accountNumber;
        this.Name = Name;
        this.balance = balance;
    }
    
    //getters
    public String getaccountNumber()
    {
        return this.accountNumber;
    }
    public String getName()
    {
        return this.Name;
    }
    public float getbalance()
    {
        return this.balance;
    }
    
    //setters
    public void setaccountNumber(String accountNumber)
    {
        this.accountNumber = accountNumber;
    }
    public void getName(String Name)
    {
        this.Name = Name;
    }
    public void setbalance(float balance)
    {
        this.balance = balance;
    }
    
    
    //methods
    public float inquireBalance()
    {
        return getbalance();
    }
    
    public float depositCash(float amount)
    {
        return amount;
    }
    
    public boolean withdrawCash(float amount)
    {
        if(inquireBalance() < amount)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    
    public float interest(float rate)
    {
        float interest = 0F;
        
        interest = inquireBalance() * ((rate/100)/12);
        
        return interest;
    }
    
    public String toString()
    {
//        return Name + " " + accountNumber + " " + balance;
        return "\nName: " + Name +
               "\nAccount number: " + accountNumber +
               "\nBalance: " + String.format("%.2f", balance);
    }
}
