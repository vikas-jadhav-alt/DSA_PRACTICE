package com.vj.searching_and_sorting.searching;

public class LinearBinaryInterpolationSearch {

	public static int linearSearch(int[] array, int size, int dataToFound) {

		int index = -1;
		int comparisons = 0;

		for (int i = 0; i <= size - 1; i++) {
			comparisons++;
			if (array[i] == dataToFound) {
				index = i;
				break;
			}
		}

		System.out.println("Linear {Iterations} = " + comparisons);
		if (index == -1)
			System.out.println("not found");
		else {
			System.out.println("Value index = " + index);
		}
		return index;

	}

	public static int binarySearch(int[] array, int size, int dataToFound) {
		int mid = 0;
		int lowerBound = 0;
		int upperBound = size - 1;
		int index = -1;
		int comparisons = 0;

		while (lowerBound <= upperBound) {
			mid = lowerBound + (upperBound - lowerBound) / 2;
			comparisons++;
			if (array[mid] == dataToFound) {
				index = mid;
				break;
			} else {
				if (dataToFound > array[mid])
					lowerBound = mid + 1;
				else {
					upperBound = mid - 1;
				}

			}
		}

		System.out.println("Binary {Middle Jumps} = " + comparisons);
		if (index == -1)
			System.out.println("not found");
		else {
			System.out.println("Value index = " + index);
		}
		return index;

	}

	public static int interpolationSearch(int[] array, int size, int dataToFound) {

		int mid = 0;
		int lowerBound = 0;
		int upperBound = size - 1;
		int index = -1;
		int comparisons = 0;

		while (lowerBound <= upperBound) {
			mid = lowerBound + ((upperBound - lowerBound) / (array[upperBound] - array[lowerBound]))
					* (dataToFound - array[lowerBound]);
			comparisons++;
			if (array[mid] == dataToFound) {
				index = mid;
				break;
			} else {
				if (dataToFound > array[mid])
					lowerBound = mid + 1;
				else {
					upperBound = mid - 1;
				}

			}
		}

		System.out.println("Interpolation {Middle Jumps} = " + comparisons);
		if (index == -1)
			System.out.println("not found");
		else {
			System.out.println("Value index = " + index);
		}
		return index;

	}

	public static void main(String[] args) {

		int[] array = { -5, 0, 4, 7, 9, 22, 24, 27, 34, 55, 100, 1000000 };
		int length = array.length;
		int target = 34;

		linearSearch(array, length, target);
		binarySearch(array, length, target);
		interpolationSearch(array, length, target);

	}

}
