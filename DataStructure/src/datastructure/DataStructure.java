/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;

import java.util.Scanner;
public class DataStructure {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row = 2, column = 5;
        int[][] oddEven  = new int[row][column];
        int[][] store  = new int[row][column];
        
        for (int i=0; i<oddEven.length; i++)
        {
            for (int j=0; j<oddEven[i].length; j++)
            {
                oddEven[i][j] = input.nextInt();
                if(oddEven[i][j]%2==0 && j%2==0)
                {
                    store[i][j] = oddEven[i][j];
                }
                else
                {
                    store[i][j] = oddEven[i][j];
                }
            }
        }
        
        
        //output
        System.out.println("EVEN");
        for (int i=0; i<store.length; i++)
        {
            for (int j=0; j<store[i].length; j++)
            {
                if(store[i][j]%2==0)
                {
                    System.out.print("["+i+"]["+j+"] " +store[i][j] +" ");
                    System.out.println();
                }
            }
        }
        System.out.println();
        
        System.out.println("ODD");
        for (int i=0; i<store.length; i++)
        {
            for (int j=0; j<store[i].length; j++)
            {
                if(store[i][j]%2!=0)
                {
                    System.out.print("["+i+"]["+j+"] " +store[i][j] +" ");
                    System.out.println();
                }
               
            }
        }
        
    }
    
}
