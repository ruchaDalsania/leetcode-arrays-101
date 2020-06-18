package com.leetcode.arrays;

import java.util.Arrays;

public class RemoveDuplicates {

	public int removeDuplicates(int[] nums) {
		int j = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[j]) {
				j++;
				nums[j] = nums[i];
			}
		}

		return j+1;
	}

	public static void main(String[] args) {
		RemoveDuplicates thisClass = new RemoveDuplicates();
		System.out.println(
				"Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.");
		int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		System.out.println(thisClass.removeDuplicates(nums) + " :  " + Arrays.toString(nums));
	}

}
