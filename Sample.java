// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution {
    public int subarraySum(int[] nums, int k) {
        int output = 0;
        for(int i=0;i<nums.length;i++){
            int sum = 0;
            for(int j=i;j<nums.length;j++){
                sum =sum+nums[j];
                if(sum == k){
                    output++;
                }
            }
        }
        return output;
    
}
}
