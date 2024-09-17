// SubArray sum  = k      Ex: Input:nums = [1,1,1], k = 2   Output: 2
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : coming up with the optimal solution from brute force was difficult w/o hints


// Your code here along with comments explaining your approach
class Solution {
    /**
     * intuition : using cumulative sum to calculate the prefix sum for every ele. the diff between 2 such sums = k then there lies the subarray between those 2 sums
     * @param nums
     * @param k
     * @return count of such subarrays which are == k
     */
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hmap = new HashMap<>();             //to store the (sum -> no of times it has occured)
        int count = 0, sum = 0;
        hmap.put(0,1);                                              // init. sum = 0 -> occurs once
        for(int i=0;i<nums.length;i++)
        {
            sum += nums[i];
            if(hmap.containsKey(sum-k))                            // present sum - k =  target present in the hmap then there exists a definite subarray whcih == k
                count += hmap.get(sum-k);                          // if there are multiple subarrays which are deducing to this target then have to include all those subarrays
            hmap.compute(sum, (key, v) -> v == null ? 1 : v + 1);  // insert the sum and the value + 1
        }
        return count;
    }
}