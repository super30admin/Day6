# Hashing-2

Explain your approach in **three sentences only** at top of your code


## Problem1 (https://leetcode.com/problems/subarray-sum-equals-k/)


## Solution 1
## Time Complexity:O(n) Space Complexity:O(n)
## I have used Hashmap here to get the running sum and by subtracting with the target we get the value which is already present in the hashmap.
## If the value exists the frequency gives us the number of subarrays that can be formed in the ranges.


class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int rSum=0,count=0;
        map.put(0,1);
        
        for(int i=0;i<nums.length;i++)
        {
            rSum+=nums[i];
            int c=rSum-k;
            if(map.containsKey(c))
            count+=map.get(c);

            map.put(rSum,map.getOrDefault(rSum,0)+1);
        }

        return count;

    }
}

## Problem2 (https://leetcode.com/problems/contiguous-array/)
## Solution 2:
## Time Complexity:O(n) and Space Complexity:O(n)
## We store the initial occurences of the running Sum as the index, if the running sum repeats the length is stored.
## The length is updated as the difference increases hence larger will be the array.

class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int rSum=0;
        int length=0;

        map.put(0,-1);

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0) rSum--;
            else rSum++;

            if(map.containsKey(rSum))
            {
                length=Math.max(length,i-map.get(rSum));
            }
            else{
                map.put(rSum,i);
            }
        }
        return length;
    }
}

## Problem3 (https://leetcode.com/problems/longest-palindrome)
## Solution 3:
## TimeComplexity:O(n) Space Complexity :O(1)
## We find the character allocate them the index and if it is even we empty it and increment the count.
## In the end the odd characters are checked and if any exists the count is incremented by 1.

class Solution {
    public int longestPalindrome(String s) {

        char[] set =new char[65];
        int count=0;
        for(char c:s.toCharArray()){
            if(set[c-'A']!=0)
            {   count+=2;
                set[c-'A']=0;
               
            }

            else{
                set[c-'A']=c;
                
            }
        }
        if(count<s.length())
        {
            return count+1;
        }
        else return count;
    }   
}