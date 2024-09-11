package NetbeansGUI_CEREZO;

import DebitCard.*;

/**
 *
 * @author CEREZO
 */
public class Name 
{
    private String firstName,middleName,lastName;
            
    public Name(String firstName, String middleName, String lastName)
    {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }
    
    //getters
    public String getfirstName()
    {
        return this.firstName;
    }
    public String getmiddleName()
    {
        return this.middleName;
    }
    public String getlastName()
    {
        return this.lastName;
    }
    
    //setters
    public void setfirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public void setmiddleName(String middleName)
    {
        this.middleName = middleName;
    }
    public void setlastName(String lastName)
    {
        this.lastName = lastName;
    }
    
    public String toString()
    {
        return firstName + " " + middleName + " " + lastName;
    }
}
