// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class SubArraySumEqualsToK {
    public static int subarraySum(int[] nums, int k) {
        int count = 0;
        for(int start=0; start < nums.length; start++){
            int sum = 0;
            for(int end = start; end < nums.length; end++){
                sum = sum + nums[end];
                if(sum == k){
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String args[]){
        int[] nums = new int[]{1,1,1};
        int k = 2;
        System.out.println(subarraySum(nums, k));
    }
}
