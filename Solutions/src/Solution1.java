// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach

import java.util.HashMap;

class Solution1 {
    public int subarraySum(int[] nums, int k) {
        if(nums==null || nums.length==0){
            return 0;
        }

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int count=0;
        int rsum=0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            rsum=rsum+nums[i];
            if(map.containsKey(rsum-k)){
                count +=map.get(rsum-k);
            }
            if(!map.containsKey(rsum)){
                map.put(rsum,1);
            }
            else{
                map.put(rsum,map.get(rsum)+1);
            }
        }
        return count;
    }
}