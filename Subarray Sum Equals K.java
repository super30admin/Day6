// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach
// idea is to maintain a hashmap with running count, #times encountered before, as we proceed check if runningSum-k exists, if yes increment count
//initialize count, running sum, initialize HashMap<curSum, count>
//iterate over array
//check compliment (runningSum-k) if exists then add count+=map.get(compliment) 

class Solution {
    public int subarraySum(int[] nums, int k) {
        //check base case
        if(nums==null || nums.length==0)
            return 0;
        
        //initialize count, running sum, initialize HashMap<curSum, count>
        int count=0, runningSum=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        
        //iterate over array
        //check compliment if exists then add count+=map.get(compliment)
        //put running sum, 1 if not in map else +1
        for(int i=0; i<nums.length; i++){
            runningSum += nums[i];
            
            if(map.containsKey(runningSum-k)){
                count += map.get(runningSum-k);
            }
            
            map.put(runningSum, map.getOrDefault(runningSum, 0)+1);
        }
        
        //return count
        return count;
    }
}