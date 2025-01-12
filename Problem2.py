#1. Use running sum and add -1 for 0 and +1 for 1. If the indexes match then subtract from the first index and return max value
#TC: O(n)
#SC: O(n)
#Yes, this worked in leetcode


class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        if len(nums) == 0:
            return 0
        maxi = 0
        map = {}
        rsum = 0
        map[rsum] = -1
        for i in range(len(nums)):
            if nums[i] == 0:
                rsum-=1
            elif nums[i] == 1:
                rsum+=1
            if rsum in map:
                maxi = max(maxi, (i-map.get(rsum)))
            else:
                map[rsum] = i
        return maxi