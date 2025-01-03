public class Solution
{
    public int SubarraySum(int[] nums, int k)
    {
        if (nums == null || nums.Length == 0)
        {
            return 0;
        }
        Dictionary<int, int> lookup = new();
        int rSum = 0, count = 0;
        lookup.Add(0, 1);
        for (int i = 0; i < nums.Length; i++)
        {
            rSum += nums[i];
            var num = rSum - k;
            if (lookup.ContainsKey(num))
            {
                count += lookup[num];
            }
            lookup.TryAdd(rSum, 0);
            lookup[rSum]++;
        }
        return count;
    }
}