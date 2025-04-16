package com.vj.searching_and_sorting.sorting.problems;


//Given An Array1 {-1, -4, 3, 5, -15, 4 } and Array2 {0, 2,2,,3,3,8}.
//Calcuate no of good integers...
// A Good Integer is what {no of elements < ele == ele itself}

//Ans: Array1: 3
//Ans: Array2: 3




import java.util.*;

class GoodInteger_Distinct {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println(GoodIntegers(arr));
	}

	public static int GoodIntegers(int[] arr) {
		int n = arr.length;
		Arrays.sort(arr);
		int ans = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == i) {
				ans++;
			}
		}

		return ans;
	}

}

class GoodInteger_Duplicate {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println(GoodIntegers(arr));
	}

	public static int GoodIntegers(int[] arr) {
		int n = arr.length;
		Arrays.sort(arr);
		int ans = 0;
		int lesscount = 0;

		if (arr[0] == 0) {
			ans++;
		}
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[i - 1]) {
				lesscount = i;
			}

			if (arr[i] == lesscount) {
				ans++;
			}
		}

		return ans;
	}

}