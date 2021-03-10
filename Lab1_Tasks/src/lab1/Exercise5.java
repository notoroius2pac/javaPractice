package lab1;

import java.util.Scanner;

public class Exercise5 {
	
	static int calculateSum(int n) {
		int sumofNumber = 0;
		for (int i = 1; i < n; ++i) {
			if (i % 3 == 0 && i % 5 == 0) {
				sumofNumber += i;
			} else {
				continue;
			}
		}
		return sumofNumber;
	}
	public static void main(String args[]) {
		Exercise6 ex = new Exercise6();
		
		Scanner sc = new Scanner(System.in);
		int number,result;
		number = sc.nextInt();
		result = calculateSum(number);
		System.out.println(result);
	}


}
