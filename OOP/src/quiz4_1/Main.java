/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz4_1;

class Vehicle
{
    void travelling()
    {
        System.out.println("We are travelling by…\n");
    }
}

class Car extends Vehicle
{
    void drive()
    {
        System.out.println("land and is riding a car\n");
    }
}

class Bicycle extends Vehicle
{
    void bike()
    {
        System.out.println("land in a bike lane with the bicycle\n");
    }
}

class Boat extends Vehicle
{
    void sailing()
    {
        System.out.println("sea, sailing away\n");
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        Car car = new Car();
        car.travelling();
        car.drive();
        System.out.println();
        
        Bicycle bicycle = new Bicycle();
        bicycle.travelling();
        bicycle.bike();
        System.out.println();
        
        Boat boat = new Boat();
        boat.travelling();
        boat.sailing();
    }
    
}
