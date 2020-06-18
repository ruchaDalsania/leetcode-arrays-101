package com.leetcode.arrays;

import java.util.Arrays;

public class ReplaceElements {

	public int[] replaceElements(int[] arr) {

		for (int i = 0;  i < arr.length; i++) {
			int max = 0;
			for (int j = i + 1; j < arr.length; j++) {
				max = Math.max(arr[j], max);
			}
			arr[i] = max;
		}
		arr[arr.length - 1] = -1;
		return arr;
	}

	public static void main(String[] args) {
		ReplaceElements thisClass = new ReplaceElements();
		int arr[] = { 17, 18, 5, 4, 6, 1 };
		System.out.println(
				"replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.");
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(thisClass.replaceElements(arr)));

	}

}
