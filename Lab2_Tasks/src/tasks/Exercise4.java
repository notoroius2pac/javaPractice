package tasks;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String args[]) {
		int num[];
		int numSize;
		Scanner sc = new Scanner(System.in);
		Exercise4 ex = new Exercise4();

		System.out.println("Enter the size of array: ");
		numSize = sc.nextInt();
		num = new int[numSize];

		for (int i = 0; i < numSize; ++i) {
			num[i] = sc.nextInt();
		}
		num = ex.modified(num);
		for (int j = 0; j<numSize; ++j) {
			System.out.println(j + "\t"+num[j]);
		}
		
		sc.close();
	}

	int[] modified(int array[]) {
		int temp[] , len;
		len = array.length;
		temp = new int[len];
		
			for(int i = 0 ;i<len;++i) {
				temp[i] = array[i];
					if(array[i]!= -1) {
						for(int j = 1 ; j<len;++j) {
							if(array[j] == temp[i]) {
								array[j]= -1;
							}
						}
					}else {
						continue;
					}
			}
		return temp;
	}
}
