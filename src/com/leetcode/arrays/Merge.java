package com.leetcode.arrays;

import java.util.Arrays;

public class Merge {

	public void merge(int[] nums1, int m, int[] nums2, int n) {
		for (int i = m, j = 0; i < nums1.length; i++, j++) {
			nums1[i] = nums2[j];
		}
		Arrays.sort(nums1);
	}

	public static void main(String[] args) {
		Merge thisClass = new Merge();
		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		thisClass.merge(nums1, 3, new int[] { 2, 5, 6 }, 3);
		System.out.println("two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array : "
				+ Arrays.toString(nums1));
	}

}
