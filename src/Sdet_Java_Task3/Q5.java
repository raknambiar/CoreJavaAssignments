package Sdet_Java_Task3;
//Program to display the lower triangular matrix 
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows, cols;
		int a[][] = {{1, 2}, {4, 5, 6}, {7, 8, 9}   };       
		rows = a.length;    
        cols = a[0].length;   
		if(rows == cols){    
			 System.out.println("Lower triangular matrix: ");    
             for(int i = 0; i < rows; i++){    
                 for(int j = 0; j < cols; j++){    
                   if(j > i)    
                     System.out.print("0 ");    
                   else    
                     System.out.print(a[i][j] + " ");    
               }    
               System.out.println();    
           }    
       }  
	   else {    
		   System.out.println("Cannot display the trinagular matrix"); 
	   }

	}

}           
      
         
        
            
                    
                  
              
	
