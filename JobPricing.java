	//Author: Divine Iloh
	//BINS 5312
	//Date: 03/03/2022

package JobPricing;
import java.util.Scanner;
public class JobPricing {

	//creating a variable to determine the estimate of the job
	public static double JobEstimate (double material_cost, double work_hour, double travel_hour)
	{
		//declaring variables
		double hourly_rate = 35;
		double travel_rate = 12;
		double job_estimate;
		double wage = hourly_rate * work_hour;
		
		//if and else statement to determine if the job requires travel or not
		//and add travel expense to labor cost if travel is involved
		if (travel_hour <= 0)
		{
			job_estimate = (material_cost + wage);
		}
		
		else
		{
			job_estimate = (material_cost + wage + (travel_rate * travel_hour));
		}
		
		return job_estimate;
	}
	
	
	//creating a method that sales tax to job estimate
	public static double ComputeTax (double job_estimate, double sales_tax)
	{
		double total_job_estimate = job_estimate + sales_tax;
		return total_job_estimate;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//define variables
		String job_name;
		double material_cost, work_hour, travel_hour;
		double job_estimate, total_job_estimate, sales_tax;
		
		Scanner input = new Scanner (System.in);
		
		
		//input data from user and save in variables.
		System.out.println("What is the name of the job? >>>");
		job_name = input.nextLine();
		
		System.out.println("What is the cost of materials? >>>");
		material_cost = input.nextDouble();
		
		System.out.println("How many hours are required for the work? >>>");
		work_hour = input.nextDouble();
		
		System.out.println("How many hours are required for travel? >>>");
		travel_hour = input.nextDouble();
		
		
		//calling the job estimate method to determine what the job will cost
		job_estimate = JobEstimate(material_cost, work_hour, travel_hour);
		
		sales_tax = 0.075 * job_estimate; //compute sales tax.
		
		//calling the total job estimate method
		total_job_estimate = ComputeTax(job_estimate, sales_tax);
		
		
		//display output from computed fields.
		System.out.println("Job Name:     " + job_name);
		System.out.println("Job Cost:    $" + String.format("%,.2f", job_estimate));
		System.out.println("Taxes:       $" + String.format("%,.2f", sales_tax));
		System.out.println("Total Cost:  $" + String.format("%,.2f", total_job_estimate));
		
		
	}

}
