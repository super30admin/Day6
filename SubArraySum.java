// Time Complexity : O(n) where n is array size
// Space Complexity :O(n) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class SubArraySum {
    public int subarraySum(int[] nums, int k) {
        
        
        Map<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int count=0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            if(map.containsKey(sum-k))  //If we find a sum such that gap between previously                                 found sum and current sum forms k, we found a subarray
            {
                count +=map.get(sum-k); //If sum-k appears multiple times, that many number                                 of subarrays can be formed when considering sum
            }
            map.put(sum,map.getOrDefault(sum,0)+1); // Element put in map
        }
        return count;
        
        
    }
}