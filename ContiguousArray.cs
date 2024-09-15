using System;
using System.Collections.Generic;
using System.Text;

namespace ConsoleApp1
{
    public class ContiguousArray
    {
        /*
         * T.C. : O(n)
         * S.C: O(1)
         */
        public int FindMaxLength(int[] nums)
        {
            if (nums == null || nums.Length == 0 || nums.Length == 1)
                return 0;

            Dictionary<int, int> map = new Dictionary<int, int>();
            int count = 0;
            int max = 0;
            map.Add(0, -1);

            for (int i = 0; i < nums.Length; i++)
            {
                if(nums[i]==0)
                {
                    count--;
                }
                else
                {
                    count++;
                }

                if(map.ContainsKey(count))
                {
                    max = Math.Max(max, i - map[count]);
                }
                else
                {
                    map.Add(count, i);
                }
            }

            return max;
        }
    }
}
