package com.interview.poc.array;

import java.util.Arrays;

/**
 * We need to rotate the elements of an array towards the left by the specified
 * number of times. In the left rotation, each element of the array will be
 * shifted to its left by one position and the first element of the array will
 * be added to end of the list.
 * 
 * @author kasho
 *
 */
public class LeftRotateElements {

	public static void main(String[] args) {
		// Initialize array
		int[] arr = new int[] { 0, 1, 2, 3, 4, 5 };
		int len = arr.length;
		int[] fr = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				fr[len - 1] = arr[i];
				continue;
			}
			fr[i - 1] = arr[i];
		}

		// Displays the frequency of each element present in array
		System.out.println("---------------------------------------");
		System.out.println("Element sifted to left " + Arrays.toString(fr));

		System.out.println("----------------------------------------");
	}

}
