package groupWorkspace;

import java.util.Scanner;

class Binary_Convert_Decimal {

	static int numberBinary = 0, power = 0;
	static int deciamlNumberA;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner binaryInput = new Scanner(System.in);
			
			while(true){
				System.out.println("Please enter a binary number > ");
				numberBinary = binaryInput.nextInt();
				//String binarayTodecimalPositive;
				
				if (numberBinary > -1)
				if (2 < numberBinary) {
					
					System.out.println("This is not a binary number. Ivalid input.");
					System.out.println("Please try again");
					System.out.println();
					
				}
				
				else {
					
					System.out.println();
					System.out.print("Convert from " + numberBinary + " is: ");	// To display
					//binaryTodecimal(numberBinary);		// Display the answer from the decimalTobinarySample void
					System.out.println();
					System.out.println();
					
				}
				
				int n = binaryInput.nextInt();
				int numberBinary = 0, power = 0;
				while (n!=0) {
					numberBinary += ((n%10)*Math.pow(2,  power));
					n = n/10;
					power++;
					deciamlNumberA = numberBinary;
					
				}
				
				System.out.println();
				System.out.println(deciamlNumberA);
				System.out.println();
				
			}
				
		}
		
	} // END MAIN

