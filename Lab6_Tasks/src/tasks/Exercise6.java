package tasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Exercise6 {
	public static void main(String[] args) {
		List<Integer> voterList = new ArrayList<Integer>(); 
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		int voterID;
		int voterAge , numberOfVoters;
		Scanner sc =  new Scanner(System.in);
		Exercise6 ex = new Exercise6();
		
		System.out.println("Enter the number of Voters:-");
		numberOfVoters  = sc.nextInt();
		
		for(int i =0 ;i<numberOfVoters;++i) {
			System.out.println("Voter ID:  ");
			voterID = sc.nextInt();
			System.out.println("Voter Age: ");
			voterAge = sc.nextInt();
			map.put(voterID, voterAge);
		}
		voterList = ex.getStudents(map);
		for(int i=0 ;i<voterList.size();++i) {
			System.out.println(voterList.get(i));
		}
		sc.close();
	}
	
	// accepts hashMap of student name and marks return hashmap of student name and medal name
	public List<Integer> getStudents(HashMap<Integer,Integer> map){
		List<Integer> voterList = new ArrayList<Integer>(); 
		
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			
			if(entry.getValue()>=18) {
				voterList.add(entry.getKey());
			}
				continue;
			}
		return voterList;
	}
}
