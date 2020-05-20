package Sdet_Java_Task1;

import java.util.Arrays;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int arr[] = {1,2,3,4};
		int revarr[] = new int [4];
	    for(int j=(arr.length)-1; j>=0; j--) {
	    	revarr[j]= arr[i];
//	    	System.out.println("revarr[j]="+revarr[j]);
	    	i++;
	    }
	    System.out.println("Arr[]="+Arrays.toString(arr));
	    System.out.println("Revarr[]="+Arrays.toString(revarr));
	}

}
