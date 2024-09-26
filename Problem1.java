// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No

class Solution {
    public int subarraySum(int[] nums, int k) {
        int total = 0;
        int currsum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        //Key - running sum value - count of the running sum
        //In the beginning running sum is 0 and it has happened once so value is 1
        map.put(0,1);

        //Put all the running sums in HashMap
        //Increase the count if target-runningsum exists in HashMap by corresponding value
        //If running sum exists then increase the count and if it doesn't put (runningsum,1) in the hashmap

        for(int i=0; i<nums.length; i++)
        {
            currsum+=nums[i];
            int compliment = currsum-k;

            if(map.containsKey(compliment))
            {
                total+=map.get(compliment);
            }

            if(map.containsKey(currsum))
                map.put(currsum,map.get(currsum)+1);
            else
                map.put(currsum,1);

        }
        return total;
    }
}