package javaPracticeStrings;

public class CountingTotalNumberOccuranceInSting {
	
	public static void main(String[] args) {
		
		String st= "hari krishna";
		char target='h';
		int count =0;
		
		for(int i =0;i<=st.length()-1;i++) {
			char x= st.charAt(i);
			if(x==target) {
				
				count++;
				
			}
		}
System.out.println(count);
	}
	
	

}
