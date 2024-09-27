// Time Complexity : O(n) where n is the length of array
// Space Complexity : O(n) where n is the length of array
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : 

class SubarraySum {
    public int subarraySum(int[] nums, int k) {
        int sum = 0, cnt=0; 
        Map<Integer,Integer> map = new HashMap();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            if(map.containsKey(sum-k)){
                cnt += map.get(sum-k);
            }
            int freq = map.getOrDefault(sum,0);
            map.put(sum,freq+1);
        }
            
        return cnt;
        
    }
}