// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : 


// Your code here along with comments explaining your approach

/* I take the cumulative sum and then check the index it is at */

class Solution {
    public int findMaxLength(int[] nums) {
        int result=0;
        
        HashMap<Integer,Integer> map=new HashMap<>();
        
        int sum=0;
        /* Important */
        map.put(0,-1);
        for(int i=0;i<nums.length;i++)
        {   
            sum+=(nums[i]==0)?1:-1;
            
            if(map.containsKey(sum))
            {
                /* Prev Index where we saw Sum */
                int prevIndex=map.get(sum);
                int value=i-prevIndex;
                result=Math.max(result,value);
            }
            else
            {
                map.put(sum,i);
            }
        }
        
        return result;
    }
}