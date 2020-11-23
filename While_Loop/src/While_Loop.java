
public class While_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// While (condition)
		//	satement..
		
		
		// Year = 0
		
		int year = 0;
				
		// Balance = 5000
		
		double balance = 5000;
		
		// while balance < 7000
		
		while(balance <= 7000) {
		
		// Update the balance with interest	
			
		balance = balance + (balance * 0.05); // The balance * 0.05 (interest)
			
		// year = year + 1
		
		year = year + 1; // This loops
		
		// print balance for year
		
		System.out.println(balance + " for year " + year ); // System prints out as, balance + years
		
		}
	}
}
