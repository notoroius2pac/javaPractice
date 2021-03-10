package tasks;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String args[]) {
		String inputString;
		char[] ch;
		int ascciOfCh;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		inputString = sc.nextLine();
		inputString = inputString.toUpperCase();
		ch = new char[inputString.length()];
		ch = inputString.toCharArray();
		for(int i =0 ; i< ch.length;++i) {
			if(ch[i] == 'A' ||ch[i] == 'E' ||ch[i] == 'I' ||ch[i] == 'O' ||ch[i] == 'U') {
				
			}
			else {
				ascciOfCh = (int)ch[i];
				++ascciOfCh;
				ch[i] = (char)ascciOfCh;
			}		
			System.out.print(ch[i]);
		}
		sc.close();
	}
}
