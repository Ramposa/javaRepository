package pixles_plan_2;

import java.util.Scanner;

public class decimalTooctal {
	
	// Static method to branch out
		static String  octalResult="";
		static int numberOctal; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner inputDecimalOctal = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("Please enter a positive number/integer > ");
			numberOctal = inputDecimalOctal.nextInt();
			
			if (numberOctal < 0) { // if number is less than 0 it will spit out and error message
				System.out.println("This number is not a positive number/integer");
				System.out.println("Please try again");
				System.out.println();
			}
				
				else {
			
					System.out.println();
					System.out.println("Convert from " + numberOctal + " is: " + octalResult);	// To display user input then the  result
					decimalTohexaSample(numberOctal);
					System.out.println();
			}
			
		} // While true end
			
	} // End main
	
	private static void decimalTohexaSample(int numberOctal) {
		
		int remainderOctal;
		
		if (numberOctal  <= 0) {
			System.out.print(numberOctal);
			return;
		}
		
		char octal[]= {'0', '1', '2', '3', '4', '5', '6', '7'};
		
		while(numberOctal>0) {
			remainderOctal = numberOctal % 8;
			octalResult = octal[remainderOctal] + octalResult;
			numberOctal = numberOctal / 8;
		}	// end while statement
		

	} // end deciamlTohexaPositive
}