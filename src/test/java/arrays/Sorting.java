package arrays;

import java.util.Arrays;

public class Sorting {
	
	public static void main(String[] args) {
		
		
		int [] array = new int [] {90, 23, 5, 109, 12, 22, 67, 34};  
		//invoking sort() method of the Arrays class  
int temp;
	 
		for (int i = 0; i < array.length; i++)   {
			
			for (int j = i; j < array.length; j++) {
			
				
				if (array[i]>array[j]) {
					
					temp=array[i];
					
					array[i]=array[j];
					array[j]=temp;
					
					
				}
			}
			
		
			}
		for(int a:array) {
			System.out.println(a);
		}
		}
	}


