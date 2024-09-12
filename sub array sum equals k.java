time complexity: O(n)
space complexity: O(n)

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> prevSum = new HashMap<>();
        int n = nums.length;
 
        int res = 0;
 
        // Sum of elements so far.
        int currsum = 0;
 
        for (int i = 0; i < n; i++) {
 
            // Add current element to sum so far.
            currsum += nums[i];
 
            // If currsum is equal to desired sum, then a new subarray is found. So increase count of subarrays.
            if (currsum == k)
                res++;
 
            // currsum exceeds given sum by currsum - sum. Finding number of subarrays having this sum and exclude those subarrays from currsum by increasing count by same amount.
            if (prevSum.containsKey(currsum - k))
                res += prevSum.get(currsum - k);
 
            // Add currsum value to count of different values of sum.
            Integer count = prevSum.get(currsum);
            if (count == null)
                prevSum.put(currsum, 1);
            else
                prevSum.put(currsum, count + 1);
        }
 
        return res;
    }
}