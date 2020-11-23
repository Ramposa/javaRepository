package groupWorkspace;

import java.util.Scanner;

class testcorner {
	
	static int numberBinary;
	static Scanner inputBinary = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(true){
			System.out.println("Please enter a binary number > ");
			numberBinary = inputBinary.nextInt();
			String binarayTodecimalPositive;
			
			if (numberBinary < 0)
			if (numberBinary > 2) {
				
				System.out.println("This is not a binary number. Ivalid input.");
				System.out.println("Please try again");
				System.out.println();
				
			}
			
			else {
				
				System.out.println();
				System.out.print("Convert from " + inputBinary + " is: ");	// To display
				binaryTodecimal(numberBinary);		// Display the answer from the decimalTobinarySample void
				System.out.println();
				System.out.println();
				
			}
		}

	} // END MAIN

	private static void binaryTodecimal(int numberBinary) {
		
		int n = numberBinary;
		int deciamlNumber = 0, power = 0;
		while (n!=0) {
			numberBinary += ((n%10)*Math.pow(2,  power));
			n = n/10;
			power++;
			
		System.out.print(deciamlNumber);	
			
		}
	}
	
}
