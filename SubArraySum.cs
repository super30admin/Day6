using System;
using System.Collections.Generic;

namespace Algorithms
{
    /// Time Complexity : O(N) 
    // Space Complexity :O(N) 
    // Did this code successfully run on Leetcode :Yes
    // Any problem you faced while coding this :  No
    public class SubArraySum
    {
        public int SubarraySum(int[] nums, int k)
        {

            Dictionary<int, int> map = new Dictionary<int, int>();
            map.Add(0, 1);
            int count = 0;
            int rSum = 0;
            for (int i = 0; i < nums.Length; i++)
            {
                rSum += nums[i];
                if (map.ContainsKey(rSum - k))
                {
                    count += map.GetValueOrDefault(rSum - k);
                }
                map[rSum] = map.GetValueOrDefault(rSum) + 1;
            }
            return count;

        }
    }
}
