
package Detect_Pangram;

import java.util.Scanner;

public class PangramChecker 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter string: ");
        String sentence = input.nextLine();
        
        System.out.print(check(sentence));
    }
    
    public static boolean check(String sentence)
    {
        int count=0;
        String removeDuplicate = "";
        
        //remove duplicates
        for(int i=0; i<sentence.length(); i++)
        {
            count = 0;
            for(int j=0; j<=i; j++)
            {
                if(Character.toLowerCase(sentence.charAt(i)) == Character.toLowerCase(sentence.charAt(j)))
                {
                    count++;
                }
            }
            if(count>1)
            {
                continue;
            }
            else
            {
                removeDuplicate += Character.toLowerCase(sentence.charAt(i));
            }
        }
        
        sentence = removeDuplicate;
        
        count=0;
        for(int i=0; i<sentence.length(); i++)
        {
            for(int k='a'; k<='z'; k++)
            {
                if(Character.toLowerCase(sentence.charAt(i)) == k)
                {
                    count++;
                }
            }
        }
        
        if(count!=26)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
