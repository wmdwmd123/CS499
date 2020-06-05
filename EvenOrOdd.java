//Import Scanner to take in user input
import java.util.Scanner;

public class EvenOrOdd {
	
	public static void main (String[] args) { 
        
		//Create Scanner object to take in user input
		Scanner in = new Scanner(System.in);
			
		//Variables to keep track of the two numbers the user chooses
		int userChoice = 0;
		int divisibleBy = 0;

		//Input first number
		System.out.println("Enter any integer.");
		userChoice = in.nextInt();

		//Input second number
		System.out.println("Enter another integer to see if your first integer is divisible by this new integer.");
		divisibleBy = in.nextInt();
		
		//Close Scanner
		in.close();

		//Check if first number is odd or even
		if(userChoice % 2 == 0)
		{
			System.out.println("Your first number is even.");
		}
		else
		{
			System.out.println("Your first number is odd.");
		}

		//Check if first number is divisible by second number
		if(divisibleBy == 0 || userChoice % divisibleBy != 0)
		{
			System.out.println("The number " + userChoice + " is not divisible by " + divisibleBy + ".");
		}
		else
		{
			System.out.println("The number " + userChoice + " is divisible by " + divisibleBy + ".");
		}
	}
}
