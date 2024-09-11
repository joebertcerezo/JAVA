/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleinheritance;

import java.util.Scanner;
public class Rectangle extends Shape
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        Rectangle rect = new Rectangle();
        
        System.out.print("Input Length = ");
        double length = input.nextDouble();
        
        System.out.print("Input Width = ");
        double width = input.nextDouble();
        
        System.out.println("Area of Rectangle is " + rect.getArea(length, width));
    }
}
