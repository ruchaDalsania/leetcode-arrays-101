package com.leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThirdMax {

	public int thirdMax(int[] nums) {
		List<Integer> list = new ArrayList<Integer>();

		for (int i : nums) {
			if (!list.contains(i)) {
				list.add(i);
			}
		}
		if (list.size() < 3) {
			return Collections.max(list);
		} else {
			return list.get(2);
		}
	}

	public static void main(String[] args) {
		ThirdMax thisClass = new ThirdMax();
		int[] heights = {5,1 ,1,0,5,3};
		System.out.println(Arrays.toString(heights) + "\n the third maximum distinct number in this \n"
				+ thisClass.thirdMax(heights));

	}

}
