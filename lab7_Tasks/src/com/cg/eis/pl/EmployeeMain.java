package com.cg.eis.pl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import com.cg.eis.bean.Employee;
import com.cg.eis.service.Services;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Employee> empMap = new HashMap<Integer, Employee>();
		List<Integer> empList = new ArrayList<Integer>();
		Services ser = new Services();
		String str;
		ser.addEmployee(1, "a", 3000, "Clerk");
		empMap.put(1, ser.getEmp());	
//		System.out.println(empMap.get(1).getName());
		
		ser.addEmployee(2, "b", 18000, "Associate");
		empMap.put(2, ser.getEmp());
//		System.out.println(empMap.get(2).getName());
		
		ser.addEmployee(3, "c", 23000, "Programmer");
		empMap.put(3, ser.getEmp());
//		System.out.println(empMap.get(3).getName());
		
		ser.addEmployee(4, "d", 43000, "manager");
		empMap.put(4, ser.getEmp());
//		System.out.println(ser.display());
		
		for(int k =1;k<=empMap.size();++k) {
			str = empMap.get(k).getId()  +" "+empMap.get(k).getName() +" "+empMap.get(k).getDesignation() +" "+empMap.get(k).getSalary() +" "+empMap.get(k).getInsuranceScheme();
			System.out.println(k  +"\t"+ str);
		}
		
		empMap = ser.deleteEmployee(empMap, 3);
		for(int k =1;k<=empMap.size();++k) {
			if(empMap.containsKey(k)) {
				str = empMap.get(k).getId()  +" "+empMap.get(k).getName() +" "+empMap.get(k).getDesignation() +" "+empMap.get(k).getSalary() +" "+empMap.get(k).getInsuranceScheme();
				System.out.println(k  +"\t"+ str);
			}else {
				continue;
			}
		}
		
		empList = ser.employeeDetailsBasedOnScheme(empMap, "Scheme B");
		for(int k =1;k<=empMap.size();++k) {
			if(empList.contains(k)) {
				str = empMap.get(k).getId()  +" "+empMap.get(k).getName() +" "+empMap.get(k).getDesignation() +" "+empMap.get(k).getSalary() +" "+empMap.get(k).getInsuranceScheme();
				System.out.println(k  +"\t"+ str);
			}
		}		
	}
}
