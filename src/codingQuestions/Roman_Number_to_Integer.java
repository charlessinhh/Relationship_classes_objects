package codingQuestions;

import java.util.HashMap;
import java.util.Map;

public class Roman_Number_to_Integer {

	public static void main(String[] args) {
		// Input:
		String s = "IV";
//		Output: 5
		
		Map<Character, Integer> romanValues = new HashMap<>();
        
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);
        
        int integerValue = 0;
        
        for(int i = 0 ; i < s.length();i++) {
        	int currentValue = romanValues.get(s.charAt(i));
        	
        	if(i < s.length()-1 && currentValue < romanValues.get(s.charAt(i+1))) {
        		integerValue -= currentValue;
        	}else {
        		integerValue += currentValue;
        	}
        }
        
        System.out.println(integerValue);
	}

}
