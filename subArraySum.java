// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
import java.util.*;
public class subArraySum {  
        public int subarraySum(int[] nums, int k) {
            HashMap<Integer, Integer> hm = new HashMap<>();
                int total = 0, count = 0;
                hm.put(0,1);
                for(int i=0;i<nums.length;i++){
                        count=count+nums[i];
                    
                    if(hm.containsKey(count - k)){ 
                        total = total+ hm.get(count-k);
                        
                    }
                    if(hm.containsKey(count)){
                        hm.put(count, hm.get(count)+1);
                    }
                    else{
                        hm.put(count, 1);
                    }
                }
                return total;
        }
    
 }



