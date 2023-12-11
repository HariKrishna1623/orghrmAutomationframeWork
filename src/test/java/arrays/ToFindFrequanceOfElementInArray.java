package arrays;

import java.util.Iterator;

public class ToFindFrequanceOfElementInArray {
	public static void main(String[] args) {
		
		int a[]= new int [] {1,2,3,4,5,6,3,4,5,2};
		
		
		
		for(int i=0;i<=a.length-1;i++) {
			int count=1;
			
			for(int j=i+1;j<=a.length-1;j++) {
				
				
			if(a[i]==a[j]) {
				
				count++;
				System.out.println("element in array is "+a[i]+"and frequancy is"+count);

			}
			
			}
			
		}
	//	System.out.println("element in array is "+a[i]+"and frequancy is"+count);

	}

}
