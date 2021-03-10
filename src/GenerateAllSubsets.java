import java.util.ArrayList;
import java.util.List;

//LeetCode submission : https://leetcode.com/problems/subsets/submissions/

public class GenerateAllSubsets {
	   
    final List<List<Integer>> allPossibleSubSets=new ArrayList<>();
  
  public List<List<Integer>> subsets(int[] nums) {
      
      List<Integer> subSetValue=new ArrayList<>();
     generateSubSets(nums,0,subSetValue);
      return allPossibleSubSets;
  }
  void generateSubSets(int[] nums,int index,List<Integer> subSet){
      
    if(nums.length==index)
    {
          System.out.println(subSet);
        allPossibleSubSets.add(new ArrayList(subSet));
        return;
    }
      generateSubSets(nums,index+1,subSet);
      subSet.add(nums[index]);
      generateSubSets(nums,index+1,subSet);
      subSet.remove(subSet.size()-1);
      
  }
}
