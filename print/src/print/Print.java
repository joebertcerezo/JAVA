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
import java.util.Scanner;
public class Print
{
	public static void main(String[] args)
	{
	Scanner input = new Scanner(System.in);
	int firstnum = 0, secondnum = 0, product = 0;
		System.out.print("Input first number: ");
		firstnum = input.nextInt(); 
		System.out.print("Input second number: ");
		secondnum = input.nextInt();
		
		product = firstnum * secondnum;
		System.out.println(firstnum + " * " + secondnum + " = " + product);

	}
}


