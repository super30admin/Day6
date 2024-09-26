// Time Complexity : O(n) where n is the length of the array nums
// Space Complexity : O(n) where n is the length of the array nums
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
// find runningSum and store in map the first occurence of it along with its index
// now whenever we encounter same runningSum, we count the number of elements between that index and 
// 1st occurence and finally return max len
class contiguousArray {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int runningSum = 0, ans = 0;
        for (int i = 0; i < n; i++) {
            runningSum += nums[i] == 1 ? 1 : -1;
            if (map.containsKey(runningSum)) {
                ans = Math.max(ans, i - map.get(runningSum));
            } else {
                map.put(runningSum, i);
            }
        }
        return ans;
    }
}