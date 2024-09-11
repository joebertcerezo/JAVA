/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.pkg5.queue;

import java.util.Random;
public class Test5Queue 
{
    public static void main(String[] args) throws Exception
    {
        Random rand = new Random();
        Queue q1 = new Queue();
        Queue q2 = new Queue();
        Queue q3 = new Queue();
        Queue q4 = new Queue();
        
        int number = 0, countEven = 0, countOdd = 0, totalSum = 0;
        
        //insert 100 numbers to queue
        //it doesnt matter how many even or odd number generated
        //it will be arrange on 10x10 display, excess will automatically deleted
        while(countEven < 1000)
        {
            number = rand.nextInt(100) + 1;
            
            if(number % 2 == 0)
            {
                q1.enQueue(number);
                countEven++;
            }
        }
        
        while(countOdd < 1000)
        {
            number = rand.nextInt(100) + 1;
            
            if(number % 2 != 0)
            {
                q2.enQueue(number);
                countOdd++;
            }
        }
        
        //display and getSum
        System.out.println("q1 10x10");
        q1.display10X10();
        totalSum += q1.getSum();
        
        System.out.println("q2 10x10");
        q2.display10X10();
        totalSum += q2.getSum();
        
        //traverse the queue of q1 and get the number divisible by 10
        while(q1.front != null)
        {
            if(q1.getFront() % 10 == 0)
            {
                q3.enQueue(q1.getFront());
            }
            q1.deQueue();
        }
        
        System.out.println("q3 10x5");
        q3.display10X5();
        totalSum += q3.getSum();
        
        while(q2.front != null)
        {
            if(q2.getFront() % 5 == 0)
            {
                q4.enQueue(q2.getFront());
            }
            q2.deQueue();
        }
        
        System.out.println("q4 5x10");
        q4.display5X10();
        totalSum += q4.getSum();
        
        System.out.println("Total sum from q1 to q4: " + totalSum);
    }
    
}
