/*
    File: Solution.java
    Description: If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in. Additionally, if the number is negative, return 0 (for languages that do have them).

Note: If the number is a multiple of both 3 and 5, only count it once.
    Programmer: Joebert L. Cerezo
    Date: December 13, 2021
*/
package Multiples_of_3_or_5;

import java.util.Scanner;
/**
 *
 * @author CEREZO
 */
public class Solution {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number: ");
        int number = input.nextInt();
        
        int sum=0;
        
        for(int i=0; i<number; i++)
        {
            if(i%3 == 0 || i%5 == 0)
            {
                sum += i;
                System.out.println(i);
            }
            else if(i%3 == 0 && i%5 == 0)
            {
                sum += i;
                System.out.println("same " + i);
            }
        }
        System.out.println("sum " + sum);
        
//        System.out.println("Multiples count: " + solution(number));
    }
    
    public static int solution(int number)
    {
        int sum=0;
        
        if(number < 0)
        {
            return 0;
        }
        
        for(int i=0; i<number; i++)
        {
            if(i%3 == 0 || i%5 == 0)
            {
                sum += i;
            }
            else if(i%3 == 0 && i%5 == 0)
            {
                sum += i;
            }
        }
        return sum;
    }
    
}
