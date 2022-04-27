	//Author: Divine Iloh
	//BINS 5312
	//Date: 03/03/2022

package PaintGallons;
import java.util.Scanner;
public class paint_gallons {

	//creating a method to calculate square footage.
	public static double CalculateFootage (double length, double width)
	{
		double square_footage;
		square_footage = length * width;
		return square_footage;
	}
	
	
	//creating a method to calculate and return number of gallons needed for the square footage.
	public static double CalculateGallons(double square_footage)
	{
		double num_gallons = (square_footage/350);
		return num_gallons;
	}
	
	
	//creating a method to calculate the cost of paint needed for the job.
	public static double CalculatePaintCost (double num_gallons)
	{
		double paint_price = 32;
		double paint_cost = (num_gallons * paint_price);
		return paint_cost;
	}
	
	
	//creating a method to calculate and return cost of labor
	public static double CalculateLaborCost (double num_gallons)
	{
		int hours_per_gallon = 6;
		double hourly_pay = 120;
		double pay_per_gallon = (hours_per_gallon * hourly_pay);
		double labor_cost = (pay_per_gallon * num_gallons);
		return labor_cost;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//define variables
		double length = 0;
		double width = 0;
		Scanner input = new Scanner (System.in);
		
		//request input from user and store it in length
		System.out.println("Enter the length of the room >>>");
		length = input.nextDouble();
		
		//request input from user and store it in width
		System.out.println("Enter the width of the room >>>");
		width = input.nextDouble();
		
		
		double square_footage = CalculateFootage (length, width);  //calling the CalculateFootage method
		double num_gallons = CalculateGallons (square_footage);    //calling the CalculateGallons method
		double paint_cost = CalculatePaintCost (num_gallons);     //calling the CalculatePaintCost method
		double labor_cost = CalculateLaborCost (num_gallons);     //calling the CalculateLaborCost method
		
		
		double total_cost = (paint_cost + labor_cost);
		
		
		//display invoice and output
		System.out.println("Cost of Paint Job");
		System.out.println("Square Footage:       " + String.format("%,.2f", square_footage) + " square foot");
		System.out.println("No of Paint Gallons:  " + String.format("%,.2f", num_gallons) + " gallons of paint");
		System.out.println("Paint Cost:          $" + String.format("%,.2f", paint_cost));
		System.out.println("Labor Cost:          $" + String.format("%,.2f", labor_cost));
		System.out.println("Total Cost:          $" + String.format("%,.2f", total_cost));
		
	}

}
