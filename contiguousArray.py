# Leetcode 525. Contiguous Array

# Time Complexity :  O(n) where n is the size of the array

# Space Complexity : O(n) where n is the size of the array.

# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Approach: Use a hashtable to store cummulative sum and its index for every item. Let the target be zero.
# If them item is 0 remove 1 from cummlative else add 1.If cummaltive-k is in the hashmap compare the length of
# sub array between that point and the current index with the global max_length. Return max length

# Your code here along with comments explaining your approach

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        hashmap = dict()
        # Condition to check at evry step if the cummulative at that point is in hashmap is index - hashmap[cummulative-k]
        # as it gives us the length of that sub array then we can compare it with max_length
        k = 0
        max_length = 0
        cummulative = 0
        hashmap[0] = -1

        for i in range(len(nums)):
            if nums[i] == 0:
                cummulative -= 1
            else:
                cummulative += 1

            if (cummulative-k) in hashmap:
                arr_length = i-hashmap[cummulative-k]
                max_length = max(max_length, arr_length)

            if cummulative not in hashmap:
                hashmap[cummulative] = i

        return max_length
