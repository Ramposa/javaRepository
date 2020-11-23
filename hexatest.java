package pixles_plan_2;

import java.util.Scanner;

public class hexatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a positive number/integer > ");
		int numberHexa = input.nextInt();
		String decimalTohexaPositive = input.next();
		
		if (numberHexa < 0) { // if number is less than 0 it will spit out and error message
			System.out.println("This number is not a positive number/integer");
			System.out.println("Please try again");
		}
		// Storing remainder
		int remainderHexa;
		
		// Results
		String hexaResult="";
		
		// Hexadecimal "Tables"
		
		char hex[]= {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
		
		while(numberHexa>0) {
			remainderHexa = numberHexa % 16;
			hexaResult = hex[remainderHexa] + hexaResult;
			numberHexa = numberHexa / 16;
		}	// end while statement
			
		System.out.println("Method 2: Deciaml to hexadecial: " +hexaResult);

	}
	
}
