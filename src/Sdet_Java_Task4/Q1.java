package Sdet_Java_Task4;

import java.util.LinkedHashMap;
import java.util.Map;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "how many duplicates are there";
		s=s.replace(" ","");
		
		Map freqCount = new LinkedHashMap<Character,Integer>();
		for(char ch: s.toCharArray()) {
			if(freqCount.containsKey(ch)) {
				freqCount.put(ch, (Integer)freqCount.get(ch)+1) ;
			}
			else {
				freqCount.put(ch,1);
				
			}
		}
		System.out.println(freqCount);
		

	}

}
