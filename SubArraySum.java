// Time Complexity :O(N)
// Space Complexity :O(N) hashmap auxiliary data sructure 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach


public class Solution {
    public int subarraySum(int[] nums, int k) {
        int interSum = 0 ;
        int cnt = 0;
        Map<Integer, Integer> hm = new HashMap <Integer,Integer>();
        hm.put(0, 1); // if the number == k, we want to count that as well
        for (int i = 0; i < nums.length; i++) {
            interSum += nums[i];
            if (hm.containsKey(interSum - k)) // if the difference is present 
                cnt += hm.get(interSum - k);
            hm.put(interSum, hm.getOrDefault(interSum, 0) + 1); // increment  the interSum 
        }
        return cnt;
    }
}