package practicePrograms;

import java.util.HashMap;

public class CharCout {

	public static void main(String[] args) {
		
	String str ="Hello World! 123";
	
	HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	
	for(char c : str.toCharArray()) {
		map.put(c, map.getOrDefault(c, 0)+1);
	}
	System.out.println(map);
	}

}
