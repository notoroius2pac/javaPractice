package Exercise2.com.cg.eis.service;

import java.util.Scanner;

import Exercise2.com.cg.eis.bean.Employee;
import Exercise2.com.cg.eis.bean.EmployeeService;

public class Services implements EmployeeService {

	Employee emp = new Employee();
	@Override
	public void getEmployeeDetails(int id,String design,String name,double salary) {
		// TODO Auto-generated method stub
		emp.setId(id);
		emp.setDesignation(design);
		emp.setName(name);
		emp.setSalary(salary);
		
	}

	@Override
	public void generateInsuranceScheme() {
		// TODO Auto-generated method stub
		if(emp.getSalary()<20000) {
			emp.setInsuranceScheme("ABC");
		}else if(emp.getSalary()<50000 && emp.getSalary()>20000) {
			emp.setInsuranceScheme("DEF");
		}else {
			emp.setInsuranceScheme("HIJ");
			
		}
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getDesignation());
		System.out.println(emp.getSalary());
		System.out.println(emp.getInsuranceScheme());
	}

}
