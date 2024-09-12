// Time Complexity :O(n)
// Space Complexity :o(n)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No
class Solution {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer , Integer> map = new HashMap<>();
        int rsum=0, count=0;
        map.put(0,1);
        //recurring sum and Count value

        for(int i=0;i<nums.length; i++)
        {
            rsum= rsum+ nums[i];
            //if (recurring sum - k) already present
            if(map.containsKey(rsum-k))
            {
                count=count+map.get(rsum-k);
            }

            if(map.containsKey(rsum))
            {
                map.put(rsum , map.get(rsum)+1);
            }
            else{
                map.put(rsum, map.getOrDefault(rsum,0)+1);
            }
        }
        return count;
    }
}

// Your code here along with comments explaining your approach
