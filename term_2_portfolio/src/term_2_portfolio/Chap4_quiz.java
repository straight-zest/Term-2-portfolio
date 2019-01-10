package term_2_portfolio;
import java.util.Scanner;

/*
 * Gabriel Carlile
 * 10/18
 */

public class Chap4_quiz {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	//Variables
	double USD;
	double RMB;
	double conversion_rate = 6.81;
	double conversion_direction;
	
	//First Output
	System.out.println("To calculate from USD to RMB, please enter 0. To calculate from RMB to USD, please enter 1.");
	conversion_direction = input.nextDouble();
	
	//USD > RMB or RMB > USD
	if (conversion_direction == 0){
		//User prompt and input
		System.out.println("Please enter your amount in USD.");
		USD = input.nextDouble();
		
		//Calculation
		RMB = USD * conversion_rate;
		
		//Display
		System.out.println("$" + USD + " is ");
		System.out.printf("¥%.2f", RMB);
		}
	else if (conversion_direction == 1){
		//User prompt and input
		System.out.println("Please enter your amount in RMB.");
		RMB = input.nextDouble();
		
		//Calculation
		USD = RMB / conversion_rate;
		
		//Display
		System.out.println("¥" + RMB + " is ");
		System.out.printf("$%.2f", USD);
		}
	}
}


