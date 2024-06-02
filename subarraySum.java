// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : nO


class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums == null || nums.length == 0){
            return -1;
        }
        int rsum = 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>(); // mapping integer to integer
        map.put(rsum, 1);
        for(int i = 0; i < nums.length; i++){
            rsum = rsum + nums[i]; // increase rsum with current value of nums[index]
            if(map.containsKey(rsum - k)){ // if rsum - k is present, to check if there is a subarray totalling to k
                count = count + map.get(rsum - k);
            }
            map.put(rsum, map.getOrDefault(rsum, 0) + 1); // if there is already, then increase by 1 or put 1;
        }
    return count;
    }
}