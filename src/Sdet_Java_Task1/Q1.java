package Sdet_Java_Task1;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Wipro";
		String s1 = "";
		
		for(int i=(s.length()-1); i>=0; i--) {
			System.out.println(s.charAt(i));
			s1 = s1+s.charAt(i);
		}
		System.out.println("Reversed string ="+s1);

	}

}
