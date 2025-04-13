package com.vj.searching_and_sorting.sorting.impl;

import java.util.*;

public class BubbleInsertionSelectionSort {

	public static void bubbleSort(int arr[], int n) {
		int swaps = 0;

		for (int i = 0; i < n - 1; i++) {
			boolean sorted = true;
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swaps++;
					sorted = false;
				}

			}
			if (sorted)
				break;
		}
		System.out.println("After Bubble sort: ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("Bubble Comparison: " + swaps);
	}

	static void insertion_sort(int[] arr, int n) {
		int swaps = 0;
		for (int i = 0; i <= n - 1; i++) {
			int j = i - 1;

			while (j >= 0 && arr[j] > arr[j + 1]) {
				int temp = arr[j + 1];
				arr[j + 1] = arr[j];
				arr[j] = temp;
				j--;
				swaps++;
			}
		}

		System.out.println("After insertion sort: ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("Insertion Comparison: " + swaps);
	}

	static void selection_sort(int arr[], int n) {

		int swaps = 0;
		for (int i = 0; i < n - 1; i++) {
			int mini = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[mini]) {
					mini = j;
				}
			}
			// swap
			int temp = arr[mini];
			arr[mini] = arr[i];
			arr[i] = temp;
			swaps++;
		}

		System.out.println("After selection sort:");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("Selection Comparison: " + swaps);
	}

	public static void main(String args[]) {

		int[] arr = getTestArray();
		int n = arr.length;
		System.out.println("Before Using Sort: ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("======================");
		insertion_sort(getTestArray(), n);

		System.out.println("======================");
		bubbleSort(getTestArray(), n);

		System.out.println("======================");
		selection_sort(getTestArray(), n);
	}

	public static int[] getTestArray() {
// 		int arr[] = {13, 46, 24, 52, 20, 9, 1, 5, 8,0, 8};
// 		 int arr[] = {1,2,3,4,5};
// 		//  int arr[] = {5,4,3,2,1};

		int arr[] = { 1, 2, 3, 4, 5, 18, 12, 9, 4, 2, 3 };

		return arr;
	}

}

/** When Array Is Already Sorted **/
// Before Using Sort:
// 1 2 3 4 5
// ======================
// After insertion sort:
// 1 2 3 4 5
// Insertion Comparison: 0
// ======================
// After Bubble sort:
// 1 2 3 4 5
// Bubble Comparison: 0
// ======================
// After selection sort:
// 1 2 3 4 5
// Selection Comparison: 4

/** When Array Is Unsorted **/
// Before Using Sort:
// 13 46 24 52 20 9 1 5 8 0 8
// ======================
// After insertion sort:
// 0 1 5 8 8 9 13 20 24 46 52
// Insertion Comparison: 42
// ======================
// After Bubble sort:
// 0 1 5 8 8 9 13 20 24 46 52
// Bubble Comparison: 42
// ======================
// After selection sort:
// 0 1 5 8 8 9 13 20 24 46 52
// Selection Comparison: 10

/** When Array is Partially Sorted **/
// Before Using Sort:
// 1 2 3 4 5 18 12 9 4 2 3
// ======================
// After insertion sort:
// 1 2 2 3 3 4 4 5 9 12 18
// Insertion Comparison: 20
// ======================
// After Bubble sort:
// 1 2 2 3 3 4 4 5 9 12 18
// Bubble Comparison: 20
// ======================
// After selection sort:
// 1 2 2 3 3 4 4 5 9 12 18
// Selection Comparison: 10