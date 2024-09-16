/* Leetcode Problem - 560
https://leetcode.com/problems/subarray-sum-equals-k/
 Time Complexity : O(n)
 Space Complexity : O(1)
 Did this code successfully run on Leetcode : Yes
 Any problem you faced while coding this : No

Your code here along with comments explaining your approach
1. Compute running sum for every position in the array
2. Idea is to get all x, such that (running_sum of x) + target = (running_sum of y)
3. Store runningSums in HashMap <running_sum, times this sum has been seen>

// Testcases: 
[1,-1,1,3,-3,2,1], k=3 -> 6
*/

import java.util.HashMap;

public class SubArraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        
        // Map --> <runningSum, no. of times this runningSum was seen>
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int count = 0;
        int runningSum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            runningSum += nums[i];
            
            // if there is an increase of k in the running sum,
            // we have found a new subarray so that is why we look for runningSum-k
            if (map.containsKey(runningSum - k)) {
                count += map.get(runningSum - k);
            }
            
            // alternatively initialize the HashMap with <0,1> -> sum 0 is seen 1 time, in a subarray of length 0
            if (runningSum == k) {
                count += 1;
            }
            
            map.put(runningSum, map.getOrDefault(runningSum, 0) + 1);
        }        
        return count;
    }
}