package tasks;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		HashMap<String,String> studentWithMedal = new HashMap<String,String>();
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		String studentName;
		int studentMarks , numberOfStudents;
		Scanner sc =  new Scanner(System.in);
		Exercise4 ex = new Exercise4();
		
		System.out.println("Enter the number od Students;-");
		numberOfStudents  = sc.nextInt();
		
		for(int i =0 ;i<numberOfStudents;++i) {
			System.out.println("Name of Student:  ");
			sc.nextLine();
			studentName = sc.nextLine();
			System.out.println("Student Marks: ");
			studentMarks = sc.nextInt();
			map.put(studentName, studentMarks);
		}
		studentWithMedal = ex.getStudents(map);
		for (Map.Entry<String, String> entry : studentWithMedal.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		sc.close();
	}
	
	// accepts hashMap of student name and marks return hashmap of student name and medal name
	public HashMap<String,String> getStudents(HashMap<String,Integer> map){
		HashMap<String,String> studentWithMedal = new HashMap<String,String>();
		
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			
			if(entry.getValue()>=90) {
				studentWithMedal.put(entry.getKey(), "Gold");
			}else if(entry.getValue()<90 && entry.getValue()>=80) {
				studentWithMedal.put(entry.getKey(), "Silver");
			}else if(entry.getValue()<80 && entry.getValue()>=70) {
				studentWithMedal.put(entry.getKey(), "Bronze");
			}else {
				continue;
			}
//			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		return studentWithMedal;
	}
}
