package javaPracticeStrings;

import java.util.Scanner;

public class ToCountNumberOfwordsInString {

	
	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter the input");
		
		String str = sc.nextLine();
	String[] x =	str.split(" ");
	System.out.println(x.length);
	
	}
}
