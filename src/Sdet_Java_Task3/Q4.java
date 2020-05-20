package Sdet_Java_Task3;
//Program to check if two matrices are equal
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]arr1 = {{2,4},{1,3},{5,2}};
		int [][]arr2 = {{2,4},{1,3},{5,2}};
		boolean equal = true;
		
		for (int i=0; i<arr1.length;i++) {
			for (int j=0;j<arr1[i].length;j++) {
				if(arr1[i][j] != arr2[i][j]) {
					equal = false;
					break;
				}
				
			}
		}
		if(equal)
			System.out.print("Matrices are equal");
		else
			System.out.print("Matrices are not equal");
	}

}
