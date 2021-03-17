package com.hashmap;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

	    public int singleNumber(int[] nums) {
	        int count=0;
	        HashMap<Integer,Integer> singleNumberMap=new HashMap<>();
	        for(int i:nums ){
	            singleNumberMap.put(i,singleNumberMap.getOrDefault(i,0)+1);  
	        }
	        
	        for(Map.Entry<Integer,Integer> mapValue:singleNumberMap.entrySet() ){
	           if(mapValue.getValue()==1){
	              return mapValue.getKey();
	           } 
	        }
	            return 0;
	    }
	
}
