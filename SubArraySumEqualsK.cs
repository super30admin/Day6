using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Algorithms
{
    // Did this code successfully run on Leetcode : No, but when I code the same in Java, it runs. Looks like
    // there is an issue with the Leetcode compiler with C# code base
    // Any problem you faced while coding this : No
    public class SubArraySumEqualsK
    {
        //Time Complexity - O(n) - As we are iterating through an array
        // Space Complexity - O(n) - As we are using Extra space by using Dictionary
        public int SubarraySum(int[] nums, int k)
        {
            int rSum = 0; int count = 0;
            var dict = new Dictionary<int, int>();
            dict.Add(0, 1);
            for (int i = 0; i < nums.Length; i++)
            {
                rSum = rSum + nums[i];
                // If the difference between running sum and the total(k) is found in the dictionary, that 
                // means that there will be a subArray that sums up to k before this index
                if (dict.ContainsKey(rSum - k))
                {
                    count = count + dict.GetValueOrDefault(rSum - k, 0);
                }
                // Add runningSum as the index and the value (number of times runningSum is found during iteration) 
                dict.Add(rSum, dict.GetValueOrDefault(rSum, 0) + 1);
            }
            return count;
        }
    }
}
