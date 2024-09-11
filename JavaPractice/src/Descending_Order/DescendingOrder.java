package Descending_Order;

import java.util.Scanner;

public class DescendingOrder 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input number: ");
        int num = input.nextInt();
        
        System.out.println("sorted descending order: " + sortDesc(num));
    }
    
    public static int sortDesc(final int num) 
    {
//        String newString = "", temp = "";
//        String numString = Integer.toString(num);
//        int minIndex = 0;
//        
//        for(int i=0; i<numString.length(); i++)
//        {
//            char c = numString.charAt(i);
//            
////            if(Character.getNumericValue(c))
//            minIndex = i;
//            for(int j=i+1; i<numString.length()-1; j++)
//            {
//                if(Character.getNumericValue(c) > Character.getNumericValue(c))
//                {
//                    minIndex = j;
//                }
//            }
//            temp = 
//        }
        
        String numString = Integer.toString(num);
        char[] numChar = new char[numString.length()];
        
        for(int i=0; i<numString.length(); i++)
        {
            numChar[i] = numString.charAt(i);
        }
        
        
        int minIndex = 0;
        char temp = 0;
        for (int i=0; i<numChar.length-1; i++) 
        {
            minIndex = i;
            for (int j=i+1; j<numChar.length; j++) 
            {
                if(numChar[minIndex] < numChar[j])
                {
                        minIndex = j;
                }
            }
            temp = numChar[i];
            numChar[i] = numChar[minIndex];
            numChar[minIndex] = temp;
        }
        
        int result = 0;
        
        return result = Integer.parseInt(new String(numChar));
    }
}
