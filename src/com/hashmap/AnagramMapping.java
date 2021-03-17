package com.hashmap;
import java.util.HashMap;
import java.util.Map;

public class AnagramMapping {
	    public int[] anagramMappings(int[] A, int[] B) {
	        Map<Integer,Integer> mapA=new HashMap<>();
	         Map<Integer,Integer> mapB=new HashMap<>();
	        
	       
	        for(int i=0;i<B.length; i++){
	            mapB.put(B[i],i);

	        }
	        
	         for(int i=0;i<A.length; i++){
	             if(mapB.containsKey( A[i]))
	            A[i]=mapB.get( A[i]);
	            
	        }
	        
	        return A;
	    }

}
