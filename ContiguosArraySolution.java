// Time Complexity : O(N)
// Space Complexity : O(N) (Extra space for hashmap) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Calculate cumulative sum and store in in hashmap along with index and then calculate max length of sub array
import java.util.*;
class ContiguosArraySolution {
    public int findMaxLength(int[] nums) {
        if (nums ==null || nums.length == 0) {
            return 0;
        }
        for(int i=0;i<nums.length; i++) {
            if(nums[i]==0)
                nums[i] = -1;
        }
        
        int cumulative_sum=0, max=0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i=0; i<nums.length; i++) {
            cumulative_sum = cumulative_sum + nums[i];
            if(map.containsKey(cumulative_sum)) {
                int last = map.get(cumulative_sum);
                max = Math.max(max, i - last);
            } else {
                map.put(cumulative_sum, i);
            }
        }
        return max;
    }
}