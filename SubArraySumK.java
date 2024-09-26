package Hashing2;

import java.util.HashMap;

public class SubArraySumK {
	  public int subarraySum(int[] nums, int k) {
	        if(nums.length==0 || nums==null) return 0;
	        int count=0;
	         HashMap<Integer,Integer> hmap= new  HashMap<Integer,Integer>();
	        hmap.put(0,1);
	        int rsum=0;
	        for(int i=0;i<nums.length;i++){
	            rsum += nums[i];
	            if(hmap.containsKey(rsum-k)) {
	                count+=hmap.get(rsum-k);
	            }
	           
	             if(hmap.containsKey(rsum)) {
	                 hmap.put(rsum,hmap.get(rsum)+1);
	                 
	             }
	            else{
	                hmap.put(rsum,1);
	            }
	            
	            
	        }
	        return count;
	    }

}
