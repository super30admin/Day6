Time Complexity: O(n)
Space Complexity : O(n)
Runs on LeetCode : Yes

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count=0; int runningSum=0;
        map.put(0,1);
        
        for(int i=0;i<nums.length;i++)
        {
            runningSum += nums[i];
            if(map.containsKey(runningSum-k))
            {
                count+=map.get(runningSum-k);
            }
            if(map.containsKey(runningSum))
            {
                map.put(runningSum,map.get(runningSum)+1);
            }
            else
            {
                map.put(runningSum,1);
            }
        }
        return count;
    }
}