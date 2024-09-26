/*
 *  Time Complexity: O(N) We are iterating the nums array completely once to verify all the possible combinations.
 *  Space Complexity: O(N) If all the running sums values are unique we would create N entries in the Map.
 * 
 *  Did this code successfully run on Leetcode : Yes
 *  Any problem you faced while coding this : None
 * 
 *  We have to first compute the running sum in each iteration and store all the unique sums and their frequecy of occurance in the map. While doing this iteration, we must also verify if the difference between the current running sum and the target is already existing in the map.Then we get that frequency and add it to the current count. If its present that represents that there are indexes from some location which would result in the target value when performed a consecutive sum. In the end we return the count.
 */
class Solution {    
    public int subarraySum(int[] nums, int k) {
        int cnt=0, runSum=0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(runSum,1);
        for(int i=0;i<nums.length;i++){
            runSum+=nums[i];
            if(map.containsKey(runSum-k)){
                cnt+=map.get(runSum-k);
            }
            if(map.containsKey(runSum)) map.put(runSum, map.get(runSum)+1);
            else map.put(runSum, 1);
        }      
        return cnt;
    }
}
