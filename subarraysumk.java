/Time Complexity : O(n^3)
//Space Complexity : O(n)
// Did this code successfully run on Leetcode : no, passed only some testcases








class Solution {
    public int subarraySum(int[] nums, int k) {
        int len = nums.length-1;
        int count =0,sum=0;
        
        for(int i=0;i<=len;i++ )
        {
            for(int j=i;j<=len-1;j++)
            {   
                int x = sum(0,j,nums);
                int y = sum(0,i,nums);
                sum=x-y ;
                if (sum == k || k==x|| k==y)
                {count = count+1;}
            }
                
        }
        return count;
        
        
        
        
    }
    public int sum(int x,int y,int[] nums)
        {   int sum=0;
            for(int i=x;i<=y;i++)
            {
                sum= sum + nums[i];
                
            }
         return sum;
         
        }
    
}

