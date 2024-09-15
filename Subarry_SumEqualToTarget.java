import java.util.*;

class Solution {
    // Running sum problem
    // Time complexity is O(n)
    // Space complexity is O(n)
    public int subarraySum(int[] nums, int k) {
        // edge case
        if(nums == null || nums.length ==0) return -1;
        int count= 0;
        int rSum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for (int i = 0;i<nums.length;i++) {
            rSum+=nums[i];
            int target = rSum-k;
            if (map.containsKey(target)){
                count+=map.get(target);
            }
            if(!map.containsKey(rSum)){
                map.put(rSum,1);
            } else {
                map.put(rSum, map.get(rSum)+1);
            }
        }
        return count;
    }
}