package com.leetcode.arrays;

import java.util.Arrays;

public class SortedSquares {

	public int[] sortedSquares(int[] A) {
		/*
		 * int[] b = new int[A.length]; for (int i = 0; i < A.length; i++) { b[i] = A[i]
		 * * A[i]; } Arrays.sort(b); return b;
		 */
		/*
		 * for (int i = 0; i < A.length; i++) { if (A[i] < 0) { A[i] *= -1; } A[i] *=
		 * A[i]; } for (int i = 0; i < A.length; i++) { for (int j = i; j < A.length;
		 * j++) { if (A[i] > A[j]) { int temp = A[i]; A[i] = A[j]; A[j] = temp; }
		 * 
		 * } }
		 */
		int n = A.length;
		int[] result = new int[n];
		int i = 0, j = n - 1;
		for (int p = n - 1; p >= 0; p--) {
			if (Math.abs(A[i]) > Math.abs(A[j])) {
				result[p] = A[i] * A[i];
				i++;
			} else {
				result[p] = A[j] * A[j];
				j--;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		SortedSquares thisClass = new SortedSquares();
		int[] nums = { -4, -1, 0, 3, 10 };
		int[] sortedSqaures = thisClass.sortedSquares(nums);
		System.out.println(Arrays.toString(nums)
				+ "\n an array of the squares of each number, also in sorted non-decreasing order. :\n "
				+ Arrays.toString(sortedSqaures));
	}

}
