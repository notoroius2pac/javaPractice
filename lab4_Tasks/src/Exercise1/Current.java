package Exercise1;

public class Current extends Account {
final double overDraftLimit =1000;

@Override
	void withdraw(double amount) {
		// TODO Auto-generated method stub
	if(super.getBalance()<-1000) {	
		super.withdraw(amount);
		
	}
	else {
	    System.out.println("Overdraft limit reached");
	}
	}

// -------------------overloading the overridden function required
//	boolean withdraw(double amount){
//		if(super.getBalance()<-1000) {	
//			super.withdraw(amount);
//			return amount;
//		}
//		else {
//		    return("Overdraft limit reached");
//		}
//	}
	
}
