using System;
using System.Linq;

namespace Algorithms
{
    // Did this code successfully run on Leetcode : Yes
    // Any problem you faced while coding this : No
    public class ContiguousArray
    {
        //Time Complexity - O(n) - Since we are iterating through the array only once
        // Space complexity - O(n) - Since we are using HashMap for counting
        public int FindMaxLength(int[] nums)
        {
            if (nums == null || nums.Length == 0) return 0;

            var dict = new Dictionary<int, int>();
            var maxLength = 0;
            dict.Add(0, -1); // This would take care of the edge case for reading from the first element
            var rSum = 0;
            for (int i = 0; i < nums.Length; i++)
            {
                rSum = nums[i] == 0 ? rSum - 1 : rSum + 1;
                if (dict.ContainsKey(rSum))
                {
                    // The contiguous array lies between the index the running sum occured the second time
                    // and the first index, we take the max betweeen current maxLength and the length
                    // caluclated for the later part.
                    dict.TryGetValue(rSum, out int earlierIndex);
                    maxLength = Math.Max(maxLength, i - earlierIndex);
                }
                else
                {
                    dict.Add(rSum, i);
                }
            }

            return maxLength;
        }
    }
}

