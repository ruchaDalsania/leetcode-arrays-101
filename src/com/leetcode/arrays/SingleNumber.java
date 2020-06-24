package com.leetcode.arrays;

import java.util.Arrays;

public class SingleNumber {

	public int singleNumber(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[Math.abs(arr[i])] >= 0)
				arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
			else
				System.out.print(Math.abs(arr[i]) + " ");
		}
		return 0;
	}

	public static void main(String[] args) {
		SingleNumber thisClass = new SingleNumber();
		System.out.println("every element appears three times except for one, which appears exactly once.");
		int[] nums = { -2, -2, 1, 1, -3, 1, -3, -3, -4, -2 };
		System.out.println(thisClass.singleNumber(nums) + " : " + Arrays.toString(nums));

	}

}
