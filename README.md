# Hashing-2

Explain your approach in **three sentences only** at top of your code


## Problem1 (https://leetcode.com/problems/subarray-sum-equals-k/)
# Time Complexity=O(n)
# Space Complexity=O(n)
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        h={}
        s=0
        c=0
        h[0]=1
        for i in nums:
            s+=i
            if s-k in h:
                c+=h.get(s-k)
            h[s]=h.get(s,0)+1
        return c
            
            


## Problem2 (https://leetcode.com/problems/contiguous-array/)
# Time Complexity=O(n)
# Space Complexity=O(n)
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        h={}
        s=0
        h[0]=-1
        m=0
        for i in range(len(nums)):
            if nums[i]==0:
                s+=-1
            else:
                s+=1
            if s not in h:
                h[s]=i
            else:
                m=max(m,i-h[s])
        return m
                

## Problem3 (https://leetcode.com/problems/longest-palindrome)
# Time Complexity=O(n)
# Space Complexity=O(n)
class Solution:
    def longestPalindrome(self, s: str) -> int:
        a=[]
        c=0
        for i in s:
            if i in a:
                c+=2
                a.remove(i)
            else:
                a.append(i)
        if len(a)==0:
            return c
        else:
            return c+1
