# Hashing-2
## Problem1 (https://leetcode.com/problems/subarray-sum-equals-k/)
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        if nums == None or len(nums) ==0:
            return 0
        count = 0
        rSum = 0
        Map ={}
        Map[0] = 1
        for i in range(len(nums)):
            rSum = rSum + nums[i]
            if Map.get(rSum -k) != None:
                count = count + Map[rSum - k]
            if Map.get(rSum) != None:
                Map[rSum] = Map[rSum] +1
            else:
                Map[rSum] = 1
        return count
            
#TC = O(n), SC= O(n)

## Problem2 (https://leetcode.com/problems/contiguous-array/)
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        if nums == None or len(nums) == 0:
            return 0
        rSum = 0
        Map ={}
        Map[0] = -1
        Max = 0
        for i in range(len(nums)):
            if nums[i] == 0:
                rSum = rSum - 1
            else:
                rSum = rSum + 1
            if Map.get(rSum) != None:
                Max = max(Max, i - Map[rSum])
            else:
                Map[rSum] = i
        return Max
#TC = O(n), SC= O(n)

## Problem3 (https://leetcode.com/problems/longest-palindrome)

class Solution:
    def longestPalindrome(self, s: str) -> int:
        if s == None or len(s) ==0:
            return 0
        count = 0
        myset = set()
        for i in range(len(s)):
            c = s[i]
            if c in myset:
                count = count + 2
                myset.remove(c)
            else:
                myset.add(c)
        if myset:
            count = count +1
        return count
#TC = O(n), SC = O(n)