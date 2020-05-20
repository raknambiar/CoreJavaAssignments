package Sdet_Java_Task2;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]arr1 = {{1,2},{3,4}};
		int [][]arr2 = {{10,20},{30,40}};
		int [][]sum = new int [2][2];
		
		System.out.println("First matrix: ");
		for(int[] row : arr1) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
     
        }
		System.out.println("Second matrix: ");
		for(int[] row : arr2) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
		for(int i =0 ; i<arr1.length ; i++) {
			for(int j=0; j< arr1[i].length ; j++) {
				sum[i][j] = arr1[i][j]+ arr2[i][j];
	//			System.out.println("sum["+i+"]["+j+"]"+sum[i][j]);
			}
		}
		System.out.println("Sum of two matrices is: ");
        for(int[] row : sum) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }  

	}

}
