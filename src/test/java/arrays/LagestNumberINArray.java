package arrays;

public class LagestNumberINArray {
	
	public static void main(String[] args) {
		
		int a[]= new int[] {1,63,75,89,648,994,539}; 
		
		int Maxnum=a[0];
		for(int i=0;i<=a.length-1;i++) {

			if(a[i]>Maxnum) {
               Maxnum=a[i];				
			}
			
		}
		System.out.println(Maxnum);
	}

}
