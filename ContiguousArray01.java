/**
Problem: Find the maximum length of contiguous subarray with equal number of 0's and 1's.

Time Complexity: O(n), where n is the length of the array
Space Complexity: O(n), where n is the length of the array.
Did this code successfully run on Leetcode : Yes

Approach : Use Hashmap.
1. When you encounter a 1, add 1 to the existing sum, when you encounter a 0, subtract 1 from the existing sum.
2. If the sum is 0, that means there's an equal number of 0's and 1's.
3. The sum will be the keys in the hashmap and the index would be the value.
4. If the hashmap already contains the current sum, then the max length of contiguous subarray would be maximum of the current maxLength or the value of current index minus index of the key (sum) already present in the hashmap

*/

class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int maxLength = 0;
        int sum = 0;
        for(int i = 0; i<nums.length;i++) {
            if(nums[i] == 1) 
                sum++;
            if(nums[i] == 0)
                sum--;
            if(sum == 0) {
                maxLength = i + 1;
            }
            if(!hm.containsKey(sum))
                hm.put(sum, i);
            else
                maxLength = Math.max(maxLength, i-hm.get(sum));
        }
        return maxLength;
    }
}