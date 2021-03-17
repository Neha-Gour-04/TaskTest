package com.hashmap;
import java.util.HashMap;
import java.util.Map;


//LeetCode : https://leetcode.com/problems/valid-anagram/
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        
        for (int i=0;i<s.length();i++){
            map.put(s.charAt(i),(map.getOrDefault(s.charAt(i),0))+1);
        }
        
          for (int j=0;j<t.length();j++){
              if(map.containsKey(t.charAt(j))){
            map.put(t.charAt(j),(map.get(t.charAt(j)))-1);
        }else{
              map.put(t.charAt(j),1);    
              }
        }
        for(Map.Entry<Character,Integer> value:map.entrySet()){
            if(value.getValue()!=0){
                return false;
            }
            
        }
         return true;
        
    }
}
