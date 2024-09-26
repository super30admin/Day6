// Time Complexity : O(n) where n is the length of the array nums
// Space Complexity : O(n) where n is the length of the array nums
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
// store in map rSum : number of occurences of that that
// iter thru arr and if rSum-k is found in map, add to count the mapped value of rSum-k

class subarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        int sum = 0, count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}