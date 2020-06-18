package com.leetcode.arrays;

import java.util.Arrays;

public class RemoveElement {

	public int removeElement(int[] nums, int val) {
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[j++] = nums[i];
			}
		}
		return j;
	}

	public static void main(String[] args) {
		RemoveElement thisClass = new RemoveElement();
		System.out.println(
				"Given an array nums and a value val, remove all instances of that value in-place and return the new length");
		int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };
		System.out.println(thisClass.removeElement(nums, 2) + " : " + Arrays.toString(nums));

	}

}
