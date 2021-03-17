package com.hashmap;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class UncommonWordsFromTwoSentences {
	  public String[] uncommonFromSentences(String A, String B) {
	        HashMap<String,Integer> map1=new HashMap<>();
	        String[] firstSentence=A.split(" ");
	         String[] secondSentence=B.split(" ");
	        for(String a: firstSentence){
	            map1.put(a, map1.getOrDefault(a,0)+1);  
	        }
	        
	        for(String b: secondSentence){
	             map1.put(b, map1.getOrDefault(b,0)+1);  
	        }
	        
	       List<String> ans = new LinkedList();
	        for (String word: map1.keySet())
	            if (map1.get(word) == 1)
	                ans.add(word);
	         return ans.toArray(new String[ans.size()]);
	    }
}
