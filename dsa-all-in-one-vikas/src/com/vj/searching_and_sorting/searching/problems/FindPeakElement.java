package com.vj.searching_and_sorting.searching.problems;


//LeetCode: 162: https://leetcode.com/problems/find-peak-element/

//Solution: Subhesh: Leetcode 162 - Peak Element
//https://www.youtube.com/watch?v=0HqoT8GGbeU


class SolutionPeakEle {
	public int findPeakElement(int[] nums) {
		if (nums.length == 1) {
			return 0;
		}

		if (nums[0] > nums[1]) {//Peak can be at first index
			return 0;
		}
		if (nums[nums.length - 1] > nums[nums.length - 2]) { //Peak can be at lastindex
			return nums.length - 1;
		}

		int left = 1;
		int right = nums.length - 2;

		while (left <= right) {
			int middle = (left + right) / 2;
			if (nums[middle] > nums[middle - 1] && nums[middle] > nums[middle + 1]) {
				return middle;
			}

			if (nums[middle] < nums[middle - 1]) {
				right = middle - 1; // skip right side
			} else {
				left = middle + 1; //skip left side
			}
		}
		return -1;
	}

}