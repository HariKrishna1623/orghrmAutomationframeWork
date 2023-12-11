package arrays;

public class SingleDiamentionArray {

	public static void main(String[] args) {
		// sum of all numbers in array
		int num = 0;
		int[] i = new int[5];

		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		i[4] = 50;

		for (int j = 0; j <= i.length - 1; j++) {

			num=num+i[j];

		}
		System.out.println(num);
 int avg = num/i.length;
 System.out.println(avg);
	}

}
