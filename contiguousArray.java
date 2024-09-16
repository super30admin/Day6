// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        //to consider the initial index as a part of balanced array
        hm.put(0,-1);
        int maxLength = 0;
        int resultingSum = 0;
        for(int i=0;i<nums.length;i++) {
            // resultingSum to be decremented by 1 incase of zero, else 1
            if(nums[i] == 0) resultingSum--;
            else resultingSum++;
            //if resultingSum is already present, then the subarray from the index stored in that key till current will be a balanced subArray
            hm.putIfAbsent(resultingSum, i);
            maxLength = Math.max(i-hm.get(resultingSum), maxLength);
        }
        return maxLength;
    }
}