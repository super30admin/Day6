// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO


import java.util.HashMap;

public class ContiguousSubArray {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1); // Edge case handling
        int rSum = 0;
        int maxLen = 0;
        for(int i =0; i< nums.length; i++){
            if(nums[i] ==1) rSum++;
            else rSum--;
            if(map.containsKey(rSum)){
                maxLen = Math.max(maxLen, i - map.get(rSum));
            }
            else{
                map.put(rSum, i);
            }
        }
        return maxLen;
    }
}