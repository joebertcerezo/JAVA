/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Consonant_value;

import java.util.Scanner;

public class ConsonantValue 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter string: ");
        String s = input.next();
        
        System.out.println("highest consonant " + solve(s));
    }
    
    public static int solve(final String s) 
    {
        int sum=0, i=1, j=0; 
        int[] count = new int[200];
        
        for(int k='a'; k<='z'; k++)
        {
            count[k] = i++; 
        }
        
        int temp=0;
        for(i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            
            if(c >= 'a' && c <= 'z')
            {
                if(c == 'a' || c == 'e' || c=='i' || c=='o' || c=='u')
                {
                    sum = 0;
                }
                else
                {
                    sum += count[c];
                }
            }
            if(temp<sum)
            {
                temp = sum;
            }
        }
        
        return temp;
    }
}
