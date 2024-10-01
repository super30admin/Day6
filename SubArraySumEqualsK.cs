// Time Complexity : O(n) – We iterate through the array once.
//Space Complexity: O(n) – In the worst case, we may store all the running sums in the dictionary.
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
// We maintain a running sum (rSum) that accumulates the sum of elements from the start of the array up to the current index.
// A dictionary (map) is used to store the frequency of each running sum encountered.
//For each element, check if (rsum - k) exists in the dictionary, which would indicate a subarray with sum k exists. If it does, add the frequency of that sum to the count.
//The dictionary is updated with the current runningSum after each iteration.


public class Solution
{
    public int SubarraySum(int[] nums, int k)
    {
        Dictionary<int, int> map = new Dictionary<int, int>();

        map.Add(0, 1); // Initialize with sum 0 to handle cases where the subarray starts from index 0

        int count = 0;
        int rSum = 0;
        for (int i = 0; i < nums.Length; i++)
        {
            rSum += nums[i];
            int cmp = rSum - k;
            if (map.ContainsKey(cmp))
            {
                count += map[cmp];
            }
            if (!map.ContainsKey(rSum))
            {
                map.Add(rSum, 0);
            }
            map[rSum]++;
        }
        return count;
    }
}

class Program
{
    public static void Main()
    {
        Solution obj = new Solution();

        int[] nums = new int[] {3,4,7,2,-3,1,4,2,0,1 };
        int k = 7;

        int result = obj.SubarraySum(nums, k);
        Console.WriteLine(result);
    }    
}