
package OOP_Quiz_3_2;

public class Main 
{
    public static void main(String[] args) 
    {
        StudentInfo st1 = new StudentInfo(1910145, "Vasel Go", "Pardo, Cebu", "Aug 9,2010", 11, "Maria Go", "(032)489-9107", "Grade 6", "Mrs. Crtistita Garcia");
        st1.getIdNum();
        st1.displayname();
        st1.getaddress();
        st1.getbirthdate();
        st1.getage();
        st1.getguardian();
        st1.getcontactNo();
        st1.displaygradeLevel();
        st1.displayadviser();
        
        System.out.println();
        
        StudentInfo st2 = new StudentInfo(1910167, "Franchesca Arriz", "Talisay City, Cebu", "October 20 ,2011", 10, "Reynaldo Arriz", "(032)356-7789", "Grade 5", "Mr. Brendon Mancao");
        st2.getIdNum();
        st2.displayname();
        st2.getaddress();
        st2.getbirthdate();
        st2.getage();
        st2.getguardian();
        st2.getcontactNo();
        st2.displaygradeLevel();
        st2.displayadviser();
        
        System.out.println();
        
        StudentInfo st3 = new StudentInfo(1910188, "Arthur Banting", "Urgello, Cebu City", "January 2 ,2012", 9, "Marcia Banting", "0921-777-8899", "Grade 4", "Mrs. Alice Guan");
        st3.getIdNum();
        st3.displayname();
        st3.getaddress();
        st3.getbirthdate();
        st3.getage();
        st3.getguardian();
        st3.getcontactNo();
        st3.displaygradeLevel();
        st3.displayadviser();
    }
    
}
