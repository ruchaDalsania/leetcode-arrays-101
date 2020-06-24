package com.leetcode.arrays;

import java.util.Arrays;

public class SortArrayByParity {

	public int[] sortArrayByParity(int[] A) {
		int j = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] % 2 == 0) {
				int temp = A[j];
				A[j] = A[i];
				A[i] = temp;
				j++;
			}
		}

		return A;
	}

	public static void main(String[] args) {
		SortArrayByParity thisClass = new SortArrayByParity();
		int A[] = { 2, 5, 0, 7, 4 };
		System.out.println(Arrays.toString(A));
		System.out.println(
				"return an array consisting of all the even elements of A, followed by all the odd elements of A.");
		thisClass.sortArrayByParity(A);
		System.out.println(Arrays.toString(A));

	}

}
