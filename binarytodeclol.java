package pixles_plan_2;

import java.util.ArrayList;
import java.util.Scanner;

public class binarytodeclol {
	
	// Arrays
	static ArrayList<String> binaryTodecimal = new ArrayList<String>();
	
	// Callback
	static ArrayList<String> decimalTobinary = new ArrayList<String>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		String b1;
		String b2;
		String b3;
		String b4;
		String b5;
		String b6;
		String b7;
		String b8;
		
		System.out.println("Here is an 8-bit binary:");
		System.out.println("[128], [64], [32], [16], [8], [4], [2], [1]");
		System.out.println();
		System.out.println("You need to enter '1' or '0'.");
		System.out.println();
		System.out.println("We need to start from the right.");
		System.out.println("[1]");
		System.out.print("> ");
		b1 = input.next();
		
		int binary1;
		binary1 = Integer.parseInt(b1);
		
		System.out.println();
		System.out.println("Please enter your binary code below:");
		System.out.print("> ");
		String binaryTodecimal = input.next();
		
		
		
		decimalTobinary.add(binaryTodecimal);

	}

}
