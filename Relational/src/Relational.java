import java.util.Scanner;

public class Relational {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 2, b = 2, c = 2, d = 2, e =2, f=2;
		
		// Adding & Subtracting.
		
		System.out.println("++a = " + ++a);	// + = 1, then 1 + 2 = 3
		System.out.println("Now a = " + a);
		
		System.out.println();				// b = 2, then 2 + 1 = 3
		System.out.println("b++ = "+ b++);
		System.out.println("now b = "+ b);
		
		System.out.println();				// 2-1 = 1
		System.out.println("--c = "+ --c);
		System.out.println("Now c = "+ c);
		
		System.out.println();				// d = 2, then 2 - -(1) = 1
		System.out.println("d-- = "+ d--);
		System.out.println("Now d = "+ d);
		
		System.out.println();
		System.out.println("e *=e++ = "+ (e *= e++) );
		
		System.out.println();
		System.out.println("f*=++f = " + (f *= ++f) ); // 
		System.out.println("now f = " + f); 
		
	// _________________________________________________
		
		// Mutiplies & Division
		
		System.out.println();
		
		int n = 5, m = 2;
		System.out.println();
		System.out.println("n%m = " + (n%m)); // This returns an interger, example 5/2 but it has a remainder 1
		System.out.println("n/2 = " + (n/2)); // This returns the quotient, example 5/2 is 2
			
		// Write a program that reads two integer numbers & determines if one is multiple of the other...
			// if (n1%n2) == 0) [n1 & n2 = numbers]
				//	print(n1 is a multiple of n2);
			// else
				//	print(n1 is not multiple of n2);
		
	// _________________________________________________	
	
		// Parenthesis for Ambiguous expression... Slide 8-9
			// double x = 6, y = 4, z = 2;
				// x + y / z = (6 + 4 / 2 =) 8
				// (x + y) / z = ((6 + 4 = 10)/2) 5
				// x + (y / z ) = (6 + (4 / 2) = 8
		
	// _________________________________________________
		
		// Relational Operators
		
			// Relational operators are used to compair two atomic values such as value of type int, double, char or boolean.
			// Here are the six operators
				// Operator		|	Meaning						|	Int
				//______________+_______________________________+____________
				// ==			|	Equals to					|	Double
				// !=			|	Not equal to				|	Boolean
				// >			|	Greater than				|	Char
				// <			|	Less than					|	
				// >=			|	Greater than or equal to	|
				// <=			|	Less than or equal to		|
		
			// The outcome of a relational operator is boolean value, which is either TRUE or FALSE.
		
		System.out.println();
		
		double x = 6, y = 4, z = 2;
		
		System.out.println(x== y);		// is 6 equals to 4, false.
		System.out.println(x!=y);		// is 6 Not equals to 4, true.
		System.out.println(x>y);		// is 6 greater than 4, true.
		System.out.println(x< y);		// is 6 less than 4, false.
		System.out.println(x+y>= z);	// is 6+2=8 is greater or equal to 2, true.
		System.out.println(x+y<= z);	// is 6+2=8 is less or equal to 2, false.
		
		
		// _________________________________________________
			
			// Logical Operators
		
				// Logical operators combine the results of multiple conditions.
				// There are six logical operators.
		
					// Operator		|	Meaning/Logical operator		
					//______________+___________________________
					// &&			|	AND		
					// ||			|	OR		
					// !			|	NOT	
	
		// _________________________________________________
		
			// Logical Operators
		
				// The operator ?: is short for if-else
				// Example:	condition ? Statement1 : Statement2
				
				// In short form of,
				
				// If (condition ) {
				//		Statement1
				//		]
				//	else {
				//		Statement2
				//		}
		
		System.out.println();
		
		int q = 5, w = 10;
		
		System.out.println("q = 5, w = 10");
		System.out.println("5 > 10?");
		System.out.println(
				((q > w)? "Yes": "No") // "Yes": "No" give an option.
				);
					// (q > w)
		
		// _________________________________________________
		
			// Break & Continue
			
				// Continue allow to force a loop to skip instruction in the body of the loop.
				// A break allow to terminate the loop.
		
				// These two statements are use to control the flow of the loop,
					// - Break - Stops the loop without executing the rest of the statements in the loop
					// - Continue; skips
		
					// for i = 1 to 9
					// if i = 7, i ==6  [i = 7 then it can skip then continue]
					//		continue
					
		System.out.println();
		
		System.out.println("Multiple of three from 31 to 0");
		System.out.println();
		for(int i=31; i>1; i--) { //
			// Check if number is not multiple of 3
			if (i%5 != 0) { //i%5 is basically times table, i.e it will count dowm in 5s, e.g: 30, 25, 20, ect. - the != 1 is the end digit such as the end number.
				// skips number and move to the next iteration
				continue; // Continues the loop/instruction.
					}
			System.out.println(i);
			}
		
			// Continue 2
		
		Scanner input = new Scanner(System.in);
		int g = input.nextInt();
		
		// forint i=31; i>=1; 1--{
		//for(int g=i; g>=1; g--) {
		//	if(g%5!=0) {continue;
		//	}
		//	System.out.println(" g = " + g);
	//	}
		
			// Exercise
				// Break 
					// The output of this one is 1 - 5, anything above 5 will break.
		
		System.out.println();
		System.out.println("Break");
		
		for(int i=1; i<=10; i++) { // i=1 
			if (i > 5) { break;} // i > 5 means 1 to 5. Any higher will break.
			System.out.println(i);
			}
		
				// Continue
					// The output of this one is 6 - 10, anything that is below 5 will break.
		
		System.out.println();
		System.out.println("Continue");
		
		for(int i=1; i<=10; i++) {
			if (i <= 5) { continue;} // i < 5 means anything below 5 will skip then start at 6 to 10.
			System.out.println(i);
			}	
		}	
	}