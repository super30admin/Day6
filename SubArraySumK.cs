using System;
using System.Collections.Generic;
using System.Text;

namespace ConsoleApp1
{
    public class SubArraySumK
    {
        /*
         * T.C: O(N) : since we are travelling through all array values
         * S.C: O(n) : storing sum in the hashmap
         */
        public int SubarraySum(int[] nums, int k)
        {
            if (nums == null || nums.Length == 0)
                return 0;

            Dictionary<int, int> Hmap = new Dictionary<int, int>();
            int total = 0;
            int rSum = 0;
            Hmap.Add(0, 1);

            for (int i = 0; i < nums.Length; i++)
            {
                rSum += nums[i];
                if (Hmap.ContainsKey(rSum - k))
                {
                    total += Hmap[rSum - k];
                }

                if (Hmap.ContainsKey(rSum))
                {
                    Hmap[rSum]= Hmap[rSum] + 1;
                }
                else
                {
                    Hmap.Add(rSum, 1);
                }


            }

            return total;
        }
    }
}
