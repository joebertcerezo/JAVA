/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package print;

/**
 *
 * @author CEREZO
 */
public class Dog 
{
    String dogName, breed, color;
    int ageInMonths;
    public static void main(String[] args)
    {
        Dog dogie = new Dog();
        dogie.dogName = "Bruno";
        dogie.breed = "Aspin";
        dogie.color = "brown";
        dogie.ageInMonths = 13;
        dogie.info();
        dogie.bark();
        
        dogie.dogName = "Hershey";
        dogie.breed = "Shitzu-Poodle";
        dogie.color = "Black";
        dogie.ageInMonths = 8;
        dogie.info();
        dogie.eat();
    }
    
    public Dog()
    {
        //default constructor
    }
    
    public void info()
    {
        System.out.println("Dog's Name: " +dogName);
        System.out.println("Breed: " +breed);
        System.out.println("Color: " +color);
        System.out.println("Age in months: " +ageInMonths);
    }
    
    public void bark()
    {
        System.out.println(" awww... awww...");
        System.out.println();
    }
    
    public void eat()
    {
        System.out.println("nom...nom...");
        System.out.println();
    }
}
