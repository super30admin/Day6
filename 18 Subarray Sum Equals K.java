// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int subarraySum(int[] nums, int k) {
        //aesha
        HashMap<Integer,Integer> map = new HashMap<>();
        int count =0;
        int sum = 0;
        map.put(0,1);
        for(int i =0;i<nums.length; i++)
        {
            sum+=nums[i];
            if(map.containsKey(sum-k))
            {
                count++;
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        return count;
        //brute force
        // int count = 0;
        // for (int start = 0; start < nums.length; start++) {
        //     int sum=0;
        //     for (int end = start; end < nums.length; end++) {
        //         sum+=nums[end];
        //         if (sum == k)
        //             count++;
        //     }
        // }
        // return count;
    }
}