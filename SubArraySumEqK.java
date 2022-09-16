// Time complexity : O(n) -- n is size of array 
// Space Complexity: O(n)-- beacuse we go through the entire array
// Successfully submitted on Leetcode

class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums==null || nums.length==0)  return 0;
        
        HashMap<Integer,Integer> map= new HashMap<>();
        int rsum=0;
        int count=0;
        map.put(0,1);
        
        for(int i=0;i<nums.length;i++){
            rsum=rsum+nums[i];
            if(map.containsKey(rsum-k)){
                count=count+map.get(rsum-k);
            }
    map.put(rsum,map.getOrDefault(rsum,0)+1);
        }
         return count;
    }
   
}