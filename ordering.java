package myassignment2;

import static java.lang.System.out; // MAKES LIFE EASY B0I
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
	
		// Declare basket which contains the item name, code, quanity, price, cost...
	
		static ArrayList<Integer> basketCode = new ArrayList<Integer>();
		static ArrayList<String> basketName = new ArrayList<String>();
		static ArrayList<Integer> basketQty = new ArrayList<Integer>();
		static ArrayList<Double> basketPrice = new ArrayList<Double>();
		static ArrayList<Double> basketCost = new ArrayList<Double>();


		public static void main(String[] args) {
			// TODO Auto-generated method stub

			// product storage

			productName.add("Pizza      ");		// Stores product name.
			productCode.add(1);				    // Stores product code.
			productPrice.add(10.00);		    // Stores product price.
			productQty.add( 50);				    // Stores product in quantity.

			productName.add("Burger     ");
			productCode.add(2      );
			productPrice.add(7.00  );
			productQty.add( 50      );

			productName.add("Sandwich   ");
			productCode.add(3);
			productPrice.add(5.00);
			productQty.add( 50);

			productName.add("Water      ");
			productCode.add(4);
			productPrice.add(1.00);
			productQty.add( 30);

			productName.add("Soft drink ");
			productCode.add(5);
			productPrice.add(2.00);
			productQty.add( 30);

			productName.add("Tea        ");
			productCode.add(6);
			productPrice.add(2.00);
			productQty.add( 20);

			productName.add("Coffee     ");
			productCode.add(7);
			productPrice.add(2.00);
			productQty.add( 20);

			// After 07 any product below is out of range.
			// Also if you put symbols in the productPrice.add(Â£2.00) it will spit an error.

			productName.add("Ice Cream  ");
			productCode.add(8);
			productPrice.add(2.00);
			productQty.add( 20);

			productName.add("Chocolate  ");
			productCode.add(9);
			productPrice.add(2.00);
			productQty.add( 50);


			// Menu for start up
			out.println("Welcome to the food ordering system");

			while(true) {

				// Interface:
				out.print("Enter c for customer OR e to exit program. > ");
				String user = input.next();

				if(user.equals("c")) {
					customer();	// Goes to manager section
				}
				else if(user.equals("m"))
					manager();	// Goes to customer section
				
				else if(user.equals("e"))
					System.exit(0);	// terminates program
				
			} // while loop end

		} // End  Main

		private static void customer() {

			out.println("Welcome to my store");

			// Show the avaliable stocks ect
			viewItem();
			double total = 0;
				
				while(true) {
					out.println("Please enter the code of an item OR '0' for payment,"
							+ "\nOR type in '10' to exit program > ");
					int customerChoice = input.nextInt();			// OR to cancel your basket please press 'X'
				
					if(customerChoice == 10) {
						
						System.exit(0);
					}
					
				if(customerChoice == 0) { 
					// process payment >

					// Display the contents of the basket and the total

					int size = basketName.size();

					for (int i = 0; i< size; i++) {
	
						out.println(basketCode.get(i)   + "\t"  +
						
										   basketName.get(i)   + "\t"  +
										   
										   basketPrice.get(i)  + "\t"  +
										   
										   basketQty.get(i)    + "\t"  +
										   
										   basketCost.get(i));
	
					}

					out.println();
					out.println(" Total Cost = £ " + total);

					// Ask customer for payment
					out.print("Please enter the payment > ");
					double payment = input.nextDouble();

					// Finds change
					double change = payment - total;

					// Gives customer change
					if(change > 0) {
	
						out.println("Please take your change £" + change + " & please take your items." +
										   "\n Thank you"); 
						}
					
					else if(change == 0) {	// if change is = to 0 then it  will print take item.
						
						out.println("Please take your item");
						out.println();
						out.println();
						
					}
					
					else { 
						
					out.print("Your remaning balance is " + change +
							"\ninsufficient funds, please try again.");
					out.println();
					out.println();
					// To collect their remaining balance & terminate
					
					}

					System.exit(0);
					
				}
				
				else { // else if statement
					
					int position = productCode.indexOf(customerChoice);

					// Ask for  quantity
					out.println("How many do you need > ");
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
						
						out.println();
						out.print("Low in stock, there are currently " + productQty.get(position) + " in the storage.");
						out.println();
						out.println();
						
						System.exit(0);
						
					}
					
				}
				
			} // end else

		} // End customer>


		private static void manager() {		// view stock/products
			
			out.println();
			out.println("---------------- Stock ----------------");
			out.println("-Code-|----Name----|---Price---|--Qty--");
			 int size = productName.size();
			 
			 for(int i=0; i < size; i++) {
			 out.println(productCode.get(i) +  "\t" +
			 
								 productName.get(i) +  "\t" +
					  			 
					  			 productPrice.get(i) +  "\t" +
					  			 
					  			 productQty.get(i));
			 
			  }
			 
			 out.println("--------------------------------------");

		} // End manager

		// viewItem
		public static void viewItem() {

			out.println();
			out.println("---------------- Menu -----------------");
			out.println("-Code-|----Name----|---Price---|--Qty--");
			int size = productName.size();

			for(int i=0; i < size; i++) {
				out.println(productCode.get(i)  +  "\t" +

					   			   productName.get(i)  +  "\t" +
					   
					   			   productPrice.get(i) +  "\t" +
					   
					   			   productQty.get(i));
				
				}
			
			out.println("--------------------------------------");
				
		}	// End viewitems

} // End Class