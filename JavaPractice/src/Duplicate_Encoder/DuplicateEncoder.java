/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Duplicate_Encoder;

import java.util.Scanner;
/**
 *
 * @author CEREZO
 */
public class DuplicateEncoder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter word: ");
        String word = input.nextLine();
        
        System.out.println("Encode: " + encode(word));
    }
    
    public static String encode(String word)
    {
        int count=0;
        String result = ""; 
        char replace;
        
        for(int i=0; i<word.length(); i++)
        {
//            char c = word.charAt(i);
            count=0;
            for(int j=0; j<word.length(); j++)
            {
               if(Character.toUpperCase(word.charAt(i)) == Character.toUpperCase(word.charAt(j)))
               {
                    count++;
               }
            }
            
            if(count>1)
            {
                replace = Character.toUpperCase(word.charAt(i));
//                for(int k=0; k<word.length(); k++)
//                {
//                    if(word.charAt(k) == replace)
//                    {
//                        result += ')';
//                    }
//                }
                result += ')';
            }
            else
            {
                result += '(';
            }
            
        }
        return result;
    }
}
