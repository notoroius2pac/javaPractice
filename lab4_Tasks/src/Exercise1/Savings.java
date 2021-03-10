package Exercise1;

public class Savings extends Account{
final double minBalance=500;

@Override
	void withdraw(double amount) {
		// TODO Auto-generated method stub
		if(super.getBalance() >500) {
		super.withdraw(amount);
		}
		else {
			System.out.println("Insufficient Balance");
		}
	}
}
