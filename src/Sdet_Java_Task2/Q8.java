package Sdet_Java_Task2;

import java.util.Arrays;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr1 = {1, 2, 3};
	     int[] arr2 = {4, 5, 6};
	 
	    
	     int arr1Len = arr1.length;
	     int arr2Len = arr2.length;
	     int[] result = new int[arr1Len + arr2Len];

	     System.arraycopy(arr1, 0, result, 0, arr1Len);
	     System.arraycopy(arr2, 0, result, arr1Len, arr2Len);

	     System.out.println("Concatenated arrays="+Arrays.toString(result));

	}

}
