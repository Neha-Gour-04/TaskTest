package com.recursion;

import java.util.ArrayList;
import java.util.List;

public class MaximumCoinPath {

	
	static List<List<Integer>> subSetList = new ArrayList();

	public static void main(String[] args) {

		int[][] grid = { { 1, 0 }, { 1, 0 } }; 
		int maxGold =getMaximumGold( grid);
		System.out.println(maxGold);
		
	}

	
	
	    public static int getMaximumGold(int[][] grid) {
	      return  maxGoldCoins(grid, 0,0);
	    }
	    
	     static int maxGoldCoins(int grid[][], int i,int j){
	         if(i==grid.length)
	             return 0;
	         if(j==grid[0].length)
	             return 0;
	         return Math.max(maxGoldCoins(grid, i+1,j),maxGoldCoins(grid, i,j+1))+grid[i][j];
	     }

}
