package groupWorkspace;

import java.util.Scanner;

public class Decimal_Convert_Hexa {
	
	// Static method to branch out
		static String  hexaResult = "";
		static int numberHexa; 
		static String hexaResultA = "";
		static String input = hexaResultA;
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner inputDecimalHexa = new Scanner(System.in);	// States what is an input
		
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
					System.out.println("Convert from " + numberHexa + " is: ");	// To display user input then the  result
					System.out.println();
					decimalTohexaSample(numberHexa);	// Enable to display
					System.out.println();
					System.out.println("NOTE: Please put this in reverse order, example start from the right! " +
									  "Starting from the right will make it correct!");
					System.out.println();
					
			}
		} // While true end
			
	} // End main
	
	private static void decimalTohexaSample(int numberHexa) {
		
		int remainderHexa;
		
		if (numberHexa  <= 0) {
			System.out.print(numberHexa);
			return;
		}
		
		char Hexa[]= {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
		
			
			while(numberHexa > 0) {
				remainderHexa = numberHexa % 16;
				hexaResultA = Hexa[remainderHexa] + hexaResult;	
				numberHexa = numberHexa / 16;
				System.out.print(hexaResultA);
				
		}	// end while statement
		

	} // end deciamlTohexaPositive
}
