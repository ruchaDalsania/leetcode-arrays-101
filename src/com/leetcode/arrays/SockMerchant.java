package com.leetcode.arrays;

import java.util.HashMap;

public class SockMerchant {

	// Complete the sockMerchant function below.
	int sockMerchant(int n, int[] ar) {
		int[] ar1 = { 0 };
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < ar.length; i++) {
			if (map.containsKey(ar[i])) {
				map.compute(ar[i], (k, v) -> v + 1);
			} else {
				map.put(ar[i], 1);
			}

		}
		map.forEach((k, v) -> System.out.println(k + " : " + v));
		map.forEach((k, v) -> {
			if (v % 2 == 0) {
				ar1[0] = ar1[0] + (v / 2);
			} else {
				v = v - 1;
				if (v % 2 == 0) {
					ar1[0] = ar1[0] + (v / 2);
				}
			}
		});

		return ar1[0];

	}

	public static void main(String[] args) {
		SockMerchant s = new SockMerchant();
		System.out.println(s.sockMerchant(7, new int[] { 1, 2, 2, 1, 1, 3, 5, 1, 2 }));
	}
}
