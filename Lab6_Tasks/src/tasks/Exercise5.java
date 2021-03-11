package tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercise5 {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int numbers[], result, sizeOfArray, i = 0;
		
		Exercise5 ex = new Exercise5();

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
		List<Integer> l1;
		l1= new ArrayList<Integer>();
		for(int i=0;i<array.length;++i) {
			l1.add(array[i]);
		}
		Collections.sort(l1);
		return l1.get(1);
	}
}
