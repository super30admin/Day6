using System;
using System.Collections.Generic;

namespace Algorithms
{
    /// Time Complexity : O(N) 
    // Space Complexity :O(N) 
    // Did this code successfully run on Leetcode :Yes
    // Any problem you faced while coding this :  No

    //
    public class ContiguousArray
    {
        public int FindMaxLength(int[] nums)
        {
            Dictionary<int, int> map = new Dictionary<int, int>();
            map.Add(0, -1);
            int max = 0;
            int rSum = 0;
            for (int i = 0; i < nums.Length; i++)
            {
                if (nums[i] == 1) rSum += 1;
                else rSum -= 1;
                if (map.ContainsKey(rSum))
                {
                    max = Math.Max(max, i - map.GetValueOrDefault(rSum));
                }
                else
                {
                    map.Add(rSum, i);
                }
            }
            return max;

        }
    }
}
