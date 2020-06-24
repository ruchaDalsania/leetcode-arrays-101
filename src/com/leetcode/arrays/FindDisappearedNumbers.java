package com.leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDisappearedNumbers {

	public List<Integer> findDisappearedNumbers(int[] nums) {
//		int length = nums.length;
//		List<Integer> range = Arrays.stream(nums).boxed().collect(Collectors.toList());
//		for (int i = 1; i <= length; i++) {
//			if (range.contains(i)) {
//				range.removeAll(Collections.singleton(i));
//			} else {
//				range.add(i);
//			}
//		}
//		return range;

		List<Integer> list = new ArrayList<>();
		for (int i : nums) {
			int val = Math.abs(i) - 1;
			if (nums[val] > 0) {
				nums[val] = -nums[val];
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0) {
				list.add(i + 1);
			}
		}
		return list;
	
	}

	public static void main(String[] args) {
		FindDisappearedNumbers thisClass = new FindDisappearedNumbers();
		int[] nums = { 4, 3, 2, 8, 7, 2, 1, 3 };
		System.out.println(Arrays.toString(nums) + "\n" + thisClass.findDisappearedNumbers(nums)
				+ "\nall the elements of [1, n] inclusive that do not appear in this array");
	}

}
