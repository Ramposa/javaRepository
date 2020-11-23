
public class Do_While_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Get ini bal
		System.out.print("Enter balance > ");
		double balance = input.nextDouble();
		
		// get target
		System.out.print("Enter target > ");
		double target = input.nextDouble();
		
		// get rate
		System.out.print("Enter rate > ");
		double rate = input.nextDouble();
		
		// year
		int year = 0;
		
		do { // While do loop
			balance = balance + (balance * rate);
			
			year = year + 1;
			
			// print out balance for year
			System.out.println(balance + " for year " + year);
			}while(balance <= target); // End while do loop
		

		
	}

}
