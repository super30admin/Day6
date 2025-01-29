// time complexity - o(n) where n is element count
// space complexity - o(n) for dictionary where n = element count
// successfully ran on leet code - Yes
// approach - Take a running sum with 1(add 1) and 0(substract 1) and put it in dict with index. Any time running sum
// is present in dictionary means balanced array is found. So add the max length in result.
// and if rSum not present in dict, add the entry with index

public class Solution
{
    public int FindMaxLength(int[] nums)
    {
        if (nums == null || nums.Length == 0)
        {
            return 0;
        }
        int rSum = 0;
        int result = 0;
        Dictionary<int, int> dict = new Dictionary<int, int>();

        dict.Add(0, -1);

        for (int i = 0; i < nums.Length; i++)
        {
            if (nums[i] == 1)
            {
                rSum++;
            }
            else
            {
                rSum--;
            }

            if (dict.ContainsKey(rSum))
            {
                result = Math.Max(result, i - dict[rSum]);
            }
            else
            {
                dict.Add(rSum, i);
            }
        }
        return result;
    }
}