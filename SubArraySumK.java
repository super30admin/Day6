/**
Problem: Find the number of contiguous subarrays whose sum equals k

Time Complexity: O(n), where n is the length of the array
Space Complexity: O(n), where n is the length of the array. (In worst case, all the cumulative sums can be unique)
Did this code successfully run on Leetcode : Yes

Approach : Use cumulative sums upto the current element in the array and place them in HashMap
1. Calculate the cumulative sum.
2. If the cumulativeSum already exists in the hashmap, then update the count of how many times we found the same cumulative sum.
3. Here, we must also check whether cumulativeSum-k already exists in the hashmap, because cumulativeSum - (cumulativeSum - k) = k
which is the sum of the subarray needed, hence we update the value of the number of contiguous sub arrays whose sum=k.

*/

class Solution {
    public int subarraySum(int[] nums, int k) {
        int numContSubArrs = 0;
        int cumulativeSum = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0,1);
        for(int i=0; i<nums.length;i++){
            cumulativeSum += nums[i];
            if(hm.containsKey(cumulativeSum)) {
                int count = hm.get(cumulativeSum);
                hm.put(cumulativeSum, ++count);
            }
            else
                hm.put(cumulativeSum, 1); //if cumulativeSum isn't in the hashmap by now, place it in the Hashmap and update the value to 1, because we found it now.

            if(hm.containsKey(cumulativeSum-k)) {
                numContSubArrs += hm.get(cumulativeSum-k);
            }
        }
        return numContSubArrs;
    }
}