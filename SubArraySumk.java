/*
https://leetcode.com/problems/subarray-sum-equals-k/
Time: O(N)
Space: O(N)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : None
*/
public class SubArraySumk {

    public int subarraySum(int[] nums, int k) {
        int result = 0;
        int sum = 0;

        HashMap<Integer, Integer> map = new HashMap<>(); //Store cumulative sum and it's count
        map.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (map.containsKey(sum - k))
                result += map.get(sum - k);

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return result;
    }

}
