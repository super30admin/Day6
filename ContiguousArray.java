/*
 *  Time Complexity: O(N) We are iterating over all the numbers in the nums array.
 *  Space Complexity: O(N) Considering the fact that we have only ones or zeros would result in all unique values in the set.
 * 
 *  Did this code successfully run on Leetcode : Yes
 *  Any problem you faced while coding this : None
 * 
 *  We first iterate over the array and computer the running sum, if its zero we add -1 if its 1 we add 1. Now we put the first occurance of each unique sum and index in the map. Now if we find the sum already existing in the map, it would represent that we have contiguous element from the index of the unique sum in the map and the current index would result in same number of ones and zeros. So we check all such occurances and compute the max length.
 */

class Solution {
    public int findMaxLength(int[] nums) {
        int runSum=0, maxLength=0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(runSum,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) runSum+=-1;
            else runSum+=1;
            if(map.containsKey(runSum)) {
                maxLength= Math.max(maxLength, i-map.get(runSum));
            }else{
                map.put(runSum,i);
            }
        }
        return maxLength;
    }
}
