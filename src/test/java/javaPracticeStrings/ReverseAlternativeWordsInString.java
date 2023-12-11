package javaPracticeStrings;

import net.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.SelfInjection.Split;

public class ReverseAlternativeWordsInString {
	public static void main(String[] args) {
		
		String st = ("Aggala hari krishna from vizag");
		
		String st1[] = st.split(" ");
		int x=st1.length;
		System.out.println(x);
		System.out.println(st1[1]);
		for(int i=0;i<=x-1;i++) {
			
			if(i%2!=0 ) {
				
				
			
		
				String b=st1[i].toString();
				
			StringBuffer s= new StringBuffer();
			s.append(b);
			
			 s.reverse();
				System.out.println(s);
			}
			else {
			System.out.println(st1[i]);	
			}
			
		}
		
		
		
		
	}

}
