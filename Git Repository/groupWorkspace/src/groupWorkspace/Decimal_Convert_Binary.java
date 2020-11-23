package groupWorkspace;

import java.util.Scanner;

public class Decimal_Convert_Binary {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numberDecimal; 
		
		Scanner inputDecimalBinary = new Scanner(System.in);
		
		while(true) {
			
		System.out.println("Please enter a positive number/integer > ");
		numberDecimal = inputDecimalBinary.nextInt();
		String decimalTobinaryPositive = inputDecimalBinary.next();
		
		if (numberDecimal < 0) { // if number is less than 0 it will spit out and error message
			
			System.out.println("This number is not a positive number/integer");
			System.out.println("Please try again");
			System.out.println();
		}
		
		else {
			
			System.out.println();
			System.out.print("Convert from " + decimalTobinaryPositive + " is: ");	// To display
			decimalTobinarySample(numberDecimal);		// Display the answer from the decimalTobinarySample void
			System.out.println();
			System.out.println();
			
			}
		
		}

	}	// End main
	
	private static void decimalTobinarySample(int numberDecimal) {		// To 'Formulate'.
		int remainderBinary;
		
		if (numberDecimal  <= 1) {
			
			System.out.print(numberDecimal);
			return;
		}
		
		remainderBinary = numberDecimal % 2;	// remainderBinary = numberBinary % 2 [SEE NOTES @ Decimal  to Binary]
		decimalTobinarySample(numberDecimal >> 1);	
		System.out.print(remainderBinary);		// prints out the remainder
		
	}	// end  binary

}
