package com.vj.searching_and_sorting.searching.problems;

//#Tags

//Questions: Floor and Ceil in Sorted Array 
// Floor: The floor of x is the largest element in the array which is smaller than or equal to x( i.e. largest element in the array <= x).
//Ceil: The ceiling of x is the smallest element in the array greater than or equal to x( i.e. smallest element in the array >= x).



//Solution: 
//	1. https://takeuforward.org/arrays/floor-and-ceil-in-sorted-array/

import java.util.*;

class SolutionFloorCeil {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
//		int n = scn.nextInt();
//
//		int[] arr = new int[n];
//
//		for (int i = 0; i < n; i++) {
//			arr[i] = scn.nextInt();
//		}

		int[] arr = { -4, 3, 4, 7, 10, 11, 12, 15, 19 };

		System.out.println("Array: " + Arrays.toString(arr));
		System.out.println("Enter Target No");
		int k = scn.nextInt();

		int floor = FloorIndex(arr, k);
		if (floor == -1)
			System.out.println("Floor Not Found");
		else
			System.out.println("Floor: " + arr[floor]);

		System.out.println();

		int ceil = CeilIndex(arr, k);
		if (ceil == -1)
			System.out.println("Ceil Not Found");
		else
			System.out.println("Ceil: " + arr[ceil]);

		System.out.println();
	}

	public static int FloorIndex(int[] arr, int k) {
		int lo = 0;
		int hi = arr.length - 1;
//        int ans = Integer.MIN_VALUE;
		int ansIndex = -1;
		while (lo <= hi) {
			int m = (lo + hi) / 2;

			if (arr[m] == k) {
				return m;
			} else if (arr[m] < k) {
				ansIndex = m;
				lo = m + 1; // look for smaller index on right if low only
			} else {
				hi = m - 1;
			}
		}

		return ansIndex;
	}

	public static int CeilIndex(int[] arr, int k) {
		int lo = 0;
		int hi = arr.length - 1;
		int ansIndex = -1;
		while (lo <= hi) {
			int m = (lo + hi) / 2;

			if (arr[m] == k) {
				return m;
			} else if (arr[m] > k) {
				ansIndex = m;
				hi = m - 1; // look for greater index on left of high only
			} else {
				lo = m + 1;
			}
		}

		return ansIndex;
	}
}