package com.hashmap;

import java.util.ArrayList;
import java.util.List;

public class OccuranceAfterBiagram {
	 public String[] findOcurrences(String text, String first, String second) {
	        
	        
	       String[] textArray =text.split(" ");
	            List<String> ans = new ArrayList<>();
	           
	           for (int i = 2; i < textArray.length; ++i) {
	            if (first.equals(textArray[i - 2]) && second.equals(textArray[i - 1]))
	                ans.add(textArray[i]);
	        }
	   return ans.toArray(new String[0]);
	    }
}
