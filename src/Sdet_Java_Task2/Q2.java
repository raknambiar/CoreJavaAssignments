package Sdet_Java_Task2;
//Program to find the product of two matrices
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]arr1 = {{1,2,3},{4,5,6}};
		int [][]arr2 = {{2,4},{1,3},{5,2}};
		int [][]prod= new int [2][2];
		
		System.out.println("First matrix: ");
		display(arr1);
		System.out.println("Second matrix: ");
		display(arr2);
        
		for(int i =0 ; i<2 ; i++) {
			for(int j=0; j< 2 ; j++) {
				for(int k=0;k<3;k++) {
					prod[i][j] += arr1[i][k]* arr2[k][j];
				}
			}
		}
		System.out.println("Prod of two matrices is: ");
        display(prod);

	}
	public static void display(int [][]mat) {
        for(int[] row : mat) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }  


	}

}
