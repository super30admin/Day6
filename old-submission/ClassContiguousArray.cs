namespace LeetCodeSubmission.Hashing2;

public class ClassContiguousArray
{
    public int FindMaxLength(int[] nums)
    {
        int rSum = 0;
        int maxSubarray = 0;

        Dictionary<int, int> rSumDict = new Dictionary<int, int>();
        rSumDict.Add(0,-1);

        int prvIdx = -2;
        for (int i = 0; i < nums.Length; i++)
        {
            if (nums[i] == 0)
            {
                // value is 0; subtract
                rSum -= 1;
            }
            else
            {
                // value is 1; add
                rSum += 1;
            }
            
            // chk for the key-value pair
            if (rSumDict.ContainsKey(rSum) && rSumDict.TryGetValue(rSum,out prvIdx))
            {
                maxSubarray = Math.Max(maxSubarray, (i - prvIdx));
            }
            else
            {
                // seen the rSum for the first-time
                rSumDict.Add(rSum,i);
            }
        }
        return maxSubarray;
    }
}