package Sdet_Java_Task1;

import java.util.Scanner;

public class Q5 {
	static boolean isPowerofTwo(int n) 
    { 
        if (n == 0) 
            return false; 
          
        while (n != 1) 
        { 
            if (n % 2 != 0) 
                return false; 
            n = n / 2; 
        } 
        return true; 
    } 
	static int i;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of TC");
		int TC=sc.nextInt();
		
		if(TC<=100 & TC>=1){
		while(TC--!= 0) {
			i++;
			System.out.println("Enter the values for TC"+i);
			int x=sc.nextInt();
			if (isPowerofTwo(x)) 
            System.out.println("Yes"); 
			else
            System.out.println("No"); 
		}

		}

	}

}
