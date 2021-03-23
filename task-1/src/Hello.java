import java.util.Scanner;

public class Hello {

	int num1, num2;
	Scanner sc;

	void printHello() {
		System.out.println("Hello");
		System.out.println("Saurabh Saurabh");
	}
	void add() {
		sc = new Scanner(System.in);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.println(num1 + num2);
	}
	void divide() {
		sc = new Scanner(System.in);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		try {
			System.out.println(num1 / num2);
		} catch (ArithmeticException e) {
			System.out.println("Error Division by Zero");
		}
	}
	void definedOperations() {
		System.out.println(-5 + 8 * 6);
		System.out.println((55 + 9) % 9);
		System.out.println(20 + -3 * 5 / 8);
		System.out.println(5 + 15 / 3 * 2 - 8 % 3);
	}
	void product() {
		sc = new Scanner(System.in);
		System.out.println("Input First Number:  ");
		num1 = sc.nextInt();
		System.out.println("Input Second Number:  ");
		num2 = sc.nextInt();
		System.out.println(num1 + "*" + num2 + "=" + num1 * num2);
	}
	void standardOperation() {
		sc = new Scanner(System.in);
		System.out.println("Input First Number:  ");
		num1 = sc.nextInt();
		System.out.println("Input Second Number:  ");
		num2 = sc.nextInt();
		System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
		System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
		System.out.println(num1 + "*" + num2 + "=" + num1 * num2);
		System.out.println(num1 + "/" + num2 + "=" + num1 / num2);
		System.out.println(num1 + "%" + num2 + "=" + num1 % num2);
	}
	void numberTable() {
		sc = new Scanner(System.in);
		System.out.println("Input a Number:  ");
		num1 = sc.nextInt();
		for (int i = 1; i < 11; ++i) {
			System.out.println(num1 + "*" + i + "=" + num1 * i);
		}
	}
	public static void main(String args[]) {
		Hello obj = new Hello();
		obj.printHello();
		obj.add();
		obj.divide();
		obj.definedOperations();
		obj.product();
		obj.standardOperation();
		obj.numberTable();

	}
}
