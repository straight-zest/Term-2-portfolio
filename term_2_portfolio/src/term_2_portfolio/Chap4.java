package term_2_portfolio;

import java.util.Scanner;

/*
 *Gabriel Carlile
 *10/18 
 */

public class Chap4 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	//Variables
	int current_day;
	int future_day;
	int time;
	int total1;
	
	//User Input
	System.out.println("Please enter the day of the week. \r\n" +
	"(NOTE: Sunday:0, Monday: 1, Tuesday: 2, Wednesday: 3, Thursday: 4, Friday: 5, Saturday: 6");
	current_day = input.nextInt();
	
	System.out.println("How many days from now would you like to know the day of the week?");
	time = input.nextInt();
	
	//Calculating total (I'm calling the time passed plus the current day "total" because I'm not positive what I should call it
	total1 = current_day + time;
	
	//Switch
	switch (total1 % 7) {
	case 0:
		System.out.println("The day of the week will be Sunday.");
		
	case 1:
		System.out.println("The day of the week will be Monday.");
		
	case 2:
		System.out.println("The day of the week will be Tuesday.");
		
	case 3:
		System.out.println("The day of the week will be Wednesday.");
	
	case 4:
		System.out.println("The day of the week will be Thursday.");
	
	case 5:
		System.out.println("The day of the week will be Friday.");
	
	case 6:
		System.out.println("The day of the week will be Saturday.");
	}
	
	}

}
