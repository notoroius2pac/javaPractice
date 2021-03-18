package tasks.exercise5;

public class Department {
	int departmentId;
	String departmentName;
	public Department(int departmentId, String departmentName, int managerId) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.managerId = managerId;
	}
	int managerId;
}
