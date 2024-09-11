/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;
import java.util.Scanner;

public class DataStructure1 {
    public static void main(String[] args)
    {   
        int[] listA = new int[10];
        int[] listB = new int[10];
        
        //display array
        System.out.println("Array before inputted: ");
        printArray(listA, listA.length); //call printArray
        System.out.println();
        
        //input array
        System.out.println("\nInput 10 integers: ");
        fillArray(listA, listA.length); //call fillArray
        System.out.println();
        
        //display sum of all inputted 
        System.out.println("The sum of all the inputed array is: " +sumArray(listA, listA.length)); //call sumArray
        System.out.println();
        
        //display largest element in array
        System.out.print("The largest element is in index "+indexLargestElement(listA, listA.length)+": ");
        int maxIndex = 0;
        System.out.println(listA[indexLargestElement(listA, listA.length)]);
        System.out.println();
        
        //copy array from one variable to another
        System.out.print("Copy array from one variable to another: ");
        System.out.println("\nOriginal Array: ");
        printArray(listA, listA.length);
        System.out.println("\nCopied Array: ");
        copyArray(listA, listB, listA.length);
        
        
        
        
        magic(listA);
    }
    static void magic(int[] list)
    {
        
    }
    
    
    
  static void fillArray(int[] list, int numOfElements)
   {
     Scanner console = new Scanner(System.in);
     for (int index = 0; index < numOfElements; index++)
     {
       list[index] = console.nextInt();
     }
   }
  
   //method to display array
   static void printArray(int[] list, int numOfElements)
   {
     for (int index = 0; index < numOfElements; index++)
     {
       System.out.print(list[index] +" ");
     }
   }
  
   //method to sum up array
   static int sumArray(int[] list, int numOfElements)
   {
     int sum=0;
     for (int index = 0; index < numOfElements; index++)
     {
       sum += list[index];
     }
     return sum;
   }
  
   //find largest element in array
    static int indexLargestElement(int[] list, int numOfElements)
   {
     int maxIndex = 0;
     for (int index = 0; index < numOfElements; index++)
     {
       if (list[maxIndex] < list[index])
       {
         maxIndex=index;
       }
     }
     return maxIndex;
   }
  
   //Copy Array from another array
   static void copyArray(int[] list, int[] listB, int numOfElements)
   {
     for (int index = 0; index < numOfElements; index++)
     {
       listB[index] = list[index];
     }
     
     for (int index = 0; index < numOfElements; index++)
     {
       System.out.print(listB[index]+" ");
     }
   }
  
}
