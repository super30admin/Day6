# Hashing-2

Explain your approach in **three sentences only** at top of your code


## Problem1 (https://leetcode.com/problems/subarray-sum-equals-k/)

class Solution {

   public int subarraySum(int[] nums, int k) {

       HashMap<Integer, Integer> map = new HashMap<>();

       int currentSum = 0;

       int count = 0;

       map.put(0,1);

       for(int i = 0; i < nums.length; i++){

           currentSum += nums[i];

           if(map.containsKey(currentSum - k)){

               count += map.get(currentSum-k);

           }

           if(map.containsKey(currentSum)){

               int newCount = map.get(currentSum);

               newCount++;

               map.put(currentSum,newCount);

           } else {

                map.put(currentSum,1);

           }

       }

       return count;

   }

}
## Problem2 (https://leetcode.com/problems/contiguous-array/)
 public class Solution {

   public int findMaxLength(int[] nums) {

       Map<Integer, Integer> map = new HashMap<>();

       int max = 0;

       int zero = 0;

       for (int i = 0; i < nums.length; i++) {

           if (nums[i] == 0) zero++;

           else zero--;

           if (zero == 0) max = i + 1;

           if (!map.containsKey(zero)) map.put(zero, i);

           else max = Math.max(max, i - map.get(zero));

       }

       return max;

   }

}
## Problem3 (https://leetcode.com/problems/longest-palindrome)
class Solution {

   public int longestPalindrome(String s) {

      HashSet <Character> set = new HashSet<>();

       int count = 0;

       for(int i = 0; i < s.length(); i++){

           char c =  s.charAt(i);

           if(set.contains(c)){

               set.remove(c);

               count += 2;

           } else {

               set.add(c);

           }

       }

       if(!set.isEmpty()){

           count++;

       }

       return count;

   }

}