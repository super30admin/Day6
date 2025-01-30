//Time Complexity: O(n)
//Space Complexity: O(n)

public class Solution {
    public int FindMaxLength(int[] nums) {
         int prefixSum = 0;
        int maxLength = 0;
        Dictionary<int, int> indexMap = new Dictionary<int, int>();
        indexMap[0] = -1; 
        for (int i = 0; i < nums.Length; i++) {
            prefixSum += (nums[i] == 1) ? 1 : -1;

            if (indexMap.ContainsKey(prefixSum)) {
                maxLength = Math.Max(maxLength, i - indexMap[prefixSum]);
            } else {
                indexMap[prefixSum] = i;
            }
        }
        return maxLength;
    }
}