package com.hashmap;

import java.util.HashMap;

public class NRepeatedElementInSize2N {

	    public int repeatedNTimes(int[] A) {
	        HashMap<Integer,Integer> map=new HashMap<>();
	        for(int i:A){
	            if(!map.containsKey(i)){
	                map.put(i,1);
	            }
	            else{
	                 map.put(i,map.get(i)+1);
	                if(map.get(i)==A.length/2){
	                    return i;
	                }
	            }
	        }
	        
	     
	      return 0;  
	    }
	}

