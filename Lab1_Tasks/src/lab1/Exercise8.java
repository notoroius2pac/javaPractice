package lab1;

import java.util.Scanner;

public class Exercise8 {
	
	public static void main(String args[]) {
		int number=0;
		boolean res;
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		res = checkNumber(number);
		if(res) {
			System.out.println(number+" is a power of 2");
		}
		else {
			System.out.println(number+" is not a power of 2");
		}
	}

	static boolean checkNumber(int num) {
		int flag=0;
		while(num !=1) {
			if(num%2==0) {
				 flag = 1;
				num=num/2;
			}
			else {
				flag =0;
				break;
			}
		}
		if(flag==1 ) {
			return true;
		}
		else {
			return false;
		}
	}
}
