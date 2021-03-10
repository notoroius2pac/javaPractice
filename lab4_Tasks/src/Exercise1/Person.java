package Exercise1;

public class Person {
	String name;
	float age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getAge() {
		return age;
	}

	public void setAge(float age) {
		this.age = age;
	}
	
	public static void main(String args[]) {
		Account smith = new Account();
		smith.setBalance(2000);
		Account kathy = new Account();
		kathy.setBalance(3000);
		
		smith.deposit(2000);
		kathy.withdraw(2000);
		
		System.out.println(smith.getBalance());
		System.out.println(kathy.getBalance());
	}
}
