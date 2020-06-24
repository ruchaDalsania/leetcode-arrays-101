package com.leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HeightChecker {

	public int heightChecker(int[] heights) {
//		int i = 0;
//		int j = heights.length - 1;
//		List<Integer> list = new ArrayList<Integer>();
//		for (int p = heights.length - 1; p >= 0; p--) {
//			if (heights[i] < heights[j]) {
//				i++;
//			}
//			if (heights[i] > heights[j]) {
//				int temp = heights[i];
//				heights[i] = heights[j];
//				heights[j] = temp;
//
//				if (!list.contains(heights[i]))
//					list.add(heights[i]);
//				if (!list.contains(heights[j]))
//					list.add(heights[j]);
//				j--;
//			}
//		}
		// failing for some tests
		int[] newarray = Arrays.copyOf(heights, heights.length);
		Arrays.sort(newarray);
		int count = 0;
		for (int i = 0; i < heights.length; i++) {
			if (heights[i] != newarray[i]) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		HeightChecker thisClass = new HeightChecker();
		int[] heights = { 1, 1, 4, 2, 1, 3 };
		System.out.println(Arrays.toString(heights)
				+ "\n Return the minimum number of students that must move in order for all students to be standing in non-decreasing order of height.\n"
				+ thisClass.heightChecker(heights) + "\n" + Arrays.toString(heights));

	}

}
