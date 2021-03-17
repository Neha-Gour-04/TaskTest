package com.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubDomainVisit {
	 public List<String> subdomainVisits(String[] cpdomains) {
	        Map<String, Integer> counts = new HashMap();
	        List<String> finalAnswer=new ArrayList<>();
	        for(String cpdomainsValue: cpdomains){
	            finalAnswer.add(cpdomainsValue);
	            
	           String[] intial=cpdomainsValue.split("\\s+");
	            String[] second=intial[1].split("\\.");
	            int count=Integer.valueOf(intial[0]);
	             String cur = "";
	            for(int i=second.length-1;i>=0;i--){
	                cur=second[i]+ (i< second.length-1?".":"")+ cur;
	                counts.put(cur, counts.getOrDefault(cur, 0) + count);
	            }
	        }
	        
	         List<String> ans = new ArrayList();
	        for (String dom: counts.keySet())
	            ans.add("" + counts.get(dom) + " " + dom);
	        return ans;
	    }
}
