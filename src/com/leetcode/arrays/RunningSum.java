package com.leetcode.arrays;

import java.util.Arrays;

public class RunningSum {

	public int[] runningSum(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum = Math.addExact(nums[i], sum);
			nums[i] = sum;
		}
		return nums;
	}

	public static void main(String[] args) {
		RunningSum thisClass = new RunningSum();

		int arr[] = { 1, 2, 3, 4 };
		System.out.println(" a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).");
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(thisClass.runningSum(arr)));
	}

}
