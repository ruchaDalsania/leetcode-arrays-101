package com.leetcode.arrays;

public class FindNumbers {

	public int findNumbers(int[] nums) {
		int count = 0;
		for (int i : nums) {
			if (Integer.toString(i).length() % 2 == 0) {
				count++;
			}
		}
		return count;
	}

//	private int findLength(int num) {
//		int count = 0;
//		while (num > 0) {
//			count++;
//			num = num / 10;
//		}
//		return count;
//	}

	public static void main(String[] args) {
		FindNumbers thisClass = new FindNumbers();
		int[] nums = { 12, 345, 2, 6, 7896 };
		int count = thisClass.findNumbers(nums);
		System.out.println("how many of them contain an even number of digits : " + count);
	}

}
