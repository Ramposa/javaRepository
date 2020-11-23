import java.util.Scanner;

public class Nested_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Get input with scanner input
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a number > "); // Scanner allow an input.2
		int num = input.nextInt();
		
		// Repeat for i =1 to 9
		for(int i = 0; i <= num; i = i +1) {  // int = i which is 0
		// Print 'i'
			System.out.print(1);
		// total = 1
			int total = 1; //
		// Repeat for i > 2 to 1
			for(int j = 2; j <= i; j= j +1) {
			// Print * j 
				System.out.print(" * " + j);
			// total = total * j
				total = total * j;
			}
		// print total
				System.out.println(" = " + total);
		}
	}
}
