package Sdet_Java_Task3;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int rows, cols;    
	     boolean identity = true;    
	            
	 
	     int a[][] = { {1, 0, 0}, {0, 1, 0}, {0, 0, 1} };  
	     rows = a.length;    
	     cols = a[0].length;                      
	            
	     if(rows == cols) {   
	            for(int i = 0; i < rows; i++){    
	                for(int j = 0; j < cols; j++){    
	                  if(i == j && a[i][j] != 1){    
	                	  identity = false;    
	                      break;    
	                  }    
	                  if(i != j && a[i][j] != 0){    
	                	  identity = false;    
	                      break;    
	                  }    
	                }    
	            }    
	            if(identity)    
	                System.out.println("Matrix is an identity matrix");    
	            else    
	                System.out.println("Matrix is not an identity matrix"); 
	              
		        }    

		}

	}           
	      
	        
	                
	
