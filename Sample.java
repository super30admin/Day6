// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach

//Problem: 1 Subarray Sum
//Time Complexity:O(n)
//Space Complexity:O(n)

class Solution {
    public int subarraySum(int[] nums, int k) {
        if (nums == null || nums.length == 0)
            return 0;
        HashMap<Integer, Integer> m = new HashMap<>();
        int rSum = 0;
        int count = 0;
        m.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            rSum = rSum + nums[i];

            if (m.containsKey(rSum - k)) {
                count = count + m.get(rSum - k);
            }
            m.put(rSum, m.getOrDefault(rSum, 0) + 1);
        }
        return count;
    }

}

// Problem:2 Contiguous Arra
// TC O(n)
// SC O(n)

class Solution {
    public int findMaxLength(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        HashMap<Integer, Integer> m = new HashMap<>();
        int max = 0;
        int count = 0;
        m.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count--;
            } else {
                count++;
            }

            if (m.containsKey(count)) {
                max = Math.max(max, i - m.get(count));
            } else {
                m.put(count, i);
            }
        }
        return max;
    }
}

// Problem:3 Longest palindrome
// Time Complexity O(1)
// Space Complexity O(n)

class Solution {
    public int longestPalindrome(String s) {

        if (s == null || s.length() == 0)
            return 0;

        HashSet<Character> set = new HashSet<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (set.contains(c)) {
                count = count + 2;
                set.remove(c);
            } else {
                set.add(c);
            }

        }

        if (!set.isEmpty()) {
            count++;

        }

        return count;

    }

}