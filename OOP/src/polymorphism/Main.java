/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) 
    {
        Shape myShape = new Shape(); //create object on Shape class
        Triangle myTriangle = new Triangle(); //create object on Triangle class
        Circle myCircle = new Circle(); //create object on Circle class
        
        myShape.area();
        myTriangle.area(3);
        myTriangle.area();
        
        myShape.area();
        myCircle.area(3);
        myCircle.area();
    }
    
}

class Shape
{
    public static void area()
    {
        System.out.println("The formula for area of ");
    }
    public static void cal()
    {
        System.out.println("call");
    }
}

class Triangle extends Shape
{
    //method overriding
    public static void area()
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("input base: ");
        double base = input.nextDouble();
        System.out.println("input height: ");
        double height = input.nextDouble();
        
        System.out.println("The area of the triangle is: " + 0.5*base*height + "\n");
    }
    
    //method overloading
    public static void area(int times)
    {
        for(int i=0; i<times; i++)
        {
            System.out.println("Triangle is 0.5 * base * height");
        }
    }
}

class Circle extends Shape
{
    //method overriding
    public static void area()
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("input radius: ");
        double radius = input.nextDouble();
        
        System.out.println("the area of the circle is: " + 3.14*radius*radius + "\n");
    }
    
    //method overloading
    public static void area(int times)
    {
        for(int i=0; i<times; i++)
        {
            System.out.println("Circle is 3.14 * radius * radius  ");
        }
    }
}
