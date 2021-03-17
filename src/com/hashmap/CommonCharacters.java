package com.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CommonCharacters {
	  public List<String> commonChars(String[] A) {
		     
	       HashMap<Character,Integer> map=new HashMap<>();
	      for(int i=0; i<A[0].length();i++){
	            map.put(A[0].charAt(i),map.getOrDefault(A[0].charAt(i),0)+1);
	        }
	        
	        for(int i=1; i<A.length;i++){
	            HashMap<Character, Integer> temp = new HashMap<>(); 
	            for(int j = 0; j < A[i].length(); j++){
	                 char curr = A[i].charAt(j); 
	                if(map.containsKey(curr)) 
	                    temp.put(curr, Math.min(map.get(curr), temp.getOrDefault(curr, 0)+1));    
	            }
	            
	            map=temp;
	        }
	        List<String> ans=new ArrayList<>();
	      for(char c : map.keySet()){
	        for(int i = 0; i < map.get(c); i++) ans.add(c + ""); 
	    }
	    
	    return ans;
	        
	        
	        
	}
}
