package com.hashmap;
import java.util.HashMap;
import java.util.Map;

//Leetcode : https://leetcode.com/problems/number-of-good-pairs/
public class GoodPairs {
	 public int numIdenticalPairs(int[] nums) {
	        int count=0;
	        for (int i=0;i<nums.length;i++)
	        {
	            for (int j=i+1;j<nums.length;j++){
	                if(nums[i]==nums[j]){
	                 count++;   
	                }
	            }
	        }
	        
	         return count;
	        
	    }
}

//precise solution

class Solution {
    public int numIdenticalPairs(int[] nums) {
          int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
            res += map.get(n) - 1;  // addtional pair can be formed btw n and all previous v == n;
        }
        return res;
        
    }
   
}



