import java.util.Scanner;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Food Pricing is £21
		double price = 21;
		
		// Input year of birth
		Scanner input1 = new Scanner(System.in);
			int year = input1.nextInt();
		
		// age
		int age = 2019 - year;
		
		// age// if age < 7 = kid
		if(age  <= 7 ) {
			System.out.print("kids eat free"); }
		// if age <= 21 = young person
		else if (age >= 21 ) {
			System.out.print("Young person pays 2/3 of the price, your price is " + (1.0/3 * price));
		}
		// if age >= 65 = senior citizen
		else if (age >=65 ) {
			System.out.print("Senior citizen eats 1/3, your price is " + (2.0/3 * price));
		}
		// otherwise full price
		else {System.out.print("Full price is " + price);}
	}

}
