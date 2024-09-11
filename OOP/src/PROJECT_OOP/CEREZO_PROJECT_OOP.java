/*
    File: CEREZO_PROJECT_OOP.java
    Description: Create a program for Temperature Converter
        - It should accept either Celsius , Fahrenheit or Kelvin and convert it to a desired Unit of measure of a temperature (°C, °F, or K)
        - Apply Exceptions Handling in Java to help trap the unnecessary input/entry
        - Apply other necessary Java concepts to the program/code
        - Have a necessary documentation/comment per block of codes  
    Programmer: Joebert L. Cerezo
    Date: February 22, 2022
*/
package PROJECT_OOP;
import java.util.Scanner;

public class CEREZO_PROJECT_OOP 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Temperature_Converter convert = new Temperature_Converter(); //creation of an instance of a class
        Celsius_Fahrenheit_Kelvin celsius = new Celsius_Fahrenheit_Kelvin();
        
        System.out.println("Temperature Converter");
        System.out.println("Type C for Celsius <°C to °F> and <°C to K>");
        System.out.println("Type F for Celsius <°F to °C> and <°F to K>");
        System.out.println("Type K for Celsius <K to °C> and <K to °F>");
        System.out.print("Input choice: ");
        char choice = input.next().charAt(0);
        
        try //try a block of code
        {
            switch(choice)
            {
                case 'C':
                case 'c':
                    System.out.println("\n<°C to °F> and <°C to K>");
                    System.out.print("Input Celsius: ");
                    double number = input.nextDouble();
                    
                    //call setter and set value of celcius
                    celsius.setFahrenheit(number); 
                    celsius.setKelvin(number);
                    
                    //display output using getter
                    System.out.println(number + "°C to Fahrenheit: " + celsius.getFahrenheit() + "°F");
                    System.out.println(number + "°C to Kelvin: " + celsius.getKelvin() + "K");
                    break;
                case 'F':
                case 'f':
                    System.out.println("\n<°F to °C> and <°F to K>");
                    System.out.print("Input Fahrenheit: ");
                    number = input.nextDouble();
                    
                    convert.convert();
                    System.out.println(number + "°F to Celsius: " + String.format("%.2f°C", convert.Fahrenheit_Celsius(number)));
                    System.out.println(number + "°F to Kelvin: " + String.format("%.2fK", convert.Fahrenheit_Kelvin(number)));
                    break;
                case 'K':
                case 'k':
                    System.out.println("\n<K to °C> and <K to °F>");
                    System.out.print("Input Kelvin: ");
                    number = input.nextDouble();
                    
                    convert.convert();
                    System.out.println(number + "K to Celsius: " + String.format("%.2f°C", convert.Kelvin_Celsius(number)));
                    System.out.println(number + "K to Fahrenheit: " + String.format("%.2f°F", convert.Kelvin_Fahrenheit(number)));
                    break;
            }
        }
        catch (Exception e) //catch invalid input
        {
            System.out.println("\nInput must be a number.");
        }
        finally //display after execution of try and catch
        {
            switch(choice)
            {
                case 'C':
                case 'c':
                case 'F':
                case 'f':
                case 'K':
                case 'k':
                    System.out.println("\nExecution done!");
                    break;
                default:
                    System.out.println("\nInvalid entry or option. Program Execution Done.");
                    break;
            }
        }
    }
}

//using encapsulation
class Celsius_Fahrenheit_Kelvin
{
    //hide variables in the scope of a class
    private double fahrenheit, kelvin;
    
    //getters and setters
    public void setFahrenheit(double celsius)
    {
        this.fahrenheit = (celsius*9 / 5) + 32;
    }
    
    public double getFahrenheit()
    {
        return this.fahrenheit;
    }
    
    public void setKelvin(double celsius)
    {
        this.kelvin = celsius + 273.15;
    }
    
    public double getKelvin()
    {
        return this.kelvin;
    }
}

//using inheritance 
//where Temperature_Converter class extends to Fahrenheit and Kelvin class
class Temperature_Converter extends Fahrenheit
{
    public void convert()
    {
        System.out.println("Convertion:");
    }
}

class Fahrenheit extends Kelvin
{
    public double Fahrenheit_Celsius(double fahrenheit)
    {
        return (fahrenheit - 32) * 5 / 9;
    }
    
    public double Fahrenheit_Kelvin(double fahrenheit)
    {
        return ((fahrenheit - 32) * 5 / 9) + 273.15; 
    }
}

class Kelvin
{
    public double Kelvin_Celsius(double kelvin)
    {
        return kelvin - 273.15;
    }
    
    public double Kelvin_Fahrenheit(double kelvin)
    {
        return ((kelvin - 273.15)*9 / 5) + 32; 
    }
}