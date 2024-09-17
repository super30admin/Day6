'''
Time Complexity - O(n) as we are iterating the whole list
Space Complexity - O(n) as we can have n number of keys in the hashmap

'''


class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        hashmap = {0: 1}
        rsum = 0
        count = 0
        for i in range(len(nums)):
            rsum += nums[i]
            if (rsum-k) in hashmap:
                count += hashmap[rsum-k]
            if rsum not in hashmap:
                hashmap[rsum] = 1
            else:
                hashmap[rsum] += 1
        return count
