package Sdet_Java_Task3;
//Program to find the frequency of odd and even numbers in the given matrix

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {1, 2, 3, 4, 5};
		int [][]arr1 = {{1,2,3},{4,5,6},{7,8,9}};
		int odd=0, even=0, odd1=0, even1=0;
		
		for(int i =0 ; i<arr.length ; i++) {
			if ((arr[i] % 2) == 0){
				even++;
			}
			else {
				odd++;
			}				
		}
		System.out.println("In arr, even = "+even+", odd = "+ odd);
		for(int i =0 ; i<arr1.length ; i++) {
			for (int j=0; j<arr1[i].length;j++) {
				if ((arr1[i][j] % 2) == 0){
					even1++;
				}
				else {
					odd1++;
				}				
			}
			
		}
		System.out.println("In arr1 even = "+even1+", odd = "+ odd1);
	}

}

	
