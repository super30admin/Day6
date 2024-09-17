// Time Complexity : o(n)
// Space Complexity : o(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : 

//check at every point whats the reccuring sum, based on 
//if we encounter 0-> add-1, and if we encounter  1->add +1
// if thee recsum has occured before , 
//we know the subarray between that index to curr index is the balanced contiguous array

class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap();
        int rsum=0;
        int max=0;
        hm.put(0,-1); //to handle edge case-> input= {0,1}
        
        for(int i=0;i<nums.length;i++)//o(n)
        {
            rsum = nums[i]==0 ? rsum-1:rsum+1;
            if(hm.containsKey(rsum))//const time
            {
                int len= i-hm.get(rsum);//const time
                max=Math.max(max,len);
            }
            else
            {
                hm.put(rsum,i);
            }
            
            
        }
        return max;
    }
}