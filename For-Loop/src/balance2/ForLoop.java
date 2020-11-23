package balance2;
public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		// Balance (current balance)
		double balance = 5000, rate = 0.05;
		
		//for(int i =1; i <=7; i = i + 1) { 	//(int i =1; i <=7; i = i + 1)  first 1 is the year, the second is the 
		for(int i =7; i <= 7; i = i + 1) { // "The balance for year 7 is 5250.0"
			balance = balance + ( balance * rate);
			System.out.println("The balance for year " + i + " is " + balance); // println makes it into rows
			
			
			
		}
	}

}
