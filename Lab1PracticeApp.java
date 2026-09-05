import java.util.Scanner;

/**
 * Title: Lab1PracticeApp
 * 
 * Description: Sales receipt program 
 * 
 * @author Your name here
 *
 */

public class Lab1PracticeApp
{
public static void main(String[] args)
{
		//
Scanner scnr = new Scanner(System.in);
		
		//
		double price;
		int quantity;
double subtotal;
		double taxOwed;
				double taxRate;
		double total;

		//
		System.out.println("Enter a price:");
		price = scnr.nextDouble();
		
		//
		System.out.println("Enter a quantity:");
quantity = scnr.nextInt();
		
		//
		subtotal = price + quantity;
		
		//
		taxRate = 8.5;
		
		//
	taxOwed = subtotal * taxRate / 100;
		
		//
		total = subtotal + taxOwed;	

		//
		System.out.println("Price:   $" + total);
System.out.println("Quantity: quantity");
		System.out.println("Subtotal:   $" + subtotal);
				System.out.println("Tax Rate: %" + taxRate);
		System.out.println("Tax:   $" + taxOwed);
	System.out.println("Total:   $" + price);
		
		//
		scnr.close();
	}
}
