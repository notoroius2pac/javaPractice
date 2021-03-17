package tasks;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Exercise2 {
	
	boolean isValidString(String str) {
		boolean isValid = false;
		isValid  = Pattern.matches("[a-z]{8,}[job]", str);
		return isValid;
	}
	
	public static void main(String[] args) {
		String username;
		Scanner sc = new Scanner(System.in);
		username = sc.nextLine();
		username = username.toLowerCase();
		Exercise2 ex = new Exercise2();
		System.out.println(ex.isValidString(username));
		sc.close();
	}
}
