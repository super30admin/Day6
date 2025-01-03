public class Solution
{
    public int FindMaxLength(int[] nums)
    {
        if (nums == null || nums.Length <= 1)
        {
            return 0;
        }

        Dictionary<int, int> lookup = new();
        int rSum = 0, maxLength = 0;
        lookup.Add(0, -1);
        for (int i = 0; i < nums.Length; i++)
        {
            rSum += nums[i] == 0 ? -1 : 1;
            if (lookup.ContainsKey(rSum))
            {
                maxLength = Math.Max(maxLength, i - lookup[rSum]);
            }
            else
            {
                lookup.Add(rSum, i);
            }
        }
        return maxLength;
    }
}