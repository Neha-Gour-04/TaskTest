package com.hashmap;

import java.util.HashMap;

public class LoggerRateLimiter {

	    /** Initialize your data structure here. */
	          HashMap<String,Integer> loggerMap;
	    public LoggerRateLimiter() {
	  loggerMap=new HashMap<>();
	        
	    }
	    
	    /** Returns true if the message should be printed in the given timestamp, otherwise returns false.
	        If this method returns false, the message will not be printed.
	        The timestamp is in seconds granularity. */
	    public boolean shouldPrintMessage(int timestamp, String message) {
	    
	        if(loggerMap.containsKey(message)){
	           if((timestamp - loggerMap.get(message))>=10){
	              loggerMap.put(message,timestamp) ;
	               return true;
	               
	           }else{
	                 
	               return false;
	           }
	            
	        } else{
	             loggerMap.put(message,timestamp) ;
	 return true;
	        }
	    
	}

	/**
	 * Your Logger object will be instantiated and called as such:
	 * Logger obj = new Logger();
	 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
	 */
}
