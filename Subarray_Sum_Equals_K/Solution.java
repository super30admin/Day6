// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

/**
 * Here we use rsum approach, to check how many times required sum has occured before.
 * so at each index, we take cummulative rsum, and in order for an subarray to form sum equal to k, there should have occured (sum - k) rsum before.
 * If it has occured, then index at which orrucred + 1 to current index forms a subarray whose sum is equal to k.
 * So we take count of how many times (sum - k) has occured before and we add that count to final count variable.
 * At each step or index, we also add rsum which has formed so far in hashmap (i.e. is this rsum has occured before, update its count or add new entry with current sum and count as 1).
*/



class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums.length == 0 } || nums == null)return 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int sum = 0;
        map.put(0, 1);
        
        for(int i = 0; i < nums.length;i++){
            sum = sum + nums[i];
            count = count + map.getOrDefault(sum - k, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}