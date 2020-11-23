package pixles_plan_2;

import java.util.Scanner;

public class binary_calculator {
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(true) {	// Menu
			// Menu
			System.out.println("Welcome to my conversion project			 			\n"
					          +"														\n"
					          +"Please enter:											\n"
							  +"														\n"
							  +"'B' - for Binary (8-bit)                              		    \n"
							  +"'H' - for Hexadecimal (16-bit)									\n" 	// Travel  Class > seating > checked
							  +"'D' - for decimal    								    \n"
							  +"OR type 'Exit' to exit the application.					\n"
							  +"														\n"
							  +"");
			
			String customerChoice = input.next();	// Customer choice on travel class
			
			switch(customerChoice) {
			case "B":
			case "b":
				binaryConvMenu();
				break;
				
			case "H":
			case "h":
				hexadecimalConvMenu();
				break;
				
			case "D":
			case "d":
				decimalConvMenu();
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

	public static void binaryConvMenu() {
		
		System.out.println();
		System.out.print("Welcome to the binary conversion!");
		System.out.println();
		
		// menu 2
		
		while(true) {	// Menu
			System.out.println("Please enter:											\n"
							  +"														\n"
							  +"'Hex' - for Binary to hexadecimal                       \n"
							  +"'Dec' - for Hexadecimal									\n" 	// Travel  Class > seating > checked
							  +"OR type 'Back' to move back to  the  conversion menu.	\n"
							  +"														\n"
							  +"");
			
			String customerChoice = input.next();	// Customer choice on travel class
			
			switch(customerChoice) {
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
		
	} //  end binary menu
	
	public static void binaryTohex() {
		
	}
	
	public static void binaryTodec() {
		
	}
	
	public static void hexadecimalConvMenu() {
		
		System.out.println();
		System.out.print("Welcome to the Hexadecimal conversion!");
		System.out.println();
		
	} // end hex menu

	public static void decimalConvMenu() {
		
		System.out.println();
		System.out.print("Welcome to the decimal conversion!");
		System.out.println();
	
   } // end dec menu
	
} // END CLASS
