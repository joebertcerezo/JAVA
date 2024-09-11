/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Scenario1;

class Chef
{
    public void makeSalad()
    {
        System.out.println("Im making salad...");
    }
    
    public void makeSoup()
    {
        System.out.println("Im making soup...");
    }
}

class FilipinoCuisine extends Chef
{
    public void makeAdobo()
    {
        System.out.println("Im making adobo...");
    }
    
    public void makePansit()
    {
        System.out.println("Im making pansit...");
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        FilipinoCuisine food = new FilipinoCuisine();
        
        food.makeSalad();
        food.makeSoup();
        food.makeAdobo();
        food.makePansit();
    }
    
}
