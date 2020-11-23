package groupWorkspace;

import java.util.Scanner;

public class Conversion_Menu {
	
	// Static location
		// Conversion  menu
	
		static Scanner input = new Scanner(System.in);
	
		// From decimal to Binary
	
		static int numberDecimal;
		static Scanner inputDecimalBinary = new Scanner(System.in);
		
		// From Decimal to Hexa
		
		static Scanner inputDecimalHexa = new Scanner(System.in);
		static String  hexaResult = "";
		static int numberHexa; 
		static String hexaResultA = "";
		static String hexaIInputA = hexaResultA;
		
		// From Decimal to Octal
		
		static Scanner inputDecimalOctal = new Scanner(System.in);
		static String octalResult = "";
		static int numberOctal; 
		static String octalResultA;
		
		// From Binary to Decimal
		
		static Scanner binaryInput = new Scanner(System.in);
		static int numberBinary = 0, power = 0;
		static int deciamlNumberA;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(true) {	// Menu
			// Menu
			System.out.println("Welcome to my conversion project			 			\n"
					          +"														\n"
					          +"Please enter:											\n"
							  +"														\n"
							  +"'B' - from Binary (Base 8)                              \n"
							  +"'H' - from Hexadecimal (Base 16)						\n" 	// Travel  Class > seating > checked
							  +"'D' - from decimal (Base 10)   							\n"
							  +"OR type 'Exit' to exit the application.					\n"
							  +"														\n"
							  +"");
			
			String customerChoice = input.next();	// Customer choice on travel class
			
			switch(customerChoice) {
			case "B":
			case "b":
				
				fromBinaryToDecimal();
				break;
				
			case "H":
			case "h":
				
				hexadecimalConvMenu();
				break;
				
			case "D":
			case "d":
				
				fromDecimalToBinary();
				break;
			
			case "Exit":
			case "exit":
				
				return;
				
			default:
				System.out.print("Invalid input, please try again");
				System.out.println();
				System.out.println();
				System.out.println();
				
				
			}	// End Switch Case
			
		} // End while loop

	} // END MAIN

	public static void fromBinaryToDecimal() {
		
		System.out.println();
		System.out.print("Welcome to the binary conversion!");
		System.out.print("From Base 8");
		System.out.println();
		
		// menu 2
		
		while(true) {	// Menu
			System.out.println("Please enter:											\n"
							  +"														\n"
							  +"'Hex' - from Binary to hexadecimal                      \n"
							  +"'Dec' - from Binary to Decimal							\n" 	// Travel  Class > seating > checked
							  +"OR type 'Back' to move back to  the  conversion menu.	\n"
							  +"														\n"
							  +"");
			
			String customerChoice = input.next();	// Customer choice on travel class
			
			switch(customerChoice) {		// Switch case
			case "Hex":
			case "hex":
				binaryTohex();
				break;
				
			case "Dec":
			case "dec":
				binaryTodec();
				break;
			
			case "Back":
			case "back":
				return;
				
			default:
				System.out.print("Invalid input, please try again");
				System.out.println();
				System.out.println();
				System.out.println();
				
			}	// End Switch Case
			
		} // End while loop
		
	} //  End binary menu
	

	public static void fromDecimalToBinary() {				// DECIMAL CONVERSION
		
		System.out.println();
		System.out.print("Welcome to the decimal conversion!");
		System.out.println();
		
		// menu 5
		
				while(true) {	// Menu 2
					System.out.println("Please enter:											\n"
									  +"														\n"
									  +"'Binary' - for Decimal to Binary.                       \n"
									  +"'Hexadecimal' - for Decimal to Hexadecimal.				\n"
									  +"'Octal' - for Decimal to Octal.							\n"
									  +" OR type 'Back' to move back to  the  conversion menu.	\n"
									  +"														\n"
									  +"");
					
					String customerChoice = input.next();	// Customer choice on travel class
					
					switch(customerChoice) {		// Switch case
					case "binary":
					case "Binary":
						
						Decimal_Convert_Binary();
						break;
						
					case "hexadecimal":
					case "Hexadecimal":
						
						Decimal_Convert_Hexa();
						break;
					
					case "octal":
					case "Octal":
						
						Decimal_Convert_Octal();
						break;
					
					case "Back":
					case "back":
						
						return;
						
					default:
						System.out.print("Invalid input, please try again");
						System.out.println();
						System.out.println();
						System.out.println();
						
						
					}	// End Switch Case
					
				} // End while loop
	
		} // end Decimal Menu
	
	private static void Decimal_Convert_Binary() {
		
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
				break;	// Breaks and return to the menu
				
				}
			
			}
		
	}	// End Decimal > Binary
	
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
	
	private static void Decimal_Convert_Hexa() {
		
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
						break;	// Breaks and return to the menu
			
				}
			}
			
		} // While true end

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
		
		} // End Decimal to Hexa conver
	
	private static void Decimal_Convert_Octal() {
		
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
					System.out.println();
					break;	// Breaks and return to the menu
					
			}	// End else
			
		} // While true end
		
	}	// End Octal Conv
		
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
		
	} // end Decimal conversion
	
	public static void binaryTodecimal() {
		
		System.out.println();
		System.out.print("Welcome to the decimal conversion!");
		System.out.print("From Base 10");
		System.out.println();
		
		// menu 2
		
		while(true) {	// Menu
			System.out.println("Please enter:											\n"
							  +"														\n"
							  +"'Bin' - for Binary to hexadecimal                       \n"
							  +"'Dec' - for Hexadecimal									\n" 	// Travel  Class > seating > checked
							  +"OR type 'Back' to move back to  the  conversion menu.	\n"
							  +"														\n"
							  +"");
			
			String customerChoice = input.next();	// Customer choice on travel class
			
			switch(customerChoice) {		// Switch case
			case "Bin":
			case "bin":
				binaryTodec();
				break;
				
			case "Dec":
			case "dec":
				binaryTohex();
				break;
			
			case "Back":
			case "back":
				return;
				
			default:
				System.out.print("Invalid input, please try again");
				System.out.println();
				System.out.println();
				System.out.println();
				
			}	// End Switch Case
			
		} // End while loop
		
	} //  End binary menu
	
	public static void binaryTohex() {
		
		}
	
	public static void binaryTodec() {
		
			while(true){
				System.out.println("Please enter a binary number > ");
				System.out.println();
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
			
			} // End while
		
		} // End Binary to Decimal
	
	public static void hexadecimalConvMenu() {
		
		System.out.println();
		System.out.print("Welcome to the Hexadecimal conversion!");
		System.out.println();
		
	} // end hex menu
	
} // END CLASS