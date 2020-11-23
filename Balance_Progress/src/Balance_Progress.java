import java.util.Scanner;

public class Balance_Progress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Input
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter balance > ");
		double balance =input.nextDouble();
		
		// Get target
		System.out.print("Enter target > ");
		double target = input.nextDouble();
		
		//Get the rate
		System.out.print("Enter rate > ");
		double rate = input.nextDouble();
		
		// Get balance
		//System.out.print("Enter your balance > ");
		//double balance = input.nextDouble();
		
		// Year = 0
				int year = 0;
						
				// Balance = 5000
				//double balance = 5000;
				
				do {
				
				// while balance < 7000
				while(balance <= target) {
				
				// Update the balance with interest	
				//balance = balance + (balance * 0.05); // The balance * 0.05 (interest)
				
				balance = balance + (balance * rate);
					
				// year = year + 1
				
				year = year + 1; // This loops
				
				// print balance for year
				
				System.out.println(balance + " for year " + year ); // System prints out as, balance + years
				
				}
				}while(balance <= target);
	}

}
