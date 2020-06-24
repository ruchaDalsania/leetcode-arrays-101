package com.leetcode.arrays;

import java.util.Arrays;

public class MoveZeroes {

	public void moveZeroes(int[] nums) {
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[j++] = nums[i];
			}
		}
		while (j < nums.length) {
			nums[j++] = 0;
		}
	}

	public static void main(String[] args) {
		MoveZeroes thisClass = new MoveZeroes();
		int nums[] = {0,1,7,0,4,0,6,0,1};
		System.out.println(Arrays.toString(nums));
		System.out.println(
				"a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.");
		thisClass.moveZeroes(nums);
		System.out.println(Arrays.toString(nums));

	}

}
