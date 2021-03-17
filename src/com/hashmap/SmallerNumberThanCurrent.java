package com.hashmap;
import java.util.HashMap;

public class SmallerNumberThanCurrent {

	    public int[] smallerNumbersThanCurrent(int[] nums) {
	        
	        int[] test=new int[nums.length];
	        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
	        for(int i=0;i<nums.length;i++){
	           map.put(nums[i], 0); 
	            for(int j=0;j<nums.length;j++){
	                if( i != j && nums[i] >nums[j]){
	                     map.put(nums[i], map.get(nums[i])+1); 
	                       
	                }
	                
	                
	            }
	           test[i]=map.get(nums[i]);
	            
	        }
	        
	        return test;
	        
	        
	    }
	

}
