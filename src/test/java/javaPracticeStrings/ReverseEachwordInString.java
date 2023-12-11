package javaPracticeStrings;

public class ReverseEachwordInString {

	public static void main(String[] args) {
		String st = "aggala hari krishna";
		String[] a = st.split(" ");
		String reversedString = "";
		String  reverseWord = "";

		int lengt = a.length;
		System.out.println(lengt);

		System.out.println(a[0].length());

		for (int i = 0; i <= lengt - 1; i++) {

			int l = a[i].length() - 1;
			System.out.println(l);
			for (int j = 0; j <= a[i].length() - 1; j++) {

				char text = a[i].charAt(j);
				 reverseWord =  text+reverseWord;

			}
			reversedString = reversedString + reverseWord + " ";

		}


		  System.out.print("Reversed string : " + reversedString);
	}

}
