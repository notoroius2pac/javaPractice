package tasks.exercise5;

import java.time.LocalDate;
import java.util.Date;

public class Employee {
	int employeeId;
	String firstName;
	String lastName;
	String email;
	String phoneNumber;
	LocalDate hireDate;
	String designation;
	double salary;
	int managerId;
	Department department;

	public Employee(int employeeId, String firstName, String lastName, String email, String phoneNumber, LocalDate hireDate,
			String designation, double salary, int managerId, Department department) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.hireDate = hireDate;
		this.designation = designation;
		this.salary = salary;
		this.managerId = managerId;
		this.department = department;
	}
}
