package tasks;

import java.util.HashMap;
import java.util.Map;

public class Exercise2 {
	static final int MAX_CHAR = 256;

	static HashMap<Character, Integer> getOccuringChar(char[] str) {
		HashMap<Character, Integer> map;
		map = new HashMap<Character, Integer>();
		int count[] = new int[MAX_CHAR];
		int len = str.length;
		for (int i = 0; i < len; i++)
			count[str[i]]++;
		char ch[] = new char[str.length];
		for (int i = 0; i < len; i++) {
			ch[i] = str[i];
			int find = 0;
			for (int j = 0; j <= i; j++) {
				if (str[i] == ch[j])
					find++;
			}

			if (find == 1)
				map.put(str[i], count[str[i]]);
		}
		return map;
	}

	public static void main(String[] args) {
		String str = "Saurabh Sharma";
		char[] ch = str.toCharArray();
		HashMap<Character, Integer> map;
		map = getOccuringChar(ch);
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}
