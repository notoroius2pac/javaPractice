package tasks;

import java.util.Scanner;

@FunctionalInterface
interface ModifyString{
	String modifiedString(String str);
}

public class Exercise2 {

	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		
		ModifyString s1 = (string)->{
			String s ="";
			for(int i = 0;i<string.length();++i)
				s += string.charAt(i)+" ";
			return s;
		};
		System.out.println(s1.modifiedString(str));
	}
	
}
