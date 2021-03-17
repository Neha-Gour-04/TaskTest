package com.hashmap;
import java.util.HashMap;

public class NumJewelsInStones {
	
	    public int numJewelsInStones(String jewels, String stones) {
	    
	        HashMap<Character,Integer> jewelsMap=new HashMap<>();
	        for (int i=0; i<jewels.length();i++){
	          
	            {
	              jewelsMap.put(jewels.charAt(i),0);  
	            }
	        }
	          int count=0;
	         for (int j=0; j<stones.length();j++){
	            if (jewelsMap.containsKey(stones.charAt(j))){
	            // jewelsMap.put(stones.charAt(j),jewelsMap.get(stones.charAt(j))+1);
	                 count=count+  jewelsMap.get(stones.charAt(j))+1;
	          
	            }
	           
	        }
	    
	        return count;
	        
	    }

}
