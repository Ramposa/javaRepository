package groupWorkspace;

import java.util.Scanner;
import static java.lang.System.out;

class Decimal_Convert_Octal {
	
	 static String octalResult = "";
	 static int numberOctal; 
	 static String octalResultA;
	

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
				}	//  End check
					
					else {
				
						System.out.println();
						System.out.println("Convert from " + numberOctal + " is: " + octalResult);	// To display user input then the  result
						decimalTooctalSample(numberOctal);		// Display answer
						System.out.println();
						System.out.println("NOTE: Please put this in reverse order, example start from the right! " +
										  "Starting from the right will make it correct!");
						System.out.println();
				}	// End else
				
			} // While true end
				
		} // End main
		
		private static void decimalTooctalSample(int numberOctal) {
			
			int remainderOctal;
			
			if (numberOctal  <= 0) {
				System.out.print(numberOctal);
				return;
			}
			
			char octal[]= {'0', '1', '2', '3', '4', '5', '6', '7'};		// Character the octal digit
			
			while(numberOctal > 0) {
				remainderOctal = numberOctal % 8;
				octalResultA = octal[remainderOctal] + octalResult;
				numberOctal = numberOctal / 8;
				System.out.print(octalResultA);
			}	// end while statement
			
		} // end deciamlTohexaPositive
		
	} // End class
