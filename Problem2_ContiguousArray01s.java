import java.util.HashMap;

// Time Complexity : o(n)
// Space Complexity : 0(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
 class Problem2_ContiguousArray01s {
    public int findMaxLength(int[] nums) {
       
        int ans=0;
        
        HashMap<Integer,Integer> map=new HashMap<>();
        
        map.put(0,-1);
        int sum=0;
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
                sum+=-1;
            else if(nums[i]==1)
                sum+=1;
            
            if(map.containsKey(sum))
            {
                int index=map.get(sum);
                int len=i-index;
                if(len>ans)
                    ans=len;
            }
            else
            {
                map.put(sum,i);
            }
        }
         return ans;
    }
}
