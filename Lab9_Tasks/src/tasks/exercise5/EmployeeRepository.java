package tasks.exercise5;

import java.time.LocalDate;

public class EmployeeRepository {

	Department d1 = new Department(1,"CSE",1);
	Department d2 = new Department(2,"CSE",2);
	Department d3 = new Department(3,"CSE",3);
	Department d4 = new Department(4,"CSE",4);
	Department d5 = new Department(5,"CSE",5);
	
	Employee emp1 = new Employee(1, "saurabh", "sharma", "saurabh@capgemini.com","9988556644",LocalDate.of(2021,03,02), "Analyst", 25000, 1, d1);
	Employee emp2 = new Employee(2, "Abhishek", "Khurana", "Abhishek@capgemini.com","9966332211",LocalDate.of(2021,03,07), "Analyst", 25000, 2, d2);
	Employee emp3 = new Employee(3, "Esther", "Malka", "Esther@capgemini.com","8855664422",LocalDate.of(2021,04,02), "Analyst", 25000, 3, d3);
	Employee emp4 = new Employee(4, "Dushyant", "Deshwal", "Dushyant@capgemini.com","7755886611",LocalDate.of(2021,06,02), "Analyst", 25000, 4, d4);
	Employee emp5 = new Employee(5, "Tushar", "Mishra", "Tushar@capgemini.com","9944225577",LocalDate.of(2021,8,13), "Analyst", 25000, 5, d5);
	
	
}
