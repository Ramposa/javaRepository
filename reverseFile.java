package text_process;

import static java.lang.System.out;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

public class reverseFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String reverseLines = "";
		int lineNo = 1;
		
		// Create a scanner object with input from file
		Scanner reader = new Scanner(new File("reverse.txt"));
		
		// Read the file contains the variables
		while(reader.hasNextLine()) {
			reverseLines = reverseLines + "\n" + lineNo++ + " " + reverse(reader.nextLine());
			// reverse should static string > redirects
	}
		
		// Write the reverse text to the file
		FileWriter writer1 = new FileWriter("reverse.txt");
		writer1.write(reverseLines);
		writer1.close();
		
		out.print(reverseLines);

	} // end main
	
	public static String reverse(String str) {	// allow to create a reverse string
		
		String reverse = "";
		
		for(char c : str.toCharArray()) {
			reverse = c + reverse;
		}
		
		return reverse;	// to create a reverse
		
	}
	
} // end class

