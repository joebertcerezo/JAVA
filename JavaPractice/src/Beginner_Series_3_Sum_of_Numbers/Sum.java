package Beginner_Series_3_Sum_of_Numbers;

import java.util.Scanner;

public class Sum
  {
      public static void main(String[] args)
      {
          Scanner input = new Scanner(System.in);

        System.out.print("Enter 1st: ");
        int a = input.nextInt();

        System.out.print("Enter 2nd: ");
        int b = input.nextInt();

        System.out.println("Sum is: "+ GetSum(a,b));
      }
     
      public static int GetSum(int a, int b)
     {
      int sum = 0;

        if(a==b)
        {
            return a;
        }
        if(a>b)
        {
            for(int i=b; i<=a; i++)
            {
                sum += i;
            }
        }
        else
        {
            for(int i=a; i<=b; i++)
            {
                sum += i;
            }
        }
      
        
      return sum;
     }
  }