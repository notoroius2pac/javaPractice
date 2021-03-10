package tasks;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String args[]) {
		StringBuffer inputString;
		Exercise2 ex = new Exercise2();
		Scanner sc  = new Scanner(System.in);
		inputString = new StringBuffer();
		
		System.out.println("Enter the String: ");
		inputString.append(sc.nextLine());
		System.out.print(inputString+"|");
		ex.getImage(inputString);
		System.out.print(inputString);
		
		sc.close();
	}
	
	void getImage(StringBuffer str) {
		str.reverse();
	}
}
