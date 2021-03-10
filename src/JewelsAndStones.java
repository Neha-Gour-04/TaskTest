import java.util.HashMap;
import java.util.Map;


//LeetCode : https://leetcode.com/problems/jewels-and-stones/
public class JewelsAndStones {
	 public int numJewelsInStones(String jewels, String stones) {
		    
	        
	        HashMap<Character,Integer> jewelsMap=new HashMap<>();
	        for (int i=0; i<jewels.length();i++){
	          
	            {
	              jewelsMap.put(jewels.charAt(i),0);  
	            }
	        }
	        
	         for (int j=0; j<stones.length();j++){
	            if (jewelsMap.containsKey(stones.charAt(j))){
	             jewelsMap.put(stones.charAt(j),jewelsMap.get(stones.charAt(j))+1);
	            }
	           
	        }
	        int count=0;
	        
	            for (Map.Entry<Character, Integer>  jewelsMapValue  : jewelsMap.entrySet()){
	          if (jewelsMapValue.getValue()!=0){
	            count=count+  jewelsMapValue.getValue();
	          }
	        }
	        return count;
	        
	    }
}
