package tasks;

import java.util.Arrays;

public class Exercise4 {
	public static void modifyArray(int arr[]) {
		int temp = 0;
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (arr[i] == arr[j]) {
					arr[j] = arr[len - 1];
					len--;
					j--;
				}
			}
		}
		int[] array1 = Arrays.copyOf(arr, len);
		for (int i = 0; i < array1.length; i++) {
			for (int j = i + 1; j < array1.length; j++) {
				if (array1[i] < array1[j]) {
					temp = array1[i];
					array1[i] = array1[j];
					array1[j] = temp;
				}
			}
		}
		System.out.println("Array with unique values and in descending order: ");

		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + "\t");
		}
	}

	public static void main(String[] args) {
		modifyArray(new int[] { 10, 20, 15, 20, 30, 30, 40, 50, 50 });
	}
}