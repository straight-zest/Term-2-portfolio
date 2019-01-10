package term_2_portfolio;

import java.util.Scanner;

/*
 * Gabriel Carlile
 * 10/18
 */

public class First_grade_addition {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in); 
	
	//Variables
	int num1 = 0;
	int num2 = 0;
	int user_answer;
	int correct_answer;
	int vic_pts = 0;
	
	//Instructions
	System.out.println("You get one point every time you get the correct answer. Get 10 points to Win!");
	
	//Winning the Game
	while (vic_pts < 10) {
	
	//Random Numbers
	num1 = (int)(System.currentTimeMillis() % 10);
	num2 = (int)(System.currentTimeMillis() /7 % 10);	
	
	//calculating answer
	correct_answer = num1 + num2;
	
	//Question
	System.out.print("What does " + num1 + "+" + num2 + " Equal? Please Type Your Answer Below!");
		
	//Get input
	user_answer = input.nextInt();
	
	//Checking and Displaying Answer
	if (user_answer == correct_answer){
		System.out.println("Correct!");
		vic_pts = vic_pts + 1;
		}
	else {
		System.out.println("Sorry, that is not the correct answer. The correct answer is " + correct_answer);
	}
		}
	
	if (vic_pts==10) {
	System.out.println("Congradulations! You Earned 10 Points! You Win!");	
	
		}
	}
}
