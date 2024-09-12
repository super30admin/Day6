// Time Complexity :O(n) n is the size of array;
// Space Complexity : O(n) as the size of the array would increase so would the size of the hashmap.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :NO


// Your code here along with comments explaining your approach

import java.util.HashMap;

class Solution {
    public int findMaxLength(int[] nums) {
        if(nums.length==0 || nums ==null)
        {
            return 0;
        }
        int maxlength =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                sum -= 1;
            }
            else
            {
                sum += 1;
            }
            
            if(map.containsKey(sum))
            {
               maxlength = Math.max(maxlength,i-map.get(sum));
            }
            else
            {
                map.put(sum,i);
            }
        }
        
        return maxlength;
    }
}