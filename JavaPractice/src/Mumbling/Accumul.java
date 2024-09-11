package Mumbling;

import java.util.Scanner;

public class Accumul 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Input string: ");
        String text = input.next();

        System.out.println("result is: " + accum(text));

    }

    public static String accum(String s) 
    {
        String result = "";
        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            
            for(int j=0; j<=i; j++)
            {
                // result += Character.toUpperCase(c);
                
                if(j==0)
                {
                    if(i==0)
                    {
                        result += Character.toUpperCase(c);
                    }
                    else
                    {
                        result += '-';
                    result += Character.toUpperCase(c);
                    }
                }
                else
                {
                    result += Character.toLowerCase(c);
                }
            }
        }
        return result;
    }
}