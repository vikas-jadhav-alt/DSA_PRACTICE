package com.vj.searching_and_sorting.searching.problems;

//LeetCode: 34: 
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/submissions/1605903289/

//Solutions
//1. https://medium.com/@Neelesh-Janga/q-34-leetcode-find-first-and-last-position-of-element-in-sorted-array-88986410c0b4

class Solution {
	public int[] searchRange(int[] nums, int target) {
		int[] arr = { -1, -1 };

		if (nums.length == 0)
			return arr;

		arr[0] = findIndexOfTarget(nums, target, true);
		if (arr[0] != -1)
			arr[1] = findIndexOfTarget(nums, target, false);

		return arr;
	}

	public int findIndexOfTarget(int[] nums, int target, boolean isLeftIndex) {
		int index = -1;
		int start = 0, end = nums.length - 1;

		while (start <= end) {
			int mid = (end - start) / 2 + start;

			if (nums[mid] < target)
				start = mid + 1;
			else if (nums[mid] > target)
				end = mid - 1;
			else {
				index = mid;
				if (isLeftIndex == true)
					end = mid - 1;
				else
					start = mid + 1;
			}
		}

		return index;
	}
}
