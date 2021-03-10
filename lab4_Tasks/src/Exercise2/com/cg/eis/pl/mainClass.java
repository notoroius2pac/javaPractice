package Exercise2.com.cg.eis.pl;

import Exercise2.com.cg.eis.service.Services;

public class mainClass {
	
	public static void main(String args[]) {
		
		Services ser = new Services();
		ser.getEmployeeDetails(1, "Analyst", "Saurabh", 40000);
		ser.generateInsuranceScheme();
		ser.display();
				
	}
}
