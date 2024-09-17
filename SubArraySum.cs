// Time complexity is O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode: Yes (https://leetcode.com/submissions/detail/571361995/)
// Any problem you faced while coding this:
using System;
using System.Collections.Generic;

namespace SubarraySum
{     
    class Program
    {
        public int SubarraySum(int[] nums, int k) {
     
        Dictionary<int, int> arr_sum = new Dictionary<int, int>();   
        arr_sum.Add(0, 1);
        int result = 0;
        int sum = 0;
        for(int i = 0; i < nums.Length; i++) {
            sum += nums[i];
            if(arr_sum.ContainsKey(sum - k)) {
                result += arr_sum[sum - k];
            }
            if(arr_sum.ContainsKey(sum)) {
                arr_sum[sum] += 1;
            } else {
                arr_sum.Add(sum, 1);
            }
        }
        return result;
           
        /* //Brute Force
        //Time: O(n^2)
        //Space: O(1)
        for(int i=0; i < nums.Length; i++ ) {
            if(nums[i] == k) {
                result += 1;
            }
            
            int sum = nums[i];
            for(int j = i+1; j< nums.Length; j++) {
                sum += nums[j];
                if(sum == k) {
                    result += 1;
                }
            }
            
        }
        */
    }
        static void Main(string[] args)
        {
            int[] nums = new int[]{1, -1, 0};
            int k=0;
            Program p = new Program();            
            Console.WriteLine(p.SubarraySum(nums, k));
        }
    }
}
