# Hashing-2

Explain your approach in **three sentences only** at top of your code


## Problem1 (https://leetcode.com/problems/subarray-sum-equals-k/)

## Prefix sum and keep adding curr to create ts 
## calculate rq (ts - k) and check if rq present in prefix sum
## if present add prefix[rq] to total_sub
## TC and SC - O(n)

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        prefix_sum = { 0: 1 }
        total_sub = 0
        ts = 0
        curr = 0
        while curr < len(nums):
            ts +=  nums[curr]
            rq = ts - k
            print("curr sum = ", ts)
            if rq in prefix_sum:
                total_sub += prefix_sum[rq]
            if ts in prefix_sum:
                prefix_sum[ts] += 1
            else:
                prefix_sum[ts] = 1
            curr += 1
        return total_sub


        
## Problem2 (https://leetcode.com/problems/contiguous-array/)
## TC SC = O(n) O(n)
## Take sum till index in pre_sum {}
## everytime sum_val == 0 we get the highest len
## if we get sum_val in pre_sum then we drop till that index(curr_indx - dropped till ) 
## take max(max_len till now, curr)

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        pre_sum = { }
        sum_val = 0
        max_len = 0
        
        for i, n in enumerate(nums):
            if n == 1:
                sum_val += 1
            else:
                sum_val -= 1
            
            if sum_val == 0:
                max_len = i + 1
            elif sum_val in pre_sum:
                max_len = max(max_len, i - pre_sum[sum_val])
            else:
                pre_sum[sum_val] = i
        return max_len
## Problem3 (https://leetcode.com/problems/longest-palindrome)

## TC SC - O(n) O(n)
## Use tracker to track count on letter ltr, and lp for longestPalindrome length 
## add 2 to lp whenever element count reaches 2 and tracker[ltr] == 0
## if any elements left where tracker[ltr] != 0  then return lp + 1 else lp
class Solution:
    def longestPalindrome(self, s: str) -> int:
        #print('A' == 'a')
        tracker = {}
        total = len(s)
        lp = 0
        for ltr in s:
            if ltr in tracker: 
                tracker[ltr] += 1
                if tracker[ltr] == 2:
                    lp += 2
                    tracker[ltr] = 0
            else: 
                tracker[ltr] = 1
        #print(lp, tracker)
        for ltr, c in tracker.items():
            if c == 1:
                return lp + 1
        return lp 
