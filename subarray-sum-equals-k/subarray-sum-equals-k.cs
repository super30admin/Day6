public class Solution {
    public int SubarraySum(int[] nums, int k) {
        int rightSum = 0, result = 0;
        var leftSumsFreq = new Dictionary<int, int> {{0, 1}};
        
        foreach (var num in nums) {
            rightSum += num;
            if (leftSumsFreq.TryGetValue(rightSum - k, out var freq)) result += freq;
            leftSumsFreq[rightSum] = leftSumsFreq.GetValueOrDefault(rightSum, 0) + 1;
        }
        return result;
    }
}
