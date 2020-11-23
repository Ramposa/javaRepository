package text_process;

import static java.lang.System.out;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class readingFile {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		String s = "", decrypt = "";
		
		Scanner reader = new Scanner(new File("encrpty.txt"));
		
		while(reader.hasNextLine()) {
			for(char c : reader.nextLine().toCharArray())
				decrypt = decrypt + (char)(c-3);
			
			decrypt = decrypt + "\n";
		}
		
		out.println(decrypt);
		
	}

}
