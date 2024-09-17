// Time Complexity : O(N)
// Space Complexity : O(N) (To store all the sums in the hashmap)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/* Approach: Create a hashamap which contains the running sum and for every element check if the complement ie
running sum - target value is present in the hashmap. If it is present then add the value of the complement
to the count, otherwise, just add the running sum to hashmap.
*/

import java.util.HashMap;
class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums == null || nums.length == 0) return 0;
        int count = 0, sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(map.containsKey(sum-k))
                count+=map.get(sum-k);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}