
// Time Complexity : O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :Yes


class Solution {
    public int subarraySum(int[] nums, int k) {
        int rsum =0;
        int count=0;
        int diff=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i = 0; i<nums.length;i++){
            rsum = rsum+nums[i];
            //check if the rsum-target is in map, if yes - 
              diff = rsum-k;
            if(map.containsKey(diff)){
              count = count+map.get(diff);  
            }
            
      if(!map.containsKey(rsum)){
            map.put(rsum,0);
        }
        
            map.put(rsum, map.get(rsum)+1);
        
    
        } 