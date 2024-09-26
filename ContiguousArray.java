// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No



class Solution {
    public int findMaxLength(int[] nums) {

        //Running sum to Index Map
        HashMap<Integer, Integer> rSumMap = new HashMap<>();
        rSumMap.put(0, -1);

        int maxLength = 0;
        int runningSum = 0;

        for(int i = 0; i < nums.length; i++){
            runningSum = (nums[i] == 0 ? runningSum - 1 : runningSum + 1);

            if(rSumMap.containsKey(runningSum)) {
                int index = rSumMap.get(runningSum); //If running sum was seen previously, then the array is balanced (z= y-x).
                int length = i - index; //Compare with the current max length of balanced array and update Max if reqd.
                maxLength = Math.max(maxLength, length);
            } else {
                rSumMap.put(runningSum, i);
            }

        }

        return maxLength;

    }
}