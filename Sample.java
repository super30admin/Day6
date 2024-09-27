// Subarray sum equals K

class Solution {
    public int subarraySum(int[] nums, int k) {
        if (nums == null || nums.length == 0) return 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        int rSum = 0;
        int count = 0;
        map.put(rSum, 1);

        for (int i = 0; i < nums.length; i++) {
            rSum += nums[i];
            if (map.containsKey(rSum - k)) {
                count += map.get(rSum - k);
            }
            if (map.containsKey(rSum)) {
                map.put (rSum, map.get(rSum) + 1);
            } else {
                map.put (rSum, 1);
            }

        }
        return count;
    }
}

// Contiguous Array

class Solution {
    public int findMaxLength(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        int rSum = 0;
        int max = 0;
        map.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                rSum++;
            } else {
                rSum--;
            }
            if (map.containsKey(rSum)) {
                max = Math.max (max, i - map.get(rSum));
            } else {
                map.put (rSum, i);
            }
        }
        return max;
    }
}

// Longest Palindrome

class Solution {
    public int longestPalindrome(String s) {

        if (s == null || s.length() == 0) return 0;

        HashSet<Character> set = new HashSet<>();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (set.contains(ch)) {
                count += 2;
                set.remove(ch);
            } else {
                set.add(ch);
            }
        }

        if (!set.isEmpty()) count++;

        return count;
    }
}

