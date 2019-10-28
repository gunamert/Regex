
import java.io.File;

import java.io.IOException;

import java.util.Scanner;


public class Regex {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Enter the name of the input Java file:");

		Scanner keyboard = new Scanner(System.in);
		String filename = keyboard.nextLine();
		File file = new File(filename);
		if (!file.exists()) {
			System.out.println("Input file " + filename + " does not exists");
			System.exit(2);
		}
		Scanner input = new Scanner(file);
		
		while (input.hasNext()) {
		String shortString = input.nextLine();
		
		//If any of the characters @ , . / ? ( ) [ ] appears more than once,eliminate repetitions and reduce it to just one character:
	
        shortString = shortString.replaceAll("@+", "@");
		shortString = shortString.replaceAll("\\,+", "\\,");
		shortString = shortString.replaceAll("\\.+", "\\.");
		shortString = shortString.replaceAll("\\?+", "\\?");
		shortString = shortString.replaceAll("\\/+", "\\/");
		shortString = shortString.replaceAll("\\(+", "\\(");
		shortString = shortString.replaceAll("\\)+", "\\)");
		shortString = shortString.replaceAll("\\]+", "\\]");
		shortString = shortString.replaceAll("\\[+", "\\[");
		
		
		// If a sentence starts with ‘@’ or ‘#’ character, remove that character
		shortString = shortString.replaceAll("^@+", "");
		shortString = shortString.replaceAll("^#+", "");
		
		//If a sentence does not have the dot character at the end, insert it
		
		shortString = shortString.replaceAll("(^\\.$)", "$\\.");
		
		//Append ‘a’ to the end of all words that end with ‘p’ and ‘t’ and substitute ‘t’ with ‘d’ and ‘p’ with ‘b’
		shortString = shortString.replaceAll("(\\w)p(\\s)", "$1ba");
		shortString = shortString.replaceAll("(\\w)t(\\s)", "$1da");
		
		//Append ‘a’ or ‘e’ to the end of all words that end with ‘z’ depending on the last vowel (if the last vowel is ‘a’ append an ‘a’ and if the last vowel is ‘e’ append an ‘e’)
		
		shortString = shortString.replaceAll("([a-zA-Z0-9])(az)", "$1$2a");
		shortString = shortString.replaceAll("([a-zA-Z0-9])(ez)", "$1$2e");
		
		//If a sentence is quoted, remove the quotation marks of the sentence.

		
		shortString = shortString.replaceAll("(^‘‘)(.*)(’’$)","$2");
		//shortString = shortString.replaceAll("(’’.$)","");
		
		
		System.out.println(shortString);
		
		}
		

		input.close();
		keyboard.close();

	}
		
	
}