package com.vj.searching_and_sorting.searching.problems;

import java.util.Scanner;

//LeetCodeProblem: 540: https://leetcode.com/problems/single-element-in-a-sorted-array/

class ArrayNeedNotToBeSorted {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
//		int n = scn.nextInt();

		int[] arr = { 4, 4, 1, 1, 9, 9, 11, 11, 20, 7, 7, 3, 3, 5, 5 };
//		int[] arr = { 88, 4, 4, 1, 1, 9, 9, 11, 11, 7, 7, 3, 3, 5, 5 }; //EdgeCondition: arr[0]
//		int[] arr = { 4, 4, 1, 1, 9, 9, 11, 11, 7, 7, 3, 3, 5, 5 ,-1}; //EdgeCondition: arr[N-1]
		int n = arr.length;

//		for (int i = 0; i < n; i++) {
//			arr[i] = scn.nextInt();
//		}

		System.out.println(singleNonDuplicate(arr));
	}

	public static int singleNonDuplicate(int[] nums) {
		if (nums.length == 1) {
			return nums[0];
		}
		if (nums[0] != nums[1]) {
			return nums[0];
		}
		if (nums[nums.length - 1] != nums[nums.length - 2]) {
			return nums[nums.length - 1];
		}
		int left = 2;
		int right = nums.length - 3;

		while (left < right) {
			int middle = (left + right) / 2;

			if (nums[middle - 1] != nums[middle] && nums[middle] != nums[middle + 1]) {
				return nums[middle];
			}

			if (nums[middle] == nums[middle - 1]) {
				middle--; // indicates middle is second occurance
			}
			if (middle % 2 == 0) {
				left = middle + 2;
			} else {
				right = middle - 1;
			}
		}

		return nums[left]; // we can also nums[right] // at the end lef will be equal to right
//		return nums[right]; 

	}

}