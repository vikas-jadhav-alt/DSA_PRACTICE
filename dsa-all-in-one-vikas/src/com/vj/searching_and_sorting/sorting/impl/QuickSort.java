package com.vj.searching_and_sorting.sorting.impl;

import java.util.*;

//Quick Sort: https://takeuforward.org/data-structure/quick-sort-algorithm/

class SolutionQS {

	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	static int partition(int[] arr, int start, int end) {

		int pivot = arr[end];
		int pindex = start;
		
		for (int i = start; i <= end - 1; i++) {
			if (arr[i] <= pivot) {
				swap(arr, i, pindex);
				pindex++;
			}
		}
		swap(arr, end, pindex);
		
		return pindex;
	}

	static void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			int pIndex = partition(arr, low, high);
			quickSort(arr, low, pIndex - 1);
			quickSort(arr, pIndex + 1, high);
		}
	}

	public static int[] quickSort(int[] arr) {
		// Write your code here.
		quickSort(arr, 0, arr.length - 1);
		return arr;
	}
}

public class QuickSort {
	public static void main(String args[]) {
		int[] arr = { 4, 6, 2, 5, 7, 9, 1, 9, 0, 6, 8, 3 };
		int n = arr.length;
		System.out.println("Before Using insertion Sort: ");
		System.out.print(Arrays.toString(arr));
		System.out.println();
		arr = SolutionRQS.quickSort(arr);
		System.out.println("After insertion sort: ");
		System.out.print(Arrays.toString(arr));
		System.out.println();
	}

}
