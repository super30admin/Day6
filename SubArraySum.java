// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
import java.util.HashMap;

public class SubArraySum {
    public int subarraySum(int[] nums, int k) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int count=0;
        int currSum=0;
        for(int i=0;i<nums.length;i++){
            currSum+=nums[i];
            if(map.containsKey(currSum-k)){
                count+=map.get(currSum-k);
            }
            
            if(!map.containsKey(currSum)){       
                map.put(currSum,1);
            }else{
                map.put(currSum,map.get(currSum)+1);
            }  
        }
        
        return count;
    }
}
