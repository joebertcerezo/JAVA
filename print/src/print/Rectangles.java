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

public class Rectangles
{
    double height, width, area;
	public static void main(String[] args)
	{
            Rectangles area = new Rectangles();
            
            System.out.println("Rectangle No: 1");
            area.width = 21.6;
            area.height = 10.0;
            area.given();
            area.area();
            
            System.out.println("Rectangle No: 2");
            area.width = 18.97;
            area.height = 6.75;
            area.given();
            area.area();
            
            System.out.println("Rectangle No: 3");
            area.width = 67.2;
            area.height = 10.0;
            area.given();
	}
        
        public Rectangles()
        {
            //default contructor
        }
        
        public void given()
        {
            System.out.println("width: " + width);
            System.out.println("height: " + height);
        }
        
        public void area()
        {
            area = height * width;
            System.out.println("The area of the rectangle is " +area);
            System.out.println();
        }
}


