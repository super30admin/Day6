/*
Author: Akhilesh Borgaonkar
Problem: Given an array of integers and an integer k, you need to find the total number of continuous subarrays whose sum equals to k.
Approach: Using hashing technique here to find if the difference between current element and target k is already present in hashmap. If yes, then
    check if the difference is equal to target K then add to the subarray length.
Time Complexity: O(n) where n is number of elements in array.
Space complexity: O(1) constant.
LC Verified.
*/

class Solution {
    public int subarraySum(int[] nums, int k) {
        int arrLen = 0;
        int currSum = 0;
        HashMap<Integer,Integer> numsMap = new HashMap<>();
        numsMap.put(currSum, 1);
        
        for(int i=0; i<nums.length; i++){
            currSum = currSum + nums[i];
            
            if(numsMap.containsKey(currSum - k)){
                arrLen += numsMap.get(currSum - k);
            }
            
            int newArrLen = numsMap.getOrDefault(currSum, 0)+1;
            numsMap.put(currSum, newArrLen);
        }
        
        return arrLen;
    }
}