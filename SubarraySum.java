import java.util.HashMap;
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums == null || nums.length ==0) return 0;
        HashMap<Integer, Integer> map= new HashMap<>();
        int sum=0;
        int count=0;
        map.put(0,1);
    // put map's first key as 0 to make the subtraction easy for first element
        for(int i=0; i<nums.length; i++){
            //running sum
            sum=sum+nums[i];
            //if the map contains the sum - target value,
            //increase the answer count
            if(map.containsKey(sum-k)){
                count= count+ map.get(sum-k);
            }
            //put the sum in map with the frequency occured
            map.put(sum, map.getOrDefault(sum,0) +1);
        }
        return count;
    }
}