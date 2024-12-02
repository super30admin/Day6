// Time Complexity :O(n) 
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :no
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        map.put(0,1);
        int max=0;
        int rsum=0;
        for(int i=0;i<nums.length;i++){
            rsum+=nums[i];
            int re=rsum-k;
            
            if(map.containsKey(re))
            {                
                max+=map.get(re);
            }
            if(!map.containsKey(rsum))
                map.put(rsum,0);
            map.put(rsum,map.get(rsum)+1);
           
        }
        return max;
    }
}