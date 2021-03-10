package lab1;

import java.util.Scanner;

public class Exercise6 {

	public static void main(String args[]) {
		int number,result;
		Scanner sc= new Scanner(System.in);
		number = sc.nextInt();
		result = calculateDifference(number);
		System.out.println(result);
	}
	static int calculateDifference(int n) {
		int diff=0;
		int sumOfCube=0,cubeOfSum=0;
		for(int i=1;i<=n;++i) {
			sumOfCube += (i*i*i);
			cubeOfSum += i; 
		}
		cubeOfSum = cubeOfSum*cubeOfSum*cubeOfSum;
		diff = Math.abs(cubeOfSum-sumOfCube);
		return diff;
	}
}
