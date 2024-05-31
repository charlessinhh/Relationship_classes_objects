package codingQuestions;

import java.util.Arrays;

public class Reverse_Word_In_String {

	public static void main(String[] args) {
//		Input: s = "the sky is blue"
//				Output: "blue is sky the"
//		Input: s = "  hello world  "
//				Output: "world hello"
		
		String s = "i like this program very much ";
		s = s.trim();
		
		String[] str = s.split("\\s+");
		
		//1
//		String[] newStr = new String[str.length];
//		
//		int i = str.length-1;
//		int index = 0;
//		while(i>=0) {
//			newStr[index] = str[i];
//			i--;
//			index++;
//		}
//		String newS = String.join(" ", newStr);
//		System.out.println(newS);
//		System.out.println(Arrays.toString(newStr));
//		
		
		//2
		int i = 0; 
		int j = str.length-1;
		while(i<j) {
			String temp = str[i];
			str[i] = str[j];
			str[j] = temp;
			i++;
			j--;
		}
		String newS = String.join(" ", str);
		System.out.println(Arrays.toString(str));
		System.out.println(newS);
	}

}
