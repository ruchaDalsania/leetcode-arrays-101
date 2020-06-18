package com.leetcode.arrays;

public class FindMaxConsecutiveOnes {

	public int findMaxConsecutiveOnes(int[] nums) {
		int count = 0, max = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				count++;
				if (count > max) {
					max = count;
				}
			} else {
				count = 0;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		FindMaxConsecutiveOnes thisClass = new FindMaxConsecutiveOnes();
		int[] nums = { 1, 0, 1, 1, 0,1,1, 1,1 };
		int maxNumber = thisClass.findMaxConsecutiveOnes(nums);
		System.out.println("Max Consecutive 1s : " + maxNumber);
	}

}
