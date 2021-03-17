package com.hashmap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//LeetCode : https://leetcode.com/problems/intersection-of-two-arrays/


public class IntersectionTwoArrays {
	 public int[] intersection(int[] nums1, int[] nums2) {
	        
	        HashMap<Integer,Integer> uniqueElement=new HashMap<>();
	        
	        for (int i=0;i<nums1.length;i++){
	            uniqueElement.put(nums1[i],0);
	        }
	        
	         for (int j=0;j<nums2.length;j++){
	             if(uniqueElement.containsKey(nums2[j])){
	            uniqueElement.put(nums2[j],1);
	        }
	         }
	        List<Integer> count=new ArrayList<>();
	        for(Map.Entry<Integer,Integer> uniqueCount: uniqueElement.entrySet()){
	            if(uniqueCount.getValue()!=0){
	               count.add(uniqueCount.getKey()); 
	            }
	        }
	     
	        int[] countValue = new int[count.size()]; 
	        for (int i = 0; i < count.size(); i++) 
	            countValue[i] =count.get(i); 
	        
	       return countValue;
	        
	    }
}
