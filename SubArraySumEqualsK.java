// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

public class SubArraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> rSumMap = new HashMap<>();
        rSumMap.put(0,1);  // it is to cover edge cases like [1,1] , k=2
        int count = 0, rSum = 0;

        for(int i=0; i<nums.length; i++){
            rSum += nums[i];

            //x+y= target, x-target = y
            // So, if runningSum - target is already encountered, add its count to the existing count
            if(rSumMap.containsKey(rSum-k)){
                count = count + rSumMap.get(rSum-k);
            }

            //update the map with the running sum count
            rSumMap.put(rSum, rSumMap.getOrDefault(rSum, 0)+1);

        }
        return count;
    }
}