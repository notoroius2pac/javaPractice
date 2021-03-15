package tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {

	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int i = 0 , numberOfString;
		Exercise2 ex =new Exercise2();
		String str[];
		
		System.out.println("Enter the number of string: ");
		numberOfString = sc.nextInt();
		sc.nextLine();
		
		str = new String[numberOfString];
		
		for(;i< numberOfString;++i) {	
			 str[i] = sc.nextLine();
		}

		str = ex.sortString(str);
		
		for(int j =0;j< numberOfString;++j) {
			System.out.println(str[j]);
		}
		sc.close();
	}
	
	String[] sortString(String s[]) {
		int i = 0,half;
		String tempStr[] = {"",""};
		
		while(i < s.length) {
			 half = s[i].length() % 2 == 0 ? s[i].length()/2 : s[i].length()/2 + 1;
			tempStr[0] = s[i].substring(0, half);
			tempStr[0] = tempStr[0].toUpperCase();
			tempStr[1] = s[i].substring(half);
			tempStr[1] = tempStr[1].toLowerCase();
			s[i] = tempStr[0]+ tempStr[1];
			++i;
		}
		Arrays.sort(s);
		return (s);
	}
}
