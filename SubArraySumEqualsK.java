// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach


class SubArraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        int subArrayCount = 0;

        Map<Integer,Integer> earlyPresenceMap = new HashMap<>();
        earlyPresenceMap.put(0,1);
        
        int lsum = 0;
        for(int i=0;i<nums.length;i++) {
            lsum = lsum + nums[i];
            if(earlyPresenceMap.containsKey(lsum-k)){
                subArrayCount = subArrayCount + earlyPresenceMap.get(lsum-k);
            }
            
            earlyPresenceMap.put(lsum,earlyPresenceMap.getOrDefault(lsum,0)+1);
        }
        
        return subArrayCount;
    }
}
