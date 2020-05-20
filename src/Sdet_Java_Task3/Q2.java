package Sdet_Java_Task3;
//Program to find the sum of each row and column of a matrix
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int sumRow, sumCol;    
		 int a[][] = { {1, 2, 3},  {4, 5, 6}, {7, 8, 9}};         
        
	     for(int i = 0; i < a.length; i++){    
	    	 sumRow = 0;    
	    	 for(int j = 0; j < a[i].length; j++){    
	              sumRow = sumRow + a[i][j];       
	         }    
	         System.out.println("Sum of " + (i+1) +" row= " + sumRow);
	     }       
	               
	     for(int i = 0; i < a.length; i++){    
	    	 sumCol = 0;    
	    	 for(int j = 0; j < a[i].length; j++){    
	              sumCol = sumCol + a[j][i];    
	         }    
	         System.out.println("Sum of " + (i+1) +" column= " + sumCol);          
	     }       
	}

}        
                    
              
	  
	        
	              
	             
	              
	            
	       

