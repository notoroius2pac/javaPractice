package lab1;

import java.util.Scanner;

public class Exercise7 {

	public static void main(String args[]) {
		int number;
		boolean res;
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		res = checkNumber(number);
		System.out.println(res);
	}

	static boolean checkNumber(int num) {
		int currentDigit = num % 10;
		num = num / 10;

		boolean flag=false;
		// 5
		while (num > 0) {
			// 6
			if (currentDigit <= num % 10) {
				flag = true;
				break;
			}

			currentDigit = num % 10;
			num = num / 10;
		}

		// 7
		if (flag) {
			return false;
		} else {
			return true;
		}
	}
}
