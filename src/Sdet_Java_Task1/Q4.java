package Sdet_Java_Task1;

import java.util.Scanner;

public class Q4 {
	static void swap(int i, int a,int b)
	{
		System.out.println("Test case"+i);
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("a="+a);
		System.out.println("b="+b);
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
			int y=sc.nextInt();
			swap(i, x, y);
		}
		
		}
		else {
			System.out.println("Wrong TC");
		}

	}

}
