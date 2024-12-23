# Hashing-2

Explain your approach in **three sentences only** at top of your code


## Problem1 (https://leetcode.com/problems/subarray-sum-equals-k/)
class Solution:
	def subarraySum(self, nums: List[int], k: int) -> int:

		result = 0 
		prefix_sum = 0
		d = {0 : 1}

		for num in nums:
		
			prefix_sum = prefix_sum + num

			if prefix_sum - k in d:
			
				result = result + d[prefix_sum - k]

			if prefix_sum not in d:
			
				d[prefix_sum] = 1
			else:
				d[prefix_sum] = d[prefix_sum] + 1

		return result


## Problem2 (https://leetcode.com/problems/contiguous-array/)
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        mp = {}
        sum_val = 0
        max_len = 0
        for i, num in enumerate(nums):
            sum_val += 1 if num == 1 else -1
            if sum_val == 0:
                max_len = i + 1
            elif sum_val in mp:
                max_len = max(max_len, i - mp[sum_val])
            else:
                mp[sum_val] = i
        return max_len



## Problem3 (https://leetcode.com/problems/longest-palindrome)
class Solution:
    def longestPalindrome(self, s: str) -> int:
        odd_count = 0
        d = {}
        for ch in s:
            if ch in d:
                d[ch] += 1
            else:
                d[ch] = 1
            if d[ch] % 2 == 1:
                odd_count += 1
            else:
                odd_count -= 1
        if odd_count > 1:
            return len(s) - odd_count + 1
        return len(s)
