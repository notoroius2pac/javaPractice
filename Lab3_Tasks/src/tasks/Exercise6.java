package tasks;

import java.util.Scanner;

public class Exercise6 {

	public static void main(String args[]) {
		String input;
		Scanner sc= new Scanner(System.in);
		Exercise6 ex = new Exercise6();
		
		System.out.println("ENter a String:  ");
		input = sc.nextLine();
		
		sc.close();
		System.out.println(ex.checkString(input));
	}
	
	boolean checkString(String str) {
		boolean isPositive = false;
		char[] ch;

		int len;
		len = str.length();
		ch = new char[len];
		
		ch = str.toCharArray();
		for(int i = 0;i<len-1;++i) {
			if(((int)ch[i])<= ((int)ch[i+1])) {
				isPositive = true;
			}
			else {
				isPositive = false;
				break;
			}
		}
		
		return isPositive;
	}
}
