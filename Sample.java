//Problem 1: https://leetcode.com/problems/subarray-sum-equals-k/description/
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach: I used a hashmap to store the running sum and the number of times it has occured. I used a variable count to keep track of the number of subarrays that have sum equal to k. I used a variable rsum to keep track of the running sum. I used a variable comp to store the complement of the running sum and k. If the complement is present in the hashmap, I increment the count by the value of the complement in the hashmap. I then add the running sum to the hashmap with a value of 1 if it is not already present. If it is present, I increment the value by 1. I return the count at the end.
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int rsum = 0;
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            rsum += nums[i];
            int comp = rsum - k;
            if (map.containsKey(comp)) {
                count += map.get(comp);
            }
            map.put(rsum, map.getOrDefault(rsum, 0) + 1);
        }
        return count;
    }
}

// Problem 2: https://leetcode.com/problems/contiguous-array/description/
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach: I used a hashmap
// to store the running sum and the index at which it occured. I used a variable
// max to store the maximum length of the subarray. I used a variable rsum to
// store the running sum. I used a hashmap to store the running sum and the
// index at which it occured. I added 0,-1 to the hashmap initially. I then
// iterated through the array and incremented the running sum by 1 if the number
// is 1 and decremented it by 1 if the number is 0. If the running sum is
// present in the hashmap, I update the max variable with the maximum of the
// current max and the difference between the current index and the index at
// which the running sum occured. If the running sum is not present in the
// hashmap, I add it to the hashmap with the current index as the value. I
// return the max at the end.
class Solution {
    public int findMaxLength(int[] nums) {
        int max = 0;
        if (nums == null || nums.length == 0) {
            return max;
        }
        int rsum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            rsum = nums[i] == 0 ? rsum - 1 : rsum + 1;
            if (map.containsKey(rsum)) {
                max = Math.max(max, i - map.get(rsum));
            } else {
                map.put(rsum, i);
            }
        }
        return max;
    }
}

// Problem 3:
// https://leetcode.com/problems/longest-palindromic-substring/description/
// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Your code here along with comments explaining your approach: It calculates
// the length of the longest palindrome that can be formed from the characters
// in the input string. It counts the frequency of each character and adds the
// largest even count for each character (or the largest even count minus one if
// the count is odd) to the total length. If any character has an odd count, it
// sets a flag hasOdd to true. Finally, if there is at least one character with
// an odd count, it adds one to the total length before returning it.
class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[60];
        for (char c : s.toCharArray()) {
            count[c - 'A']++;
        }
        boolean hasOdd = false;
        int total = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] % 2 == 0) {
                total += count[i];
            } else {
                total += count[i] - 1;
                hasOdd = true;
            }
        }
        if (hasOdd) {
            total += 1;
        }
        return total;
    }
}