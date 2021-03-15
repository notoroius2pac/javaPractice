package com.cg.eis.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cg.eis.bean.Employee;

public class Services implements EmployeeService {

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	Employee emp = new Employee();

	@Override
	public void addEmployee(int id, String name, double salary, String designation) {
		// TODO Auto-generated method stub
		emp.setId(id);
		emp.setDesignation(designation);
//		emp.setInsuranceScheme(insuranceScheme);
		emp.setName(name);
		emp.setSalary(salary);
		if (emp.getSalary() > 5000 && emp.getSalary() < 20000) {
			emp.setInsuranceScheme("Scheme C");
		} else if (emp.getSalary() >= 20000 && emp.getSalary() < 40000) {
			emp.setInsuranceScheme("Scheme B");
		} else if (emp.getSalary() >= 40000) {
			emp.setInsuranceScheme("Scheme A");
		} else if (emp.getSalary() < 5000) {
			emp.setInsuranceScheme("No Scheme");
		} else {
		}

	}


	@Override
	public List<Integer> employeeDetailsBasedOnScheme(HashMap<Integer, Employee> map, String scheme) {
		// TODO Auto-generated method stub
		List<Integer> l1 = new ArrayList<Integer>();
		for (Map.Entry<Integer, Employee> entry : map.entrySet()) {
			if (entry.getValue().getInsuranceScheme().equals(scheme)) {
				l1.add(entry.getKey());
			} else {
				continue;
			}
		}
		return l1;
	}

	@Override
	public HashMap<Integer, Employee> deleteEmployee(HashMap<Integer, Employee> map, int id) {
		// TODO Auto-generated method stub
		for (Map.Entry<Integer, Employee> entry : map.entrySet()) {
			if (entry.getKey().equals(id)) {
				map.remove(id);
			} else {
				continue;
			}
		}
		return map;
	}

}
