// time complexity - o(n) where n is element count
// space complexity - o(n) for dictionary where n = element count
// successfully ran on leet code - Yes
// approach - Take a running sum and put it in dict with frequency. Any time running sum - k
// is present in dictionary means array of sum k is found. So add the frequency in result.

public class Solution
{
    public int SubarraySum(int[] nums, int k)
    {
        if (nums == null || nums.Length == 0)
        {
            return -1;
        }
        int rSum = 0;
        int result = 0;
        Dictionary<int, int> dict = new Dictionary<int, int>();
        dict.Add(0, 1);
        for (int i = 0; i < nums.Length; i++)
        {
            rSum += nums[i];
            if (dict.ContainsKey(rSum - k))
            {
                result = result + dict[rSum - k];
            }
            // if(dict.ContainsKey(rSum))
            // {
            //     dict[rSum]++;
            // }
            // else
            // {
            //     dict.Add(rSum,1);
            // }
            dict[rSum] = dict.GetValueOrDefault(rSum, 0) + 1;
        }
        return result;
    }
}