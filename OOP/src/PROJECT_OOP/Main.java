package PROJECT_OOP;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        double fah = 0,kel = 0,cel = 0;
        Temperature temp = new Temperature(cel, fah, kel); 
        
        try{
        System.out.println("Temperature Converter:");
        System.out.println("Celsius (1), Fahrenheit (2), Kelvin (3)");
        int tempInput = input.nextInt();
        if(tempInput == 1)
        {
           
        }
        else if(tempInput == 2)
        {
            System.out.println("Enter fahrenheit: ");
            fah = input.nextDouble();
            temp = new Temperature(cel, fah, kel); 
            temp.getFahrenheit();
            temp.fahrenheitToCelsius(fah);
            temp.fahrenheitToKelvin(fah);
            
        }
        else if (tempInput == 3)
        {
            
        }
        temp = new Temperature(cel, fah, kel); 
    }
        catch(Exception e){
            System.out.println("Something went wrong");
        }
        finally{
            System.out.println("Done!");
        }
    }

}
