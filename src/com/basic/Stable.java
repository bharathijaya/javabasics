package com.basic;

public class Stable {
	public static boolean findStable(int input) {

		int[] freqs = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		for (int i = input; i > 0; i /= 10) {
			freqs[i % 10]++; // increment the appropriate digits frequency
		}
		int i = 0;
	//	List<Integer> result = new LinkedList<Integer>();
		for (int item : freqs) {
			if (item != 0) {
				result.add(item);
			}
		}
		boolean equals = true;
		for (int j = 1; j < result.size(); j++) {
			if (result.get(0) != result.get(j)) {
				equals = false;
			}
		}
		System.out.println("result == " + equals);
		return equals;
	}

}
