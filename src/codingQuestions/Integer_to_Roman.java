package codingQuestions;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Integer_to_Roman {

	public static void main(String[] args) {
		Map<Integer, String> romanMap = new LinkedHashMap<>();
        romanMap.put(1000, "M");
        romanMap.put(900, "CM");
        romanMap.put(500, "D");
        romanMap.put(400, "CD");
        romanMap.put(100, "C");
        romanMap.put(90, "XC");
        romanMap.put(50, "L");
        romanMap.put(40, "XL");
        romanMap.put(10, "X");
        romanMap.put(9, "IX");
        romanMap.put(5, "V");
        romanMap.put(4, "IV");
        romanMap.put(1, "I");
		
		
		
		
		int num = 49;
		// StringBuilder to build the Roman numeral string
        StringBuilder roman = new StringBuilder();
		
		for (Entry<Integer, String> entry : romanMap.entrySet()) {
            System.out.println("Key " + entry.getKey() + ", value "+ entry.getValue());
            while (num >= entry.getKey()) {
                num -= entry.getKey();
                roman.append(entry.getValue());
            }
        }
		
		System.out.println(roman);

	}

}
