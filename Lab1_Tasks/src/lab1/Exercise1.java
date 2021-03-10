package lab1;

import java.util.Scanner;

public class Exercise1 {
	int number;

	public static void main(String args[]) {
		Exercise1 fc = new Exercise1();
		Scanner sc = new Scanner(System.in);
		fc.number = sc.nextInt();
		System.out.println(fc.sumOfCubeOfDigits(fc.number));
		 
	}
	int sumOfCubeOfDigits(int num) {
		int result = 0;
		while(num != 0) {
            int digit = num % 10;
            result += (digit*digit*digit); 
            num /= 10;
        }
		return result;
	}
}
