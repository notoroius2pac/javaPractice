package tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {

	public static void main(String args[]) {
		int num[];
		int numSize;
		Scanner sc = new Scanner(System.in);
		Exercise3 ex = new Exercise3();
		
		System.out.println("Enter the size of array: ");
		numSize = sc.nextInt();
		num = new int[numSize];
		
		for(int i=0;i<numSize;++i) {
			num[i] = sc.nextInt();
		}
		num = ex.getSorted(num);
		for(int j =0;j< numSize;++j) {
			System.out.println(num[j]);
		}
		sc.close();
	}
	
	int[] getSorted(int n[]) {
		String str;
		for(int i = 0;i<n.length;++i) {
			str = String.valueOf(n[i]);
				char ch[]=str.toCharArray(); 
			    String rev="";  
			    for(int i1=ch.length-1;i1>=0;i1--){  
			        rev+=ch[i1];  
			    }
			    str =rev;
			    n[i] = Integer.valueOf(str);
		}
		Arrays.sort(n);
		return n;
	}
}
