package tasks;

import java.util.StringTokenizer;

public class Exercise1 {
	 public static void main(String args[]){  
		   StringTokenizer st;
		   int sum = 0;String temp;
		   st = new StringTokenizer("2 4 6 3 2 4 6 8 43 5 3"," "); 
		     while (st.hasMoreTokens()) {  
		    	 temp = st.nextToken();
		    	 sum += Integer.parseInt(temp);
		         System.out.println(temp); 
		     }
		     System.out.println("sum = "+ sum);
		   }
}
