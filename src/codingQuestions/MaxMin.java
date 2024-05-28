package codingQuestions;

import java.util.Arrays;

public class MaxMin {

	public static void main(String[] args) {
		int[] arr = {33333,2,1,2,3,4,5};
		
		int max = arr[0];
		int min = arr[0];
		for(int i = 0 ; i < arr.length;i++) {
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
		}
		System.out.println("max = "+max+"  "+ "min = "+min);
		Arrays.sort(arr);
		System.out.println("max = "+arr[arr.length-1]+"  "+ "min = "+arr[0]);
	}

}
