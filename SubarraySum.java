// Time Complexity : O(N2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
public class SubarraySum {
    public int subarraySum(int[] nums, int k) {
        int counter = 0;
        for(int start = 0; start < nums.length; start++) {
            int total = 0;
            for(int end = start; end  < nums.length; end++) {
                total += nums[end];
                if(total == k) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
