//Solution was not accepted in LeetCode. Got error "An Item with the same key has already been added. Key -1"
//Time Complexity: O(n)
//Space Complexity: O(n)
public class Solution {
    public int SubarraySum(int[] nums, int k) {
        if (nums == null || nums.Length == 0)
            {
                return 0;
            }
            int rSum = 0;
            int cnt = 0;
            Dictionary<int, int> map = new Dictionary<int, int>();
            map.Add(0, 1);
            for (int i = 0; i < nums.Length; i++)
            {
                rSum += nums[i];
                int diff = rSum - k;
                if (map.ContainsKey(diff))
                {
                    cnt += map[diff];
                }
                //map.Add(rSum, map.GetOrDefault(rSum,0) + 1);
                if (map.ContainsKey(rSum))
                {
                    map.Add(rSum, map[rSum] + 1);
                }
                else
                {
                    map.Add(rSum, 1);
                }
            }
            return cnt;
    }
}