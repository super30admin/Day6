// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    public int subarraySum(int[] nums, int k) {

        //map of runningSum vs frequency of that particular sum
        HashMap<Integer, Integer> map = new HashMap();

        int runningSum=0;
        int count=0;

        map.put(0,1);

        for(int i=0; i<nums.length; i++)
        {
            //calculate running sum till current i
            runningSum+=nums[i];

            //if this condition is true, we have a subarray of sum k
            if(map.containsKey(runningSum-k))
            {
                //increase the count by its frequency, because there could be multiple subarray matching this condition
                count+=map.get(runningSum-k);
            }

            //if runningSum is already present in map, increase it's frequency
            if(map.containsKey(runningSum))
            {
                map.put(runningSum, map.get(runningSum)+1);
            }
            else
                map.put(runningSum, 1);
        }
        return count;
    }
}
