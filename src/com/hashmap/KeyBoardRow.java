package com.hashmap;

import java.util.ArrayList;
import java.util.List;

public class KeyBoardRow {

	    public String[] findWords(String[] words) {
	    
	     List<String> finalValue=new ArrayList<>();
	        for(String word:words){
	              if(word.matches("[QqWwEeRrTtYyUuIiOoPp]+|[AaSsDdFfGgHhJjKkLl]+|[ZzXxCcVvBbNnMm]+"))
	                finalValue.add(word);
	    
	    }
	        
	         String[] result = new String[finalValue.size()];
	        for(int i = 0; i < finalValue.size(); i++){
	            result[i] = finalValue.get(i);
	        }
	        return result;

	        
	        }
	        

	   
}
