import java.util.Scanner;
import java.util.ArrayList;

class ordering {

	// Data base with array, Items,
				//	The item should have:
					// Code, name, price, stock
		
		// Definition from week4: ArrayList<type> name = new ArrayList<Type>();
				static ArrayList<String> productName = new ArrayList<String>();
				static ArrayList<Integer> productCode = new ArrayList<Integer>();
				static ArrayList<Double> productPrice = new ArrayList<Double>();
				static ArrayList<Integer> productQty = new ArrayList<Integer>();
				
				static Scanner input = new Scanner(System.in);
				
				// Declare basket which containts the item name, code, quanity, price, cost...
				static ArrayList<Integer> basketCode = new ArrayList<Integer>();
				static ArrayList<String> basketName = new ArrayList<String>();
				static ArrayList<Integer> basketQty = new ArrayList<Integer>();
				static ArrayList<Double> basketPrice = new ArrayList<Double>();
				static ArrayList<Double> basketCost = new ArrayList<Double>();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// product storage
		
		productName.add("Pizza");
		productCode.add(1);
		productPrice.add(10.00);
		productQty.add(50);
		
		productName.add("Buger");
		productCode.add(2);
		productPrice.add(7.00);
		productQty.add(50);
		
		productName.add("Sandwich");
		productCode.add(3);
		productPrice.add(5.00);
		productQty.add(50);
		
		productName.add("Water");
		productCode.add(4);
		productPrice.add(1.00);
		productQty.add(30);
		
		productName.add("Soft drink");
		productCode.add(5);
		productPrice.add(2.00);
		productQty.add(30);
		
		productName.add("Tea");
		productCode.add(6);
		productPrice.add(2.00);
		productQty.add(20);

		productName.add("Coffee");
		productCode.add(7);
		productPrice.add(2.00);
		productQty.add(20);
		
		// After 07 any product below is out of range
		
		productName.add("Ice Cream");
		productCode.add(8);
		productPrice.add(2.00);
		productQty.add(20);
		
		productName.add("Chocolate");
		productCode.add(9);
		productPrice.add(2.00);
		productQty.add(50);
		
		
	// Menu for start up
		System.out.println("Welcome to the food ordering system");
		
		while(true) {
	
			// Interface:
			System.out.print("Enter m for manager or c for customer > ");
			String user = input.next();
			
			if(user.equals("c")) {
				customer();	// Goes to manager section
			}
			else if(user.equals("m"))
				manager();	// Goes to customer section
			} // while loop end
		
	} // End  Main
	
	private static void customer() {
		
		System.out.println("Welcome to my store");
		
		// Show the avaliable stocks
		viewItem();
		double total = 0;
		
		while(true) {
		System.out.println("Please enter the code of an item OR 0 for payment> ");
		int customerChoice = input.nextInt();
		
		if(customerChoice == 0) { 
			// process payment 
			
			// Display the contents of the basket and the total
			
			int size = basketName.size();
			
			for (int i = 0; i< size; i++) {
				
				System.out.println(basketCode.get(i)   + "\t"  +
								   basketName.get(i)   + "\t"  +
								   basketPrice.get(i)  + "\t"  +
								   basketQty.get(i)    + "\t"  +
								   basketCost.get(i));
				
			}
			
			System.out.println();
			System.out.println(" Total Cost = � " + total);
			
			// Ask customer for payment
			System.out.print(" please enter the payment > ");
			double payment = input.nextDouble();
			
			// Finds change
			double change = payment - total;
			
			// Gives customer change
			if(change > 0) {
				
				System.out.println("Please take your change �" + change + "& please take your items." +
								 "\n Thank you"); }
				else if(change == 0) {
				System.out.println("Please take your item");
				System.out.println();
				System.out.println();
			}
				else { System.out.print("Your remaning balance is " + change);
				System.out.println();
				System.out.println();
			// To collect their remaining balance & terminate
				}
			
			break;
		}
		else { // else if statement
			int position = productCode.indexOf(customerChoice);
		
			// Ask for  quantity
			System.out.println("How many do you need > ");
			int qty = input.nextInt();
			
			// Check stock  if there is enough
			if(qty <= productQty.get(position)) {
				// add to the basket
				basketCode.add(productCode.get(position));
				basketName.add(productName.get(position));
				basketPrice.add(productPrice.get(position));
				basketQty.add(qty);
				basketCost.add(qty * productPrice.get(position));
				
				// Accumulate the total cost 
				total = total + (qty * productPrice.get(position));
				
			}
			else {
				System.out.print("Low in stock, there are currently" + productQty.get(position) + "in the storage.");
				}
			}
		} // end else
		
	} // End customer

	
	private static void manager() {
		
		
	} // End manager
	
	// viewItem
		public static void viewItem() {
			
			System.out.println("---------------- Stock ----------------");
			int size = productName.size();
			
			for(int i=0; i < size; i++) {
				System.out.println(productCode.get(i)  +  "\t" +
			
								   productName.get(i)  +  "\t" +
								   
								   productPrice.get(i) +  "\t" +
								   
								   productQty.get(i)    );
			}
			System.out.println("---------------------------------------");
		}
	
} // End Class
