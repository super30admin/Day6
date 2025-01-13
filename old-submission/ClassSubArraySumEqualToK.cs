namespace LeetCodeSubmission.Hashing2;

public class ClassSubArraySumEqualToK
{ 
    public int SubarraySum(int[] nums, int k)
    {
        int result = 0;
        Dictionary<int, int> rSumCount = new Dictionary<int, int>();
        rSumCount.Add(0,1); // default

        int rSum = 0;
        for (int i = 0; i < nums.Length; i++)
        {
            rSum += nums[i];
            int diffKey = rSum - k;
            
            // chk if rSum-k difference exist
            if (rSumCount.ContainsKey(diffKey) && rSumCount.TryGetValue(diffKey, out var prevCount))
            {
                // key exist inside the dictionary
                result += prevCount;
                //rSumCount.TryAdd(diffKey, prevCount + 1);
            }
            
            // anyhow add the rSum pair inside the dictionary-pair
            // key doesn't exist, add current rSum inside the dictionary
            if (rSumCount.ContainsKey(rSum) && rSumCount.TryGetValue(rSum, out var prev))
            {
                rSumCount[rSum] = prev + 1;
            }
            else
            {
                rSumCount.Add(rSum,1);
            }
        }
        return result;
    }
}