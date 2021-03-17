package com.hashmap;

import java.util.HashMap;
import java.util.Map;

public class LargestUniqueNumber {

	    public int largestUniqueNumber(int[] A) {
	        HashMap<Integer,Integer> map=new HashMap<>();
	        
	        for (int i: A){
	            map.put(i, map.getOrDefault(i, 0) + 1);
	         
	        }
	        int result=-1;
	        for(Map.Entry<Integer,Integer> entry:map.entrySet() ){
	            if(entry.getValue()==1){
	               result=Math.max(result,entry.getKey());
	            }
	        
	        
	       
	    }
	         return result;
	    }

}
