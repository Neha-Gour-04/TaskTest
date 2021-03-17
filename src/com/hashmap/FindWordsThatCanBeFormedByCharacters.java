package com.hashmap;

import java.util.HashMap;

public class FindWordsThatCanBeFormedByCharacters {
	  public int countCharacters(String[] words, String chars) {
	        HashMap<Character,Integer> characterAll=new HashMap<>();
	        
	        for(int i=0;i<chars.length();i++){
	            if(!characterAll.containsKey(chars.charAt(i)))
	                characterAll.put(chars.charAt(i),1);
	            else
	                characterAll.put(chars.charAt(i),characterAll.get(chars.charAt(i))+1);
	        }
	        int count=0;
	       
	        for(String singleWord: words){
	             int singleWordCountValue=0;
	             HashMap<Character,Integer> characterAllPresent=new HashMap<>();
	             characterAllPresent.putAll(characterAll); 
	           
	              for(int i=0;i<singleWord.length();i++){
	               
	           if( characterAllPresent.containsKey(singleWord.charAt(i))){
	              if( characterAllPresent.get(singleWord.charAt(i))>=1){
	               singleWordCountValue++;
	                            characterAllPresent.put(singleWord.charAt(i),characterAllPresent.get(singleWord.charAt(i))-1);
	                 }
	               }
	           
	        }
	             if (singleWordCountValue==singleWord.length()){
	                count=count+singleWordCountValue;
	          
	           
	        }
	       
	    }
	         return count;
	}
}
