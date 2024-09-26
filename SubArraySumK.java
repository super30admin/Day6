// Time Complexity : O(n) 
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Yes


// Your code here along with comments explaining your approach

public class SubArrayK {

    public int subarraySum(int[] nums, int k) {
        if(nums==null || nums.length==0)
                return 0;
            
            HashMap<Integer, Integer> sMap=new HashMap<Integer, Integer>();
            int sum=0; int count=0;
            sMap.put(0,1);
            
            for(int i=0; i<nums.length;i++){
                
                sum=sum+nums[i];          
                
                if(sMap.containsKey(sum-k)){                
                    count+=sMap.get(sum-k);
                }
                sMap.put(sum,sMap.getOrDefault(sum,0)+1);
            
                 }
            return count;
        }
    
}
