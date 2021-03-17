package com.hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOccurance {
	 public boolean uniqueOccurrences(int[] arr) {
	        HashMap<Integer,Integer> map=new HashMap<>();
	        for (int i:arr){
	            if (!map.containsKey(i)){
	                map.put(i,1);
	            }
	            else
	            {
	                 map.put(i,map.get(i)+1);
	            }
	        }
	        Set<Integer> set=new HashSet<>();
	        for(Map.Entry<Integer,Integer> mapValue:map.entrySet()){
	            if(set.contains(mapValue.getValue())){
	                return false;
	            }
	            else{
	                set.add(mapValue.getValue());
	            }
	        }
	        
	        return true;
	        
	    }
}
