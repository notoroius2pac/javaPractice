package practice;

import java.util.*;
import java.util.regex.*;

class Email {
	// Implement Email Class according to the specifiaction.
	Header header;
	String body;
	String greetings;

	Email() {
		header.from = "";
		header.to = "";
		body = "";
		greetings = "";
	}

	Email(Header header, String boby, String greetings) {
		this.header.from = header.from;
		this.header.to = header.to;
		this.body = body;
		greetings = greetings;
	}
}

class Header {

	String from;
	String to;

	Header() {
		from = "";
		to = "";
	}

	Header(String from, String to) {
		this.from = from;
		this.to = to;
	}
}

class EmailOperations {
	// Implemet the Three methods specified in the specified.
	public int emailVerify(Email e) {
		boolean isValidFrom, isValidTo;
		isValidFrom = Pattern.matches("[A-Za-z_]+[@]{1}[A-Za-z]+[.]{1}[A-Za-z]+", "amit@doselect.com");
		isValidTo = Pattern.matches("[A-Za-z_]+[@]{1}[A-Za-z]+[.]{1}[A-Za-z]+", "_amit@doselectcom");
		if (isValidFrom == true && isValidTo == true)
			return 2;
		else if ((isValidFrom == false && isValidTo == true) || (isValidFrom == true && isValidTo == false))
			return 1;
		else
			return 0;
	}

	public String bodyEncryption(Email e) {
		String encryptedBody;
		char[] ch;
		int size, temp;
		size = e.body.length();
		ch = new char[size];
		ch = e.body.toCharArray();
		for (int i = 0; i < size; ++i) {
			temp = (int) ch[i];
			temp += 3;
			ch[i] = (char) temp;
		}
		encryptedBody = ch.toString();
		return encryptedBody;
	}

	public String greetingsMessage(Email e) {
		String name[] = new String[2];
		char[] temp;
		name = e.header.from.split("@");
		temp = name[0].toCharArray();
		if (temp[0] == '_') {
			for (int i = 0; i < temp.length - 1; ++i) {
				temp[i] = temp[++i];
			}
			name[0] = temp.toString();
		} else {
			name[0] = temp.toString();
		}

		return (e.greetings + " " + name[0]);
	}
}

public class Source {
	public static void main(String args[]) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
		// You can Implement your main() to check your Program.

	}
}