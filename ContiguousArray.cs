// Time Complexity :  O(n) – We iterate over the array once, making this a linear time algorithm.
// Space Complexity : O(n) – We use a Dictionary to store the running sum and its corresponding earliest index, which can take up to n space in the worst case.
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
//We maintain a running sum (rSum) where 0 is treated as -1 and 1 remains as 1. This helps track balanced subarrays where the number of 0s and 1s are equal.
//We use a dictionary to store the first occurrence of each rSum so that we can quickly check if a subarray with the same rSum has appeared before.
//Whenever the same rSum is found again, the subarray between the previous and current index has equal 0s and 1s, and we update the maximum length accordingly.

public class Solution
{
    public int FindMaxLength(int[] nums)
    {
        if (nums == null || nums.Length == 0 || nums.Length == 1) return 0;

        Dictionary<int, int> map = new Dictionary<int, int>();
        map.Add(0,-1); // rsum:Earliest Index
        int max = 0;
        int rSum = 0;
        int start = 0, end = 0;
        for (int i = 0; i < nums.Length; i++)
        {
            if (nums[i] == 0)
            {
                rSum--;
            }
            else
            {
                rSum++;
            }
            //if (rSum == 0) max = i + 1; //when you dont want to add (0,-1) in map
            if (map.ContainsKey(rSum))
            {
                if (max < i - map[rSum])
                {
                    max = Math.Max(max, i - map[rSum]); // max = current index - earliset index
                    start = map[rSum] + 1;
                    end = i;
                }

            }
            else
            {
                map.Add(rSum, i);
            }
        }
        Console.WriteLine(start + "" + end);
        return max;
    }
}

public class Program
{
    public static void Main()
    {
        Solution obj = new Solution();
        int[] nums = new int[] { 0, 1 };
        int result = obj.FindMaxLength(nums);

        Console.WriteLine(result);
    }
}