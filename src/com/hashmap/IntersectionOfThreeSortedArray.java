package com.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IntersectionOfThreeSortedArray {

	    public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
	         HashMap<Integer,Integer> mapArray1=new HashMap<>();
	       
	        int k=0;
	        List<Integer> newArray=new ArrayList<>();
	        for(int i=0;i<arr1.length;i++){
	            mapArray1.put(arr1[i],1);
	        }
	        
	        for(int i=0;i<arr2.length;i++){
	            if(mapArray1.containsKey(arr2[i]))
	            mapArray1.put(arr2[i],mapArray1.get(arr2[i])+1);
	            else
	                mapArray1.put(arr2[i],1);
	        }
	        
	        for(int i=0;i<arr3.length;i++){
	            if(mapArray1.containsKey(arr3[i]))
	            mapArray1.put(arr3[i],mapArray1.get(arr3[i])+1);
	             else
	                mapArray1.put(arr3[i],1);
	            
	            if(mapArray1.get(arr3[i])>=3){
	                newArray.add(arr3[i]);
	                    }
	        }
	      return newArray;      
	       

	}
}
