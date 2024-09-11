package PROJECT_OOP;

public class Temperature {
    private double celsius;
    private double fahrenheit;
    private double kelvin;
    
    public Temperature(double celsius, double fahrenheit, double kelvin)
    {
        this.celsius = celsius;
        this.fahrenheit = fahrenheit;
        this.kelvin = kelvin;
    
}
    public void setCelsius(double celsius)
    {
        this.celsius = celsius;
    }
    public double getCelsius()
    {
        return this.celsius;
    }
    
    public void setFahrenheit(double fahrenheit)
    {
        this.fahrenheit = fahrenheit;
    }
    public double getFahrenheit()
    {
        return this.fahrenheit;
    }
    
    public void setKelvin(double kelvin)
    {
        this.kelvin = kelvin;
    }
    public double getKelvin()
    {
        return this.kelvin;
    }
    
    
    public void celsiusToFahrenheit()
    {
        System.out.println("CELCIUS TO FAHRENHEIT");
    }
    public void celsiusToKelvin()
    {
        System.out.println("CELSIUS TO KELVIN");
    }
    
    public void fahrenheitToKelvin(double fahrenheit)
    {
        System.out.println("FAHRENHEIT TO KELVIN");
        System.out.println(((fahrenheit - 32) * 5 / 9) + 273.15);
    }
    public void fahrenheitToCelsius(double fahrenheit)
    {
        System.out.println("FAHRENHEIT TO CELSIUS");
        System.out.println((fahrenheit - 32) * 5 / 9);
    }
    
    public void kelvinToCelsius()
    {
        System.out.println("KELVIN TO CELSIUS");
    }
    public void kelvinToFahrenheit()
    {
        System.out.println("KELVIN TO FAHRENHEIT");
    }
}
