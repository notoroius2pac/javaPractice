package tasks;

import java.util.Scanner;

@FunctionalInterface
interface test{
	double exponentResult(int a ,int b);
}
public class Exercise1 {
	public static void main(String[] args) {
		int num1,num2;
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		test t1 = (n1,n2)->{
			return (Math.pow(n1, n2));
		};
		System.out.println(t1.exponentResult(num1, num2));
		sc.close();
	}
}
