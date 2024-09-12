import java.util.*;

// Time Complexity : O(N) - traversing the array once
// Space Complexity : O(N) - use of a HashMap

// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class SubArraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        if(nums == null || nums.length == 0) return -1;
        
        int retVal = 0;
        int result = 0;
        int findResult = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(result, 1);
        
        for(int i=0; i<nums.length; i++){
            result += nums[i];
            findResult = result - k;
            
            if(map.containsKey(findResult)){
                retVal += map.get(findResult);
            }            
            if(!map.containsKey(result)){
                map.put(result, 1);
            }
            else{
                map.put(result, map.get(result) + 1);
            }
        }
        
        return retVal;
    }
}