package com.vj.searching_and_sorting.sorting.problems;

//Given N elements at every step remove an array element. Cost to remove element: Sum of array elements Present. Find min cost to remove all elements.

import java.util.*;

class Solution {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println(orderOfRemoval(arr));
	}

	public static int orderOfRemoval(int[] arr) {
		int n = arr.length;

		Integer[] boxedArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);
		// Step 2: Sort in descending order
		Arrays.sort(boxedArr, Collections.reverseOrder());
		// Step 3 (Optional): Convert back to int[]
		arr = Arrays.stream(boxedArr).mapToInt(Integer::intValue).toArray();

		System.out.println(Arrays.toString(arr));

		int ans = 0;

		for (int i = 0; i < n; i++) {
			int temp = arr[i] * (i + 1);
			ans = ans + temp;
		}

		return ans;
	}
}