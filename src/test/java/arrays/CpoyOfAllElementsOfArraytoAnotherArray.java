package arrays;

public class CpoyOfAllElementsOfArraytoAnotherArray {
	
	
	public static void main(String[] args) {
		
		int a[] = new int[] {1,2,3,4,5};
		
		int len= a.length;
		
		int b[]=new int[len];
		
	for(int i=0;i<=len-1;i++) {
		
		b[i]=a[i];
		
		
	}
System.out.println(b[4]);
}
}