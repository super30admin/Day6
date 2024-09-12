// Time Complexity : O(N2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
public class MaxLengthContiguousArray {
    public int findMaxLength(int[] nums) {
        int counter= 0;
        for(int start = 0; start < nums.length; start++) {
            int[] arr = new int[2];
            for(int end = start; end  < nums.length; end++) {
                if(nums[end] == 0) arr[0]+=1;
                if(nums[end] == 1) arr[1]+=1;

                if(arr[0] == arr[1]) {
                    counter = Math.max(counter, end - start + 1);
                }
            }
        }
        return counter;

    }
}
