package Sdet_Java_Task3;
//Program to find the transpose of two matrices
public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]arr1 = {{1,2,3},{4,5,6}};
		int [][]Transpose = new int [3][2];
		System.out.println("Display Matrix: ");
		display(arr1);
		
		for(int i =0 ; i<arr1.length ; i++) {
			for(int j=0; j< arr1[i].length ; j++) {
				Transpose[j][i] = arr1[i][j];
			}
		}
		System.out.println("Transpose of Matrix: ");
		display(Transpose);
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
