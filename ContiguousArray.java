// Time Complexity : O(n) 
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No

// Approach:
// 1. I used HashMap to store the cumulative sum of all the elements in the array.
// 2. With every iteration, I check if the same cumulative sum has been occurred earlier, if so, it means that in between these two indexes, there is a contiguous
// array with cumulative sum 0.
// 3. I fetch the count of that previously occurred cumulative sum, just in case, if it have occurred multiple times, which will mean, multiple counts
// of the possible contiguous array.

class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int currentSum = 0;
        int maxLength = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                currentSum -= 1;
            }
            else{
                currentSum += 1;
            }
            if(currentSum==0) maxLength = i + 1;
            if(map.containsKey(currentSum)){
                maxLength = Math.max(maxLength, i - map.get(currentSum));
            }
            else{
                map.put(currentSum, i);
            }
        }
        return maxLength;
    }
}
