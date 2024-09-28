// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Using HashMap, cumulative sum and complement

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum =0,count=0;
        map.put(0,1);
        for(int n:nums){
            sum += n;
            
            // Check if the complement already exists in map as subarray add to the count
            if(map.containsKey(sum -k)) count += map.get(sum-k);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
