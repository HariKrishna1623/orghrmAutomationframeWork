package arrays;

import java.util.Arrays;

public class MergingTwoArrays {

	public static void main(String[] args) {

		// methods in Arrays

		int a[][] = { { 1, 2, 3, 4, 5, 6 } };

		int b[][] = { { 1, 2, 3, 4, 5 } };

		// 6, 7, 8, 9, 10
		int c[] = new int[10];
		int intKey = 5;

		// binary search gives the index number of the given number in array
		// System.out.println(Arrays.binarySearch(a, 5));

		// binary search gives the index of the number between range of two points
		// EX:(0-4) if number is not in range it gives -ve sign for index
		// System.out.println(Arrays.binarySearch(a, 0, 3, intKey));
		// Arrays.compare(a, b);

		// it will compare two arrays
		// if two arrays are equal it gives '0' otherwise it gives 1
		// System.out.println(Arrays.compare(a, b));

		Arrays.copyOf(a, 10);
		// this method create new array with given length wuth "0"
		System.out.println(Arrays.toString(Arrays.copyOf(a, 10)));

		System.out.println(a.length);

		// copy range method is used to copy the array from based on range (example i
		// want array from 1 to 3 only we uses this method)
		System.out.println(Arrays.toString(Arrays.copyOfRange(a, 1, 3)));

		// deep equals method used to compare the two Arrays data it returns true or
		// false 
		System.out.println(Arrays.deepEquals(a, b));
	}

}