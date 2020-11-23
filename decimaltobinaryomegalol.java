package pixles_plan_2;

import java.util.Scanner;

public class decimaltobinaryomegalol {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numberBinary; 
		
		Scanner inputDecimalBinary = new Scanner(System.in);
		
		while(true) {
		System.out.println("Please enter a positive number/integer > ");
		numberBinary = inputDecimalBinary.nextInt();
		String decimalTobinaryPositive = inputDecimalBinary.next();
		
		if (numberBinary < 0) { // if number is less than 0 it will spit out and error message
			System.out.println("This number is not a positive number/integer");
			System.out.println("Please try again");
			System.out.println();
		}
		
		else {
			System.out.println();
			System.out.print("Convert from " + decimalTobinaryPositive + " is: ");	// To display
			decimalTobinarySample(numberBinary);
			
			}
		
		}

	}	// End main
	
	private static void decimalTobinarySample(int numbersBinary) {		// To 'Formulate'.
		int remainderBinary;
		
		if (numbersBinary  <= 1) {
			System.out.print(numbersBinary);
			return;
		}
		
		remainderBinary = numbersBinary % 2;	// remainderBinary = numberBinary % 2 [SEE NOTES @ Decimal  to Binary]
		decimalTobinarySample(numbersBinary >> 1);
		System.out.print(remainderBinary);
	}	// end  binary

}
