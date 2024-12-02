class Solution:
    #TC O(N)
    # SC O(N)
    
    def subarraySum(self, nums: List[int], k: int) -> int:
        if nums == None or len(nums) == 0:
            return 0
        rSum = 0
        cnt = 0
        maps = {}
        maps[0] = 1
        for i,n in enumerate(nums):
            rSum += nums[i]
            diff = rSum - k
            if diff in maps:
                cnt +=  maps[diff]
            if rSum in maps:
                maps[rSum] = maps[rSum] + 1
            else:
                maps[rSum] =  1
        return cnt
