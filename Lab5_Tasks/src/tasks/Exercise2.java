package tasks;

import java.util.Scanner;

class InvalidNameException extends Exception {
	InvalidNameException(String s) {
		super(s);
	}
}

public class Exercise2 {

	static void validate(String fName , String lName) throws InvalidNameException {
		if (fName.equals("") && lName.equals(""))
			throw new InvalidNameException("Name can't be empty String");
		else
			System.out.println(fName + lName);
	}

	public static void main(String args[]) {
		String fName, lName;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Full name:- ");
		fName = sc.nextLine();
		lName = sc.nextLine();
		try {
			validate(fName, lName);
		}catch(Exception e) {
			System.out.println("Name can't be empty String");
		}
		sc.close();
	}
}
