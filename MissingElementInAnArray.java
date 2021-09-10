package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num []  = {1,2,3,4,6,7,8};
		Arrays.sort(num);

		// loop through the array (start i from arr[0] till the length of the array)
		for (int i = 0; i < num.length; i++) {
			// check if the iterator variable is not equal to the array values respectively
			int j = i+1; 
			if(num[i]!=j) {
				// print the number
				System.out.println(j);
				// once printed break the iteration
				break;
			}

		}

	}
}
