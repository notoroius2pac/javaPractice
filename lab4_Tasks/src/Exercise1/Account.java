package Exercise1;

public class Account {
long accNum;
double balance;
Person accHolder;
public long getAccNum() {
	return accNum;
}
public void setAccNum(long accNum) {
	this.accNum = accNum;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public Person getAccHolder() {
	return accHolder;
}
public void setAccHolder(Person accHolder) {
	this.accHolder = accHolder;
}

void deposit(double amount) {
	this.balance += amount;
}
void withdraw(double amount) {
	this.balance -= amount;
}


}
