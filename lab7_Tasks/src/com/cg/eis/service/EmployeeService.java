package com.cg.eis.service;

import java.util.HashMap;
import java.util.List;

import com.cg.eis.bean.Employee;

public interface EmployeeService {
	
	void addEmployee(int id,String name,double salary,String designation);
	List<Integer> employeeDetailsBasedOnScheme(HashMap<Integer,Employee> map , String scheme);
	HashMap<Integer, Employee> deleteEmployee(HashMap<Integer,Employee> map ,int id);
}
