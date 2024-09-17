# Hashing-2

Explain your approach in **three sentences only** at top of your code


## Problem1 (https://leetcode.com/problems/subarray-sum-equals-k/)
// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : If we add the new running sum to the map before checking for the rsum-k key, some test cases fail 


// Your code here along with comments explaining your approach
class Solution {
    public int subarraySum(int[] nums, int k) {

        int countSubarray =0;
        int runningSum =0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0,1);
        for(int i=0; i< nums.length; i++)
        {
            runningSum+= nums[i];
            
            if(map.containsKey(runningSum-k))
            {
                countSubarray+= map.get(runningSum-k);
            }
            
           if(!map.containsKey(runningSum))
           {
               map.put(runningSum, 0);
           }
            map.put(runningSum, map.get(runningSum)+1);

           
        }
        
        return countSubarray;
    }
}

## Problem2 (https://leetcode.com/problems/contiguous-array/)
// Time Complexity : O(N)
// Space Complexity :O(N)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : Got an array index exception when I tried to do map.get(runningSumOfElements )- i on line 70  -> index i is actually bigger than the index where the previous index of the same rSum


// Your code here along with comments explaining your approach
class Solution {
    public int findMaxLength(int[] nums) {
        HashMap <Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0, -1);
        int runningSumOfElements = 0;
        int maxLength =0;
        for(int i=0; i< nums.length; i++)
        {
            if(nums[i] == 0)
            {
                runningSumOfElements--; 
            }
            else
            {
                runningSumOfElements++;
            }
            
            if(!map.containsKey(runningSumOfElements))
            {
                map.put(runningSumOfElements, i);
            }
            
            maxLength = Math.max( i- map.get(runningSumOfElements), maxLength);
            
        }
        
        return maxLength;
        
    }
}

## Problem3 (https://leetcode.com/problems/longest-palindrome)
// Time Complexity :O(N), single pass solution
// Space Complexity : O(1) - only 26 characters can be added to Hashset 
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : N/a


// Your code here along with comments explaining your approach
class Solution {
    HashSet<Character> set ;
    public int longestPalindrome(String s) {
        set = new HashSet<>();
        int longestPalindrome =0;
        for ( char c: s.toCharArray())
        {
            if(set.contains(c))
            {
                longestPalindrome += 2 ;
                set.remove(c);
            }
            else
            {
                set.add(c);
            }
        }
        
        if (!set.isEmpty()) return (longestPalindrome+1);
        else return longestPalindrome;
    }
}