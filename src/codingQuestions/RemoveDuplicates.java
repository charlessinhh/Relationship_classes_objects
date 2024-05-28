package codingQuestions;

import java.util.LinkedHashMap;
import java.util.Map;


public class RemoveDuplicates {

	public static void main(String[] args) {
		String s = "abcbcd"; //abcd
		
		Map<Character,Integer> kv = new LinkedHashMap<>();
		char[] str = s.toCharArray();
//		String newStr = "";
		StringBuilder newStr = new StringBuilder();
		for(int i = 0 ; i < str.length;i++) {
			if(!kv.containsKey(str[i])) {
//				newStr += str[i];
				newStr.append(str[i]);
				kv.put(str[i], 1);
			}
		}
		
		System.out.println(newStr.toString());
		
		
		

	}

}
