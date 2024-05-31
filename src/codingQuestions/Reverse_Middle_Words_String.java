package codingQuestions;

import java.util.Arrays;

public class Reverse_Middle_Words_String {

	public static void main(String[] args) {
//		Input  : Hi how are you geeks 
//		Output  : Hi woh era uoy geeks
//
//		Input : I am fine
//		Output : I ma fine
		
		String s = " Hi how  are you geeks ";
		System.out.println("input: "+s);
		s = s.trim();
		String[] str = s.split("\\s+");
		
		for(int i = 1;i < str.length-1;i++) {
			str[i] = revString(str[i]);
		}
		System.out.println("Output: "+String.join(" ", str));
		System.out.println(Arrays.toString(str));

	}

	private static String revString(String string) {
		int length = string.length();
		String revS = "";
		for(int i = length-1;i>=0;i--) {
			revS += string.charAt(i);
		}
		return revS;
	}

}
