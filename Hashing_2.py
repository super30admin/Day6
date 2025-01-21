
## Problem1 (https://leetcode.com/problems/subarray-sum-equals-k/)
#explaination- This code counts how many subarrays sum up to k. 
# It uses a running sum (rSum) to keep track of the sum of elements so far and a hashmap to store how often each sum occurs. 
# Whenever the difference between the current sum and k is found in the hashmap, it means a subarray summing to k exists, 
# and the count is updated.

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        if nums == None or len(nums) == 0:
            return 0
        count = 0
        Map = {}
        Map[0] = 1
        rSum = 0
        for i in range(len(nums)):
            rSum = rSum + nums[i]
            if rSum -k in Map:
                count = count + Map[rSum -k]
            if rSum in Map:
                Map[rSum] = Map[rSum] +1
            else:
                Map[rSum] = 1
        return count


## Problem2 (https://leetcode.com/problems/contiguous-array/)
#explaination-In this code, I convert 0s in the array to -1s so that finding a subarray with an equal number of 0s and 1s
#  becomes equivalent to finding a subarray with a sum of 0. 
# I use a hashmap to track the first occurrence of each running sum as I traverse the array. 
# Whenever I encounter the same running sum again, I calculate the length of the subarray and update the maximum length
#  if it's longer than the current maximum.
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        # Replace 0s with -1 to treat the problem as finding subarrays with sum 0
        count_map = {0: -1}  # Initialize with sum 0 at index -1
        max_length = 0
        rSum = 0

        for i, num in enumerate(nums):
            # Update running sum
            rSum += -1 if num == 0 else 1

            if rSum in count_map:
                # If rSum has been seen before, calculate the subarray length
                max_length = max(max_length, i - count_map[rSum])
            else:
                # Store the first occurrence of this rSum
                count_map[rSum] = i

        return max_length


## Problem3 (https://leetcode.com/problems/longest-palindrome)
#explaination-I use a set to track characters that haven't formed a pair yet.
# As I go through the string, if a character is already in the set, I know it can form a pair, so I add 2 to the count and remove it from the set.
# If a character isn't in the set, I add it to track it for pairing later.
# After finishing the string, if there are any unmatched characters left in the set, I add 1 to the count for the middle of the palindrome.
# I return the total count as the length of the longest palindrome.
class Solution:
    def longestPalindrome(self, s: str) -> int:
        if s == None or len(s) == 0:
            return 0
        count = 0 
        myset = set()
        for i in range(len(s)):
            c = s[i]
            if c in myset:
                count = count +2
                myset.remove(c)
            else:
                myset.add(c)
        if myset:
            count = count + 1
        return count