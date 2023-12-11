package javaPracticeStrings;

public class ModifiStringOddToUppercaseEventoReverse {

	public static void main(String[] args) {
		String str = "this is aggala hari krishna";
		String[] sp = str.split(" ");
		int nu = sp.length;

		System.out.println(nu);
		for (int i = 0; i <= nu - 1; i++) {
			String temp = "";
//	System.out.println(sp[i]);

			if (i % 2 == 0) {
				
				for (int j = 0; j <= sp[i].length() - 1; j++) {
				//	String temp = "";
					char word = sp[i].charAt(j);

					temp = word+temp ;

					//System.out.print(temp);
				}
				System.out.print(temp+" ");
			} else {
				// System.out.println("NUMBER IS odd"+i);

				// sp[i].toUpperCase();
				System.out.print(sp[i].toUpperCase() + " ");
			}
		}

	}
}
