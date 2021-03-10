package lab1;

import java.util.Scanner;

public class Exercise4 {

	public static void main (String[] args)
	   {		
		Scanner sc = new Scanner(System.in);
	       int i =0;
	       int num =0;
	       int number;
	       System.out.println("Enter the number till which the prime number are to be printed: ");
	       number = sc.nextInt();
	       //Empty String
	       String  primeNumbers = "";

	       for (i = 1; i <= number; i++)         
	       { 		  	  
	          int counter=0; 	  
	          for(num =i; num>=1; num--)
		  {
	             if(i%num==0)
		     {
	 		counter = counter + 1;
		     }
		  }
		  if (counter ==2)
		  {
		     //Appended the Prime number to the String
		     primeNumbers = primeNumbers + i + " ";
		  }	
	       }	
	       System.out.println("Prime numbers from 1 to " +number +" are :");
	       System.out.println(primeNumbers);
	   }
}
