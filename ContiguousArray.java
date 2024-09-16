// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/*
    For every encounter of 1, we increment count.
    For every encounter of 0, we decrement count.
    To find the longest contiguous array, we need to find if that particular count occurred in the past.
    If it did, we wuld compare the length with the current maximum length of contiguous array.
*/

class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer,Integer> hashMap = new HashMap<>();
        hashMap.put(0,-1);
        int count = 0; int result = 0;
        for (int i=0; i<nums.length; i++){
            if (nums[i] == 1) count++;
            if (nums[i] == 0) count--;
            if (hashMap.containsKey(count)) 
                result = Math.max(i-hashMap.get(count),result);
            else 
                hashMap.put(count, i);
        }   
        return result;
    }
}