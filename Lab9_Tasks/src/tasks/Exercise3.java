package tasks;

import java.util.Scanner;

@FunctionalInterface
interface Credentials{
	boolean isValid(String un,String pwd);
}
public class Exercise3 {

	static String username = "saurabh";
	static String password = "password";
	
	public static void main(String[] args) {
		String name , pass;
		Scanner sc = new Scanner(System.in);
		
		name = sc.nextLine();
		pass = sc.nextLine();
		
		Credentials t1 = (s1,s2)->{
			 return s1.equals(username)&&s2.equals(password)?true:false;
		};
		System.out.println(t1.isValid(name, pass));
		sc.close();
	}
}
