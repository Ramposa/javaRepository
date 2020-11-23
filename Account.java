

public class Account {
	
	// Properties
	public String name;
	public  int number;
	private double balance;
	
	// Constructor
	Account(String a, int b){
		name = a;
		number = b;
		balance = 0; }
	
	// Constructor
	Account(String a, int b, double c){
		name = a;
		number = b;
		balance  =  b;}
	
	// a method of deposits
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Successful operation your new balance is " + balance); }
	
	// method withdraw
	public void withdraw(double amount) {
		if(amount <= balance) {
			balance = balance - amount;
			System.out.println("Successful operation your new balance is " + balance); }
			else {
				System.out.println("Unsuccessful operation, max amount is " + balance); }
	}
	
	// Check  balance
	public void checkBalance(){
		System.out.println("Current balance is " + balance);
	}

}
