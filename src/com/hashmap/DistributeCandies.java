package com.hashmap;

import java.util.HashSet;

public class DistributeCandies {
    public int distributeCandies(int[] candyType) {
    Integer noOfCandiesAliceCanEat=candyType.length/2;
   
    HashSet<Integer> differentCandies=new HashSet<>();
    for (int i:candyType){
        differentCandies.add(i);
    }
    
    if(differentCandies.size()==noOfCandiesAliceCanEat)
        return noOfCandiesAliceCanEat;
    else if(differentCandies.size()>noOfCandiesAliceCanEat)
        return noOfCandiesAliceCanEat;
    else
        return differentCandies.size();
}
}