package com.leetcode.arrays;

import java.util.Arrays;

public class SortedSquares {

	public int[] sortedSquares(int[] A) {
		int[] b = new int[A.length];
		for (int i = 0; i < A.length; i++) {
			b[i] = A[i] * A[i];
		}
		Arrays.sort(b);
		return b;
	}

	public static void main(String[] args) {
		SortedSquares thisClass = new SortedSquares();
		int[] nums = { -7, -3, 2, 3, 11 };
		int[] sortedSqaures = thisClass.sortedSquares(nums);
		System.out.println("an array of the squares of each number, also in sorted non-decreasing order. : "
				+ Arrays.toString(sortedSqaures));
	}

}
