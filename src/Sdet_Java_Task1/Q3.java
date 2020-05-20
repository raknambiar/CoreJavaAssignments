package Sdet_Java_Task1;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k, great;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int n = s.nextInt();
		System.out.println("Enter k");
		k = s.nextInt();
		int arr[] = new int [n];
		
		System.out.println("Enter array elements");
		for(int i=0; i<n;i++) {
			arr[i] = s.nextInt();
		}
		
		great = arr[0];
		for(int i=0; i<n;i++) {
	//		System.out.println("great"+great);
		//	System.out.println("arr[i]="+arr[i]);
		//	System.out.println("i="+i);
			if(k<great) {
				System.out.println("enter the loop and great="+great);
				System.out.println("arr[i]="+arr[i]);
				System.out.println("arr[i-1]="+arr[i-2]);
				great = arr[i-2];
				break;
			}
			if(great<arr[i]) {
		//		System.out.println("i2="+i);
				great = arr[i];
		//		System.out.println("great2"+great);
		//		System.out.println("arr[i]2="+arr[i]);
				System.out.println("great"+great);
			//	System.out.println("="+arr[i]);
				
			}
		}
		System.out.println(great);
		
		

	}

}
