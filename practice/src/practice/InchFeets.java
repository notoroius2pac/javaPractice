package practice;
import java.util.Scanner;
public class InchFeets {
	int feets,inches,inputInCm;
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		InchFeets obj1 = new InchFeets();
		InchFeets obj2 = new InchFeets();
		System.out.println("Enter distance 1 :   ");
		obj1.inputInCm = sc.nextInt();
		obj1.cmToInchFeets(obj1.inputInCm);
		System.out.println(obj1.feets +"ft " + obj1.inches+"inches");
		System.out.println("Enter distance 2:   ");
		obj2.inputInCm = sc.nextInt();
		obj2.cmToInchFeets(obj2.inputInCm);
		System.out.println(obj2.feets +"ft " + obj2.inches+"inches");
		obj1 = obj1.distanceInInchFeets(obj2);
		System.out.println(obj1.feets +"ft " + obj1.inches+"inches");
		sc.close();
	}
	void cmToInchFeets(int input) {
		this.feets = input/12;
		this.inches = input%12;
	}
	InchFeets distanceInInchFeets(InchFeets obj) {
		InchFeets totalDistance = new InchFeets();
		totalDistance.feets = this.feets+obj.feets;
		totalDistance.inches = this.inches+obj.inches;
		return totalDistance;
	}
}
