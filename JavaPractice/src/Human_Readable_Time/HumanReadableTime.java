/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Human_Readable_Time;

import java.util.Scanner;
public class HumanReadableTime 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter seconds: ");
        int seconds = input.nextInt();
        
        System.out.println("time is " + makeReadable(seconds));
    }
    
    public static String makeReadable(int seconds) 
    {
        int hours, minutes, second;
        
        hours = seconds / 3600;
        minutes = (seconds % 3600) / 60;
        second = seconds % 60;
        
        String s = String.format("%02d:%02d:%02d",hours, minutes, second);

        return s;
    }
}
