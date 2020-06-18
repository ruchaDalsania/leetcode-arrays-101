package com.leetcode.arrays;

public class ValidMountainArray {
	public boolean validMountainArray(int[] A) {
		if (A.length < 3 || A[0] > A[1]) {
			return false;
		}
		int i = 0;
		while (i < A.length - 1 && A[i] < A[i + 1]) {
			i++;

		}
		if (i == 0 || i == A.length - 1) {
			return false;
		}
		while (i < A.length - 1 && A[i] > A[i+1]) {
			i++;
		}
		return i == A.length - 1;
	}

	public static void main(String[] args) {
		ValidMountainArray thisClass = new ValidMountainArray();
		int[] nums = { 2, 3, 6, 4, 1, 0 };
		System.out.println(thisClass.validMountainArray(nums));
	}

}
