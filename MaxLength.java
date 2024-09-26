// Time Complexity : O(N^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Nope. TLE for few test cases
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class MaxLength {
    public int findMaxLength(int[] nums) {
        int maxLength = 0;
        for(int i = 0; i < nums.length; i++){
            int zeros = 0, ones = 0;
            for(int j = i; j < nums.length; j++){
                if(nums[j] == 0){zeros++;}
                if(1 == nums[j]){ones++;}
                if(zeros == ones){maxLength = Math.max(maxLength,j-i+1);}
            }
        }
    return maxLength;
    }
}