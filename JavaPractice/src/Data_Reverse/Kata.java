/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data_Reverse;

import java.util.Scanner;

/**
 *
 * @author CEREZO
 */
public class Kata 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("input size: ");
        int size = input.nextInt();
        
        int[] data = new int[size];
        
        for(int i=0; i<data.length; i++)
        {
            System.out.print( i + " input: ");
            data[i] = input.nextInt();
        }
        
        System.out.println("reverse ");
        
        for(int i=0; i<data.length; i++)
        {
            System.out.println(DataReverse(data)[i]);
        }
    }
    
    public static int[] DataReverse(int[] data)
    {
        int[] reverse = new int[data.length];
        
        int temp = 0;
        for(int i=data.length-1; i>=0; i--)
        {
            if((i+1)%8==0)
            {
                for(int j=i-7; j<=i; j++)
                {
                    reverse[temp] = data[j];
                    temp++;
                }
            }
        }
        
        
        return reverse;
    }
}
