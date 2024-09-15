// Time Complexity :O(n^2)
// Space Complexity :constant
// Did this code successfully run on Leetcode :TLE
// Any problem you faced while coding this :TLE

//traversing with nested for loop to check all occurrences of sum equals k
class Solution {
    public int subarraySum(int[] nums, int k) {
        int currentSum = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            currentSum = 0;
            for (int j = i; j < nums.length; j++) {
                currentSum += nums[j];
                if (currentSum == k) {
                    count++;
                }
            }
        }
        return count;
    }
}

// ------------OPTIMIZED--------------------
// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :no
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int runningSum = 0;
        int count = 0;
        map.put(0, 1);
        for (int num : nums) {// iterating through array
            runningSum += num;// calculating runningSum
            if (map.containsKey(runningSum - k)) {// if runningSum-k is alredy there means we found subarray having sumk
                count += map.get(runningSum - k);// we'll increase result to no of occurrences bcz if runningSum is
                                                 // repeating that means somewhere subarray gives sum=0 and we got extra
                                                 // subarrays in result
            }
            map.put(runningSum, map.getOrDefault(runningSum, 0) + 1);// add runningSum in map

        }
        return count;// return result
    }
}