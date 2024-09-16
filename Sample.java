// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :nope not in this approach


// Your code here along with comments explaining your approach
// Taken two pointers start and end ,keeping the cumulative sum as we traverse the second for loop
class Solution {
    public int subarraySum(int[] nums, int k) {
         int count = 0;
       // int[] sum = new int[nums.length + 1];
        for (int start = 0; start < nums.length; start++) {
            int sum = nums[start];
            {
                 if (sum == k)
                    count++;
            }
            for (int end = start + 1; end < nums.length; end++) {
                sum=sum +nums[end];
                
                
                if (sum == k)
                    count++;
            }
        }
        return count;
    }
}
        