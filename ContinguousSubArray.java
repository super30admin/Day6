// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :nope not in this approach


// Your code here along with comments explaining your approach
// Taken two pointers start and end ,traverse through the array and check at each point number of zeroes and ones 
//and if they are equal increment counter

class ContinguousSubArray {
    public int findMaxLength(int[] nums) {
        int maxlength=0;
            for(int start=0;start < nums.length;start++)
            {
                int zeroes=0; int ones=0;
                for (int end=start;end < nums.length ;end++)
                {
                    if (nums[end]==0)
                    {
                        zeroes ++;
                }
                else
                {
                    ones++;
                }
                if(zeroes == ones)
                {
                    maxlength=Math.max(maxlength,end-start+1);
                 }
        
             }
            }
        return maxlength;
      }
}