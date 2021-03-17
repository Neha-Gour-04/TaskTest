package com.recursion;
import java.util.ArrayList;
import java.util.List;

public class AllPossibleSubSetSum {

	static List<List<Integer>> allPossibleSubSet = new ArrayList<>();

	public static void main(String args[]) {

		List<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(5);
		arr.add(3);
		arr.add(3);

		Integer sum = 1;
		Integer count=allPossibleSubsets(arr, 0,sum);
		

		System.out.println(count);

	}

	public static int allPossibleSubsets(List<Integer> arr, Integer index, Integer sum) {

		if (arr.size() == index) {
			if(sum == 0)
				return 1;
			return 0;

		}

		int notTaken=allPossibleSubsets(arr, index + 1, sum);
		int taken=allPossibleSubsets(arr, index + 1, sum-arr.get(index));
		
		return notTaken + taken;
	}

}
