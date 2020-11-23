import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Input num
		
		Scanner inputa = new Scanner(System.in); // Note: input[ID]
		int num = inputa.nextInt();
		// Check Num
		
		switch(num) {
		
		// Case 1 Monday
		case 1: System.out.print("Monday");
				break;
				
		// Case 2 Tuesday
		case 2: System.out.print("Tuesday");
				break;
				
		// Case 3 Wednesday
		case 3: System.out.print("Wednesday");
				//break;
				
		// Case 4 Thursday
		case 4: System.out.print("Thursday");
				//break;
				
		// Case 5 Friday
		case 5: System.out.print("Friday");
				//break;	
							
		// Case 6 & 7 Saturday & Sunday
		case 6: 
		case 7:
			System.out.print("Weekend");
			break;
			
		// Otherwise, message
			default:
				System.out.print("There are 7 days in a week");
				
		}
	}

}
