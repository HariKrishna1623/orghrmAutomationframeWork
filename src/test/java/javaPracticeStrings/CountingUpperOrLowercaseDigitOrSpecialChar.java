package javaPracticeStrings;

public class CountingUpperOrLowercaseDigitOrSpecialChar {

	
	
	public static void main(String[] args) {
		
		
		int Uppercase=0;
		int Lowercase=0;
		int digit=0;
		int specialChar=0;

		
		
		String str = "HaRI%&678";
		for(int i =0;i<=str.length()-1;i++) {
			char x= str.charAt(i);
			if(Character.isUpperCase(x)) {
				
				Uppercase++;
			}
			
			else if (Character.isLowerCase(x)) {
				Lowercase++;
			}
			else if (Character.isDigit(x)) {
			digit++;
			}
			else {
				
				specialChar++;
			}
		
		}
		
		
		System.out.println(Uppercase);
		System.out.println(Lowercase);
		System.out.println(digit);
		System.out.println(specialChar);

	}
	
}
