package javaPracticeStrings;

import java.util.Iterator;

public class ReverseAString {
	
	public static void main(String[] args) {
		
		String st ="aggala hari krishna";
		
		String temp ="";
		
		for(int i=0;i<=st.length()-1;i++) {
			
			char a =st.charAt(i);
		 temp =a+temp;
		}
		
		System.out.println(temp);
	}
	
	

}
