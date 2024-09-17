// Time Complexity : O(N)
// Space Complexity :O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : A lot of thinking to process this approach. Confused 
//how this is different from dp in this case. 


// Your code here along with comments explaining your approach
public class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0, sum = 0;
        HashMap < Integer, Integer > map = new HashMap < > ();
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];  //cumalative sum
            if (map.containsKey(sum - k)) //check if complement exists
                count += map.get(sum - k); //increase count if complement exists
            map.put(sum, map.getOrDefault(sum, 0) + 1); // increase the count if the same array sum has occured before
        }
        return count;
    }
}