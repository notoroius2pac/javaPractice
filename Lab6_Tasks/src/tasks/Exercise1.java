package tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int size;
		Scanner sc = new Scanner(System.in);
		Exercise1 ex = new Exercise1();
		List<Integer> l1;
		System.out.println("Enter the Aize of List:-");
		size = sc.nextInt();
		for (int i = 0; i < size; ++i) {
			map.put(i, sc.nextInt());
		}
		l1 = (List<Integer>) ex.getValues(map);
		for (int val : l1)
			System.out.println(val);
		sc.close();
	}

	List<Integer> getValues(HashMap<Integer, Integer> m) {
		List<Integer> integerList;
		integerList = new ArrayList<Integer>();
		for (int i = 0; i < m.size(); ++i) {
			integerList.add(m.get(i));
		}
		Collections.sort(integerList);
		return integerList;
	}
}
