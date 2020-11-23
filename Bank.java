import java.util.ArrayList;
import java.util.Scanner;

public class Bank{
	
	public static void main(String[] args) {
		
		ArrayList<Account> bank = new ArrayList<Account>();
		Scanner input = new Scanner (System.in);
		
		String name;
		double amount;
		int new_acc_number =  0, num, choice;
		
		while(true) {
			System.out.println(
					" ------ Menu ------\n" +
					" 1 - Create account\n" +
					" 2 - Deposit\n       " +
					" 3 - Withdra\n       " +
					" 4 - Check balance\n " +
					" 5 - Quit\n          " +
					" 6 - Managers        " +
					" Please enter your choice > ");
			
			choice = input.nextInt();
			
			switch(choice){
			
			case 1:
			System.out.println("Please enter your name > ");
			name = input.next();
			
			bank.add( new Account(name, new_acc_number));
			
			System.out.println("Successful, account details: \n" +
			"Account name " + bank.get(new_acc_number).name + "\n");
			new_acc_number++;
			break;
			
			case 2:
			System.out.println("please , enter account number > ");
			
			num = input.nextInt();
			
			System.out.println("Please enter amount > ");
			amount = input.nextDouble();
			
			bank.get(num).deposit(amount);
			break;
			
			case 3:
			System.out.println("Please enter account number > ");
			num = input.nextInt();
			
			System.out.println(" please enter amount > ");
			amount = input.nextDouble();
			
			bank.get(num).withdraw(amount);
			break;
			
			case 4:
			System.out.println("Please enter your account number > ");
			num = input.nextInt();
			
			bank.get(num).checkBalance();
			break;
			
			case 5:
			return;
			
			default:
				System.out.println("Invalid choice, valid choices are 1 - 5");
				
				//case 6:
					//System.out.println{"K" + name + checkBalance);
				
			} // Switch case end done
			
		} // End while


		
	} // end main
	
} // end public class