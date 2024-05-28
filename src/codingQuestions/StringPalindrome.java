package codingQuestions;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcba0";
		System.out.println("-----------");
		if(isPalindrome(s)) {
			System.out.println(s+" is a palidrome");
		}
		else {
			System.out.println(s+" is not a palidrome");
		}
		System.out.println("-----------");
		

	}

	private static boolean isPalindrome(String s) {
		//1.
//		int length = s.length();
//		char[] ch = s.toCharArray();
//		
//		int i =0,j=length-1;
//		while(i<j) {
//			if(ch[i++] != ch[j--]) return false;
//		}
//				
//		return true; 
		
		
		//2.
		String rev = "";
		int length = s.length();

		while(length>0) {
			rev += s.charAt(length-1);
			length--;
		}
		
		System.out.println(rev.toString()); 
		if(!rev.equals(s))return false;
		return true;
		
	}

}
