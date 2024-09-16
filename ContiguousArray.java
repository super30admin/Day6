// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// HashMap is used along with running sum technique to store the new sum whenever encountered.
// The max value is obtained by subtracting the current index with freq of the sum that is present in hashmap.

import java.util.*;
public class ContiguousArray {
    
    public static int findMaxLength(int[] nums) {
        
        if(nums == null || nums.length == 0 || nums.length == 1)
        {
            return 0;
        }
        
    HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int max=0,count=0;
        
        for(int i = 0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                count --;
            }
            else
            {
                count++;
            }
            
            if(map.containsKey(count))
            {
                max = Math.max(max,i-map.get(count));
            }
            else
            {
                map.put(count,i);
            }
        }
        
        return max;
    }

    public static void main(String args[])
    {
        int nums[] = {0,1,0};
        System.out.println(findMaxLength(nums));
    }
}
