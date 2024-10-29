//560. Subarray sum equals k - https://leetcode.com/problems/subarray-sum-equals-k/description/
//Time Complexity: O(n)
//Space Complexity: O(n)

class Solution {
    public int subarraySum(int[] nums, int k) {
        int runningSum=0, frequency=0, compliment=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);

        for(int i=0; i < nums.length; i++){
            runningSum += nums[i];
            compliment = runningSum-k;
            //store running sum in HashMap and check for compliment
            if(map.containsKey(compliment)){
                frequency += map.get(compliment);
            }
            if(map.containsKey(runningSum)){
                map.put(runningSum, map.get(runningSum)+1);
            }
            else{
                map.put(runningSum,1);
            }
        }
        return frequency;
    }
}