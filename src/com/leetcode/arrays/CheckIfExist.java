package com.leetcode.arrays;

import java.util.HashSet;

public class CheckIfExist {

	public boolean checkIfExist(int[] arr) {
		HashSet<Integer> set = new HashSet<>();
		for (int i : arr) {
			if (set.contains(i * 2) || i % 2 == 0 && set.contains(i /2)) {
				return true;
			}
			set.add(i);
			
			
		}
		return false;
	}

	public static void main(String[] args) {
		CheckIfExist thisClass = new CheckIfExist();
		int arr[] = { 3, 1, 7, 11 };
		System.out.println(thisClass.checkIfExist(arr));
	}

}
