package Sdet_Java_Task2;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Wipro Technologies";
		char c = 'o';
		int freq =0;
		for(int i=0;i<s.length();i++) {
			if(c==s.charAt(i)) {
				freq++;
			}
		}
		System.out.println("Freq ="+freq);

	}

}
