import java.util.*;

// Time Complexity : O(N) - traversing the array once
// Space Complexity : O(N) - use of a HashMap

// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class ContiguousArray {
    public int findMaxLength(int[] nums) {
        if(nums == null || nums.length == 0) return -1;

        int length = 0;
        int max = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        for(int i=0; i<nums.length; i++){
            if(nums[i]==0)  length -= 1;
            else length += 1;
           
            if(!map.containsKey(length)){
                map.put(length, i);
            }
            else{
                max = Math.max(max, i - map.get(length));
            }
        }

        return max;
    }
}