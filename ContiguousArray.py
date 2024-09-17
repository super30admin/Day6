'''
Time Complexity - O(n) as we are iterating the whole list
Space Complexity - O(n) as we can have n number of keys in the hashmap

'''


class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        hashmap = {}
        rsum = 0
        maxlen = 0
        hashmap = {0: -1}
        for i in range(len(nums)):
            if nums[i] == 0:
                rsum -= 1
            else:
                rsum += 1
            if rsum in hashmap:
                maxlen = max(maxlen, i-hashmap[rsum])
            else:
                hashmap[rsum] = i
        return maxlen
