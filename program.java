import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

class program {
	
	// Data base with array, Items,
			//	The item should have:
				// Code, name, price, stock
	
	// Definition from week4: ArrayList<type> name = new ArrayList<Type>();
			static ArrayList<Integer> itemCode = new ArrayList<Integer>();
			static ArrayList<String> itemName = new ArrayList<String>();
			static ArrayList<Integer> itemQty = new ArrayList<Integer>();
			static ArrayList<Double> itemPrice = new ArrayList<Double>();
			
			static Scanner input = new Scanner(System.in);
			
			// Declare basket which containts the item name, code, quanity, price, cost...
			static ArrayList<Integer> basketCode = new ArrayList<Integer>();
			static ArrayList<String> basketName = new ArrayList<String>();
			static ArrayList<Integer> basketQty = new ArrayList<Integer>();
			static ArrayList<Double> basketPrice = new ArrayList<Double>();
			static ArrayList<Double> basketCost = new ArrayList<Double>();
			
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Other features in a shopping system,
		// Previous address
		// Search Bar
		// Recommendated/Sponsored
		// Payment
		
		// To design a shopping system I need:
			// Algorithm
			// Flowchart
			// Combination of both
		
		// Start up
		
		// Add default item in the stock
		itemName.add("Book");
		itemCode.add(01);
		itemPrice.add(50.00);
		itemQty.add(40);
	
		itemName.add("Amazon Web Service");
		itemCode.add(02);
		itemPrice.add(50.00);
		itemQty.add(40);
		
		while(true) {
		// Interface:
		System.out.print("Enter m for manager or c for customer > ");
		String user = input.next();
		
		if(user.equals("m")) {
			manager();	// Goes to manager section
		}
		else if(user.equals("c"))
			customer();	// Goes to customer section
		} // while loop end
	
	} // Main
	
	// Define Customer - not define
	
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
				System.out.println(" Total Cost = £ " + total);
				
				// Ask customer for payment
				System.out.print(" please enter the payment > ");
				double payment = input.nextDouble();
				
				// Finds change
				double change = payment - total;
				
				// Gives customer change
				if(change > 0) {
					System.out.println("Please take your change £" + change + "& please take your items." +
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
				int position = itemCode.indexOf(customerChoice);
			
				// Ask for  quantity
				System.out.println("How many do you need > ");
				int qty = input.nextInt();
				
				// Check stock  if there is enough
				if(qty <= itemQty.get(position)) {
					// add to the basket
					basketCode.add(itemCode.get(position));
					basketName.add(itemName.get(position));
					basketPrice.add(itemPrice.get(position));
					basketQty.add(qty);
					basketCost.add(qty * itemPrice.get(position));
					
					// Accumulate the total cost 
					total = total + (qty * itemPrice.get(position));
					
				}
				else {
					System.out.print("Low in stock, there are currently" + itemQty.get(position) + "in the storage.");
					}
				}
			} // end else
		}

	// Define Manager
	
	public static void manager() {
		// Check login using password
		System.out.print("Please enter the password > ");
		
		String pwd = input.next();
		if(!pwd.equals("123"))
		{ return;	}
		else {
			
			while(true){
		// Shows manager menu
				System.out.println("Enter A to add an item	\n"
						+ "press V to view stock			\n"
						+ "D to delete item					\n"
						+ "P to check pending orders		\n"
						+ "M to add promotions				\n"
						+ "C to cancel orders				\n"
						+ "e to exit 						\n"
						+ "									\n"
						+ "Enter an input > ");
				
				// Get manager choice
				String managerChoice = input.next();
				
				switch(managerChoice) {
				case "a":
					addItem();
					break;
					
				case "v":
					viewItem();
					break;
					
				case "d":
					deleteItem();
					break;
					
				case "p":
					pendingItem();
					break;
				
				case "m":
					promoteItem();
					break;
					
				case "c":
					cancelItem();
					break;
				
				case "e":
					return;
				default:
					System.out.print("Invalid input");
				
				} // End switch case
			} // end while loop
		}	// End if statement
		
	} // End Manager
	
	
	// additem
	public static void addItem() {
		
		System.out.println("Please, enter item name > ");
		String name = input.next();
		
		System.out.println("Please enter item code > ");
		Integer code = input.nextInt();
		
		System.out.println("Please enter item quantity > ");
		Integer qty = input.nextInt();
		
		System.out.println("Please enter item price");
		Double price = input.nextDouble();
		
		// Add the item to the storage
		itemName.add(name);
		itemCode.add(code);
		itemQty.add(qty);
		itemPrice.add(price);
		
	}
	
	// viewItem
	public static void viewItem() {
		
		System.out.println("---------- Stock ----------");
		int size = itemName.size();
		
		for(int i=0; i < size; i++) {
			System.out.println(itemCode.get(i)  +  "\t" +
							   itemName.get(i)  +  "\t" +
							   itemPrice.get(i) +  "\t" +
							   itemQty.get(i)    );
			
			System.out.println("-------------------------");
		}
	}
	
	// deleteItem
	public static void deleteItem() {
		
	}
	
	// pendingItem
	
	public static void pendingItem() {
		
	}
	
	// promoteItem
	public static void promoteItem() {
		
	}
	
	// cancelItem
	public static void cancelItem() {
		
	}
	
	
} // Class
