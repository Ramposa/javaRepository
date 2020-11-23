package pixles_plan_2;

import java.util.Scanner;

public class Are_Circle_Cal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
		// Add string reminder
		String n1;
		
		System.out.println("Enter the radius > ");
		n1 = input.next();
		
		int number1;
		number1 = Integer.parseInt(n1);

		// 	Area of a Circle = 3.14*R^2
		System.out.print("The area of the cicle is "  + number1*number1*3.14);

	}

}
