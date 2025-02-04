# Hashing-2

Explain your approach in **three sentences only** at top of your code


## Problem1 (https://leetcode.com/problems/subarray-sum-equals-k/)

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        dict={}
        dict[0]=1
        n = len(nums)
        count=0
        runningsum =0
        for index,num in enumerate(nums):
            runningsum += num
            p = runningsum - k
            if p in dict:
                count += dict[runningsum - k]
            if runningsum not in dict:
                dict[runningsum]=1
            else:
                dict[runningsum] = dict[runningsum]+1
        return count

## Problem2 (https://leetcode.com/problems/contiguous-array/)

class Solution:
    def findMaxLength(self, nums):
        if (nums == None or len(nums) <= 0):
            return 0

        maxLength = 0
        firstOccurences = {}
        firstOccurences[0] = -1
        runningSum = 0

        for i, num in enumerate(nums):
            runningSum = runningSum - 1 if num == 0 else runningSum + 1
            if (runningSum not in firstOccurences):
                firstOccurences[runningSum] = i
            else:
                maxLength = max(maxLength, i - firstOccurences[runningSum])

        return maxLength


        

## Problem3 (https://leetcode.com/problems/longest-palindrome)

class Solution:
    def longestPalindrome(self, s: str) -> int:
        Set = set()
        count = 0
        for char in s:
            if char in Set:
                count += 2
                Set.remove(char)
            else:
                Set.add(char)
        
        if len(Set) != 0:
            return count + 1
        
        return count


        
