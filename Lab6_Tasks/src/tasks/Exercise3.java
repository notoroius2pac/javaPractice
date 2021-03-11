package tasks;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		int[] arr;
		int size;
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		Scanner sc = new Scanner(System.in);
		Exercise3 ex = new Exercise3();
		System.out.println("Enter the size of arra:- ");
		size = sc.nextInt();
		arr = new int[size];
		for(int i =0;i<size;++i) {
			arr[i] = sc.nextInt();
		}
		map = ex.getSquare(arr);
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
		    System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		sc.close();
	}
	
	public HashMap<Integer,Integer> getSquare(int[] a){
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i=0;i<a.length;++i) {
			map.put(a[i], a[i]*a[i]);
		}
		
		return map;
	}
}
