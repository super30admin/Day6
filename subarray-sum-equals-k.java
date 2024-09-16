// Time Complexity : O(n) {n = nums.length}
// Space Complexity : O(n) {n = nums.length}
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : Yes
// Did not read question carefully, thought all numbers are positive


// Your code here along with comments explaining your approach
// put sum in a map and find sum of substring by substracting sun of revious elements from map.


class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> freqMap = new HashMap<>();
        int currSum = 0;
        for(int i = 0;i<nums.length;i++){
            currSum+=nums[i];
            freqMap.put(currSum, freqMap.getOrDefault(currSum,0)+1);
        }
        int result = 0;
        int prevSum = 0;
        for(int i = 0;i<nums.length;i++){
            result += freqMap.getOrDefault(k+prevSum,0);
            prevSum+=nums[i];
            if(freqMap.containsKey(prevSum)) freqMap.put(prevSum, freqMap.get(prevSum)-1);
        }
        return result;
    }
}