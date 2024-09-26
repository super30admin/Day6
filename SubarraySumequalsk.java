// Time Complexity : O(n) since we have a for loop which checks the complement has already been encountered
// Space Complexity :O(n) +O(n) extra space for key value if all are different
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach

class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int curSum = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1);

        // here curSum[x] defines the sum till the point[x] in the array so we keep on
        // storing as well as checking if we reached a point y
        // such that (x+target=y) ==> x=y-target.. which means we need to search
        // y-target in the hashmap

        for (int i = 0; i < nums.length; i++) {
            // calc this for each index
            curSum += nums[i];

            // see if complement i.e. Cursum -target is present
            if (hm.containsKey(curSum - k))
                // add the number of such complements to count
                count = count + hm.get(curSum - k);

            // increment the counter by 1 by default to 0 or the previous cursum
            hm.put(curSum, hm.getOrDefault(curSum, 0) + 1);
        }

        return count;
    }
}