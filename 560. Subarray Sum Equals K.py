#TC -> 0(n) and SC -> O(n)
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        if nums == None or len(nums) == 0:
            return 0
        rsum = 0
        Map = {}
        Map[0] = 1
        count = 0
        for i in range(len(nums)):
            rsum = rsum + nums[i]
            if Map.get(rsum - k) != None:
                count = count + Map[rsum - k]
            if Map.get(rsum) != None:
                Map[rsum] = Map[rsum] + 1
            else:
                Map[rsum] = 1
        return count
