package week1.day2;

public class DuplicateInArrays {

	public static void main(String[] args) {

		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};

		// get the length of the array
		int get = arr.length-1;
		System.out.println(get);
		// iterate from 0 to the array length-1 (outer loop starts here)
		for (int i = 0; i < arr.length; i++) {
			// assign 0 to count 
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i] == arr[j]) 
					System.out.println("the duplicate value is :" +arr[i]);
			}
		}

	}

}
