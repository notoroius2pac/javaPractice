package tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int numbers[], result, sizeOfArray, i = 0;
		
		Exercise1 ex = new Exercise1();

		System.out.println("Enter the array size: ");
		sizeOfArray = sc.nextInt();
		
		numbers = new int[sizeOfArray];
		while (i < sizeOfArray) {
			numbers[i] = sc.nextInt();
			++i;
		}
		sc.close();
		result = ex.getSecondSmallest(numbers);
		System.out.println(result);
	}

	int getSecondSmallest(int[] array) {
		int temp; 
		Arrays.sort(array);
		temp = array[1];
		return temp;
	}
}
