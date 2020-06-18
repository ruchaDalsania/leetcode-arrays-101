package com.leetcode.arrays;

import java.util.Arrays;

public class DuplicateZeros {

	public void duplicateZeros(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				for (int j = arr.length - 1; j > i; j--) {
					arr[j] = arr[j - 1];
				}
				i++;
			}
		}
	}

	public static void main(String[] args) {
		DuplicateZeros thisClass = new DuplicateZeros();
		int[] arr = { 1, 0, 2, 3, 0, 4, 5, 0 };
		thisClass.duplicateZeros(arr);
		System.out.println(Arrays.toString(arr));
	}

}
