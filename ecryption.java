package text_process;

import static java.lang.System.out;
import java.util.Scanner;

public class ecryption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Encryption
		
		String plain, encrypt = "";
		
		out.println("Please enter text > ");
		Scanner input = new Scanner(System.in);
		plain = input.nextLine();
		
		for(char c : plain.toCharArray()) {
			
			encrypt = encrypt + (char)(c+3); // The character from the string will move each character (char to the right).
		
		}
		
		out.println(encrypt);

		// Decryption
		
		String decrypt = "";
		
		for(char c : encrypt.toCharArray()) {
			
			decrypt = decrypt + (char)(c-3);
		}
		
		out.println("Decrypt text " 
				   +"\n" + decrypt);
		
	}

}

