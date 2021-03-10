package tasks;

import java.time.LocalDate;
import java.time.Period;

public class Exercise9 {
	   public static void main(String[] args)
	    {
	        LocalDate pdate = LocalDate.of(2012, 01, 01);
	        LocalDate now = LocalDate.now();
	 
	        Period diff = Period.between(pdate, now);
	 
	     System.out.printf("\nDifference is %d years, %d months and %d days \n\n", 
	                    Math.abs(diff.getYears()), Math.abs(diff.getMonths()), Math.abs(diff.getDays()));
	  }

}