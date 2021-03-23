package practice;

import java.util.Scanner;

public class SubStringReverse {
	public static void main(String[] args) {
		String string,subString, reverseString;
		StringBuffer str;
		Scanner sc = new Scanner(System.in);
		
		string = sc.nextLine();
		subString = string.substring(3, 8);
		str = new StringBuffer(subString);
		str.reverse();
		reverseString = str.toString();
		System.out.println(reverseString);
	}
}
