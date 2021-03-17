package com.recursion;
import java.util.ArrayList;
import java.util.List;

public class IsSubSetSum {

	static List<List<Integer>> subSetList = new ArrayList();

	public static void main(String[] args) {

		List<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(7);
		Boolean isSubSetSum = subSetValue(arr, 0,4);
		System.out.println(isSubSetSum);
	}


	public static Boolean subSetValue(List<Integer> arr, int index,Integer sum) {
		if (arr.size() == index) {
			if(sum==0)
		return true;

			return false;
		}

		Boolean notTaken=subSetValue(arr, index + 1, sum);
		
		Boolean taken=subSetValue(arr, index + 1,sum-arr.get(index));
		//subset.remove(subset.size() - 1);
		
		return notTaken || taken;

	}

}
