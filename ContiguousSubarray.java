// Time Complexity :O(n) beacuse of the for loop where we traverse all the elements in the array of length n
// Space Complexity : Integer Key and value so O(n) + O(n) where n is the length of the array 
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : 

// Your code here along with comments explaining your approach

class Solution {
    public int findMaxLength(int[] nums) {

        HashMap<Integer, Integer> tracker = new HashMap<>();

        int curSum = 0, maxLen = 0;

        // the base case where the sum is already 0 is -1(to signify the index position
        // before 0)
        tracker.put(0, -1);

        for (int i = 0; i < nums.length; i++) {

            // calculate the sum at each index
            curSum = curSum + (nums[i] > 0 ? 1 : -1);

            // see if the curSum has already been encountered, if yes that means all the
            // values have nullified each other, which means that equal number of 0s and 1s

            if (tracker.containsKey(curSum)) {
                // if yes, update the maxlen if it is bigger than the previous maxlen
                maxLen = Math.max(maxLen, i - tracker.get(curSum));
            } else
                tracker.put(curSum, i);

        }

        return maxLen;

    }
}