package com.hashmap;

public class IslandPerimeter {
	class Solution {
	    public int islandPerimeter(int[][] grid) {
	        int perimeter=0;
	         if (grid == null || grid.length == 0) {
	        return 0;
	    }
	        if (grid == null || grid.length == 0 || grid[0].length == 0) return 0;
	        for(int i=0; i<grid.length;i++)
	        {
	            
	            for(int j=0; j<grid[0].length;j++)
	            {
	              if(grid[i][j]==1)  {
	                   perimeter += 4;
	                  if(i-1>=0 ){
	                     if(grid[i-1][j]==1) {
	                      perimeter--;
	                  }}
	                  
	                  if(j-1>=0){
	                   if(grid[i][j-1]==1){
	                      perimeter--;
	                  }}
	                  
	                   if(i+1< grid.length){
	                   if(grid[i+1][j]==1){
	                      perimeter--;
	                  }}
	                    if(j+1 <grid[0].length){
	                       if(grid[i][j+1]==1){
	                      perimeter--;
	                  }}
	              }
	                
	            }
	            
	        }
	        
	        
	     return perimeter   ;
	    }
	}
}
