package tasks;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String args[]) {
		int number , modifiedNumber;
		Scanner sc= new Scanner(System.in);
		Exercise4 ex = new Exercise4();
		
		System.out.println("Enter a number: ");
		number = sc.nextInt();
		modifiedNumber = ex.modifyNumber(number);
		System.out.println("Modified number = " + modifiedNumber);
		
		sc.close();
	}
	
	int  modifyNumber(int num) {
		int res=0 , i=1;
		int pVal = 0,cVal;
		int diff =0;
		cVal = num%10;
		num = num/10;
		res = Math.abs(cVal - pVal);
		
		while(num%10 != 0) {
			pVal = cVal;
			cVal = num%10;
			diff =  Math.abs(cVal - pVal);
			res += (diff*(Math.pow(10,i)));
			num /=10;++i;
//			System.out.println("res = "+ res);
		}
		return res;
	}
}
