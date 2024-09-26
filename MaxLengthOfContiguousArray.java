// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : TLE
// Any problem you faced while coding this : Couldn't optimize this solution


// Your code here along with comments explaining your approach
public class MaxLengthOfContiguousArray {

    //Brute Force
    public static int findMaxLength1(int[] nums) {

        //Initializing result as 0
        int maxlength = 0;

        // two pointers, start and end. Calculate number of 0s and 1s. If equal, update result
        for(int start=0; start<nums.length; start++){
            int num0 = 0;
            int num1 = 0;
            for(int end = start; end < nums.length; end++){
                if(nums[end] == 0){
                    num0++;
                } else if(nums[end] == 1){
                    num1++;
                }

                if(num0 == num1){
                    maxlength = Math.max(end-start +1 , maxlength);
                }
            }
        }

        return maxlength;
    }

    public static void main(String args[]){
        int[] nums = new int[]{0,1};
        System.out.println("Brute Force" + findMaxLength1(nums));
    }
}
