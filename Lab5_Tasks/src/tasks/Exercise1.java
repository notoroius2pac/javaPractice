package tasks;

import java.util.Scanner;

class InvalidAgeException extends Exception{  
	 InvalidAgeException(String s){  
	  super(s);  
	 }  
	}  
public class Exercise1 {

	   static void validate(int age)throws InvalidAgeException{  
		     if(age<15)  
		      throw new InvalidAgeException("not valid");  
		     else  
		      System.out.println("welcome to vote");  
		   }  
		     
		   public static void main(String args[]){  
			   int age;
			   Scanner sc=  new Scanner(System.in);
			   System.out.println("Enter your age:- ");
			   age = sc.nextInt();
		      try{  
		      validate(age);  
		      }catch(Exception m){System.out.println("You are Underage");}  
		      sc.close();
		  } 
}
