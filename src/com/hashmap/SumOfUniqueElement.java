package com.hashmap;

import java.util.HashMap;
import java.util.Map.Entry;

public class SumOfUniqueElement {

	    public int sumOfUnique(int[] nums) {
	        HashMap<Integer,Integer> mapUnique=new HashMap<>();
	        

	        for(int i: nums){
	            if(!mapUnique.containsKey(i)){
	                mapUnique.put(i,1);
	            }
	            else{
	                 mapUnique.put(i,mapUnique.get(i)+1);
	            }
	        }
	        int count=0;
	        for (Entry<Integer, Integer> map: mapUnique.entrySet()){
	              System.out.println(map.getKey());
	            
	           if(map.getValue()==1){
	              count+= map.getKey();
	           }
	        }
	       return count; 
	        
	    
	}
}
