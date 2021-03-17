package com.hashmap;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;

public class HighFive {

	    public int[][] highFive(int[][] items) {
	        
	        TreeMap<Integer,Queue<Integer>> mapList=new TreeMap<>();
	        
	        for (int[] item:items)
	        {
	           int studentId=item[0];
	             int marks=item[1];
	            
	            if(!mapList.containsKey(studentId))
	                mapList.put(studentId,new PriorityQueue<>());
	           mapList.get(studentId).add(marks);
	         if (mapList.get(studentId).size() > 5)
	                mapList.get(studentId).poll();
	    }
	        
	        List<int[]> finalResult=new ArrayList<>();
	        for(int id: mapList.keySet()){
	            int sum=0;
	            for (int i=0;i<5;i++){
	                sum = sum+ mapList.get(id).poll();
	                  }
	                finalResult.add(new int[]{id,(sum/5)});
	          
	           
	        }
	        
	    int[][] solution=new int[finalResult.size()][];
	             return finalResult.toArray(solution);
	        
	        
	    }

}
