package tasks.com.cg.eis.exception;

import java.util.Scanner;

class InvalidSalaryException extends Exception{  
	 InvalidSalaryException(String s){  
	  super(s);  
	 }  
	}  

public class Exercise3 {
	   static void validate(int sal)throws InvalidSalaryException{  
		     if(sal<3000)  
		      throw new InvalidSalaryException("Low Salary");  
		     else  
		      System.out.println("High Salary");  
		   }  
		     
		   public static void main(String args[]){  
			   int salary;
			   Scanner sc=  new Scanner(System.in);
			   System.out.println("Enter your Salary:- ");
			   salary = sc.nextInt();
		      try{  
		      validate(salary);  
		      }catch(Exception m){System.out.println(m);}  
		      sc.close();
		  } 
}
