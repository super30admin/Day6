# Hashing-2

Explain your approach in **three sentences only** at top of your code


## Problem1 (https://leetcode.com/problems/subarray-sum-equals-k/)

## Time Complexity: O(N)
## Space Complexity: O(N)

class Solution {
public int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> computedSum = new HashMap<>();
        computedSum.put(0, 1);
        
        int count = 0, curSum = 0;
        
        for(int i = 0; i < nums.length; i++) {
            
            curSum += nums[i];
            
            if(computedSum.containsKey(curSum - k)) {
                count += computedSum.get(curSum - k);
            }
            // If we see the curSum for the first time then we add 0 as it's value
            // If we encounter the curSum again we add 1
            computedSum.put(curSum, computedSum.getOrDefault(curSum, 0) + 1);
        }
        
        return count;
    }
}

## Problem2 (https://leetcode.com/problems/contiguous-array/)

## Time Complexity: O(N)
## Space Complexity: O(N)

class Solution {
public int findMaxLength(int[] nums) {

        if(nums.length == 0) return 0;

        // running Sum rSum : earliest index
        HashMap<Integer, Integer> runningSumMap = new HashMap<>();
        // edge case, assume imaginary index -1 we will store running sum as 0
        // ex. [0, 1, 0, 1]
        runningSumMap.put(0, -1);

        int rSum = 0, length = 0;
        for(int i = 0; i < nums.length; i++) {

            if(nums[i] == 0) {
                rSum--;
            } else {
                rSum++;
            }

            if(runningSumMap.containsKey(rSum)) {
                length = Math.max(length, i - runningSumMap.get(rSum));
            } else {
                runningSumMap.put(rSum, i);
            }
        }

        return length;
    }
}

## Problem3 (https://leetcode.com/problems/longest-palindrome)

## Time Complexity: O(N)
## Space Complexity: O(N)
class Solution {
public int longestPalindrome(String s) {

        Map<Character, Integer> palindromeMap = new HashMap<>(); 
        int count = 0;

        for(int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            if(palindromeMap.containsKey(c)) {
                palindromeMap.remove(c);
                count += 2;
            } else {
                palindromeMap.put(c, 1);
            }
        }

        if(palindromeMap.size() > 0) {
            return count + 1;
        } 
        return count;
    }
}