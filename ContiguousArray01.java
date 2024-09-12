/*
Author: Akhilesh Borgaonkar
Problem: Given a binary array, find the maximum length of a contiguous subarray with equal number of 0 and 1.
Approach: Using hashing method here. Use a hashmap to store the cumulative sum and current index while iterating through the array. 
    If the sum is already contained in map then, update the maximum length of subarray with the diff between current index and previous length
    of same sum in map.
Time Complexity: O(n) where n is number of elements in array.
Space complexity: O(1) constant.
LC Verified.
*/

class Solution {
    public int findMaxLength(int[] nums) {
        int maxLen=0;
        int sum=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        
        for(int i=0; i<nums.length; i++){
            sum = sum + (nums[i]==1 ? 1 : -1);
            if(map.containsKey(sum)){
                maxLen = Math.max(maxLen, i-map.get(sum));
            } else {
                map.put(sum, i);
            }
        }   
        return maxLen;
    }
}