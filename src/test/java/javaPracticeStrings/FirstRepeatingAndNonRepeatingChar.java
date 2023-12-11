package javaPracticeStrings;

public class FirstRepeatingAndNonRepeatingChar {

	public static void main(String[] args) {
		
		String str= "hari Krishana";
		for(int i=0;i<=str.length();i++) {
			for(int j=1;j<=str.length()-1;j++) {
				char charatI=str.charAt(i);
				char charatJ=str.charAt(j);
				if(str.charAt(i)==str.charAt(j)) {
					System.out.println("first Repeating char in string "+charatI);
					
				}
			
			//	System.out.println("first repiting char in string "+str.charAt(i));

//				else {
//					System.out.println("first non repiting char String"+str.charAt(i));
//				}
			}
			break;
		}
		
		
	}
}
