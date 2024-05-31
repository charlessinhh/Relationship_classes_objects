package codingQuestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Find_Duplicates_Element_Array {

	public static void main(String[] args) {
//		Input: {2, 10,10, 100, 2, 10, 11,2,11,2}
//		Output: 2 10 11

		int[] input = {2, 10,10, 100, 2, 10, 11,2,11,2,1};
		int length = input.length;
	
		
		List<Integer> ans = new ArrayList<>();
		
		//brute force
//		for(int i = 0 ; i < length;i++) {
//			for(int j = i+1; j <length;j++ ) {
//				if(input[i] == input[j] & i != j) {
//					
//					if(ans.contains(input[i])) {
//						//if already present no need to add it again
//						break;
//					}
//					else {
//						ans.add(input[i]);
//					}
//				}
//			}
//		}
		
		//Using Set
		Set<Integer> setS = new HashSet<>();
		
		for(int num: input) {
			System.out.println(num);
			if(setS.add(num) == false && !ans.contains(num)) {
				ans.add(num);
			}
			
		}
		
		System.out.println(ans.toString());
		
	}

}
