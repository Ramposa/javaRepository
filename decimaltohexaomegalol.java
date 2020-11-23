package pixles_plan_2;

import java.util.Scanner;

public class decimaltohexaomegalol {
	
	// Static method to branch out
		static String  hexaResult="";
		static int numberHexa; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner inputDecimalHexa = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("Please enter a positive number/integer > ");
			numberHexa = inputDecimalHexa.nextInt();
			
			if (numberHexa < 0) { // if number is less than 0 it will spit out and error message
				System.out.println("This number is not a positive number/integer");
				System.out.println("Please try again");
				System.out.println();
			}
				
				else {
			
					System.out.println();
					System.out.println("Convert from " + numberHexa + " is: " +hexaResult);	// To display user input then the  result
					decimalTohexaSample(numberHexa);
			}
			
		} // While true end
			
	} // End main
	
	private static void decimalTohexaSample(int numberHexa) {
		
		int remainderHexa;
		
		if (numberHexa  <= 0) {
			System.out.print(numberHexa);
			return;
		}
		
		char hex[]= {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
		
		while(numberHexa>0) {
			remainderHexa = numberHexa%16;
			hexaResult = hex[remainderHexa] + hexaResult;
			numberHexa = numberHexa / 16;
		}	// end while statement
		

	} // end deciamlTohexaPositive
}