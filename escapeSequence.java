package text_process;

import static java.lang.System.out;

public class escapeSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		out.println("An example of \n line break");					// Breaks the word into new line
		out.println();
		out.println("An example of \t tab space");					// Tabs
		out.println();
		out.println("An example of \b backspace");
		out.println();
		out.println("An example of \r carriage");
		out.println();
		out.println("An example of \f form feed (page break)");
		out.println();
		out.println("An example of \' single quote character");
		out.println();
		out.println("An example of \" double quite character");
		out.println();
		out.println("An example of \\ backslash character");
		out.println();
		
		
		// Exercise for write a java program to dispaly the following text
			// My favourite sentence is "I'm thankful".
			// which I store in this file D:\folder\favourites
		
		out.println("My favourite sentence is I'm thankful,\nwhich I stored in this file D:\folder\favourites \r \t - Anonymous");
		
		
		
	}

}
