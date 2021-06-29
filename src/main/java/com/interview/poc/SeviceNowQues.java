package com.interview.poc;

import java.util.Arrays;

/**
 * Check for next big number and place it in the existing index of the Array
 * Input: [2, 7, 3, 5, 4, 6, 8] Output: [7, 8, 5, 6, 6, 8, -1]
 * 
 * @author kasho
 *
 */
public class SeviceNowQues {
	/*
	 * prints element and NGE pair for all elements of arr[] of size n
	 */
	public static void printNGE(int arr[], int n) {
		int next, i, j;
		int outputArr[] = new int[n]; 
		for (i = 0; i < n; i++) {
			next = -1;
			for (j = i + 1; j < n; j++) {
				if (arr[i] < arr[j]) {
					next = arr[j];
					break;
				}
			}
			outputArr[i]=next;
			//System.out.println(arr[i] + " -- " + next);
		}
		System.out.println(" Ouput Array -- " + Arrays.toString(outputArr));
	}

	public static void main(String args[]) {
		int arr[] = { 2, 7, 3, 5, 4, 6, 8 };
		int n = arr.length;
		printNGE(arr, n);
	}
}
