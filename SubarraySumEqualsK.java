// Time Complexity : O(n)
// Space Complexity : o(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
public class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        if(nums == null || nums.length == 0)
            return 0;
           // key = running sum, value = count of number of times we saw k at this running sum
           Map<Integer, Integer> map = new HashMap<>();
           map.put(0, 1);
           int rSum = 0, count = 0;
           
           for(int i = 0 ; i < nums.length; i++)
           {
               rSum += nums[i];
               
               if(map.containsKey(rSum-k))
               {
                   count += map.get(rSum-k); // how many times have we seen k sums at (rSum-k) running sum
               }
               map.put(rSum, map.getOrDefault(rSum,0)+ 1); // mark that we have seen k sum at current running sum for future
           }
           return count;
       }
}
