package com.vj.searching_and_sorting.sorting.impl;

import java.util.*;

/** References **/
//1. https://takeuforward.org/data-structure/merge-sort-algorithm/

class Solution {

	private static void merge(int[] arr, int low, int mid, int high) {
		ArrayList<Integer> temp = new ArrayList<>(); // temporary array of size (high-low + 1)
		int left = low; // starting index of left half of arr
		int right = mid + 1; // starting index of right half of arr

		// storing elements in the temporary array in a sorted manner//

		while (left <= mid && right <= high) {
			if (arr[left] <= arr[right]) {
				temp.add(arr[left]);
				left++;
			} else {
				temp.add(arr[right]);
				right++;
			}
		}

		// if elements on the left half are still left //

		while (left <= mid) {
			temp.add(arr[left]);
			left++;
		}

		// if elements on the right half are still left //
		while (right <= high) {
			temp.add(arr[right]);
			right++;
		}

		// transfering all elements from temporary to arr //
		// hence merge sort is not-inplace: requires: auxillary array of size n

//		int z = 0;
		for (int i = low; i <= high; i++) {
			arr[i] = temp.get(i - low);
//			arr[i] = temp.get(z++);
		}
	}

	public static void mergeSort(int[] arr, int low, int high) {
		if (low >= high)
			return;
		int mid = (low + high) / 2;
		mergeSort(arr, low, mid); // left half
		mergeSort(arr, mid + 1, high); // right half
		merge(arr, low, mid, high); // merging sorted halves
	}
}

public class MergeSort {
	public static void main(String args[]) {
//		Scanner sc = new Scanner(System.in);

		int[] arr = { 4, 6, 2, 5, 7, 9, 1, 9, 0, 8, 6, 3 };
		int n = arr.length;
		System.out.println("Before sorting array: ");
		System.out.print(Arrays.toString(arr));
		System.out.println();

		Solution.mergeSort(arr, 0, n - 1);
		System.out.println("After sorting array: ");
		System.out.print(Arrays.toString(arr));

		System.out.println();
	}
}
