#Saving running sum and their count in hashmap and checking the difference with target is present in hashmap
#Time is O(n)
#Space is O(n)
#Yes this worked in leetcode

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        if len(nums) == 0:
            return 0
        rsum = 0
        map = {0:1}
        count = 0
        for i in range(len(nums)):
            rsum = rsum+nums[i]
            diff = rsum-k
            if diff in map:
                count = count+map[diff]
            map[rsum] = map.get(rsum,0)+1
        return count