#TC = O(n) and SC = O(n)
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        if nums == None or len(nums) == 0:
            return 0
        rsum = 0
        Map = {}
        Map[0] = -1
        Max = 0
        for i in range(len(nums)):
            if nums[i] == 0:
                rsum = rsum -1
            else:
                rsum = rsum +1
            if Map.get(rsum) != None:
                Max = max(Max, i - Map[rsum])
            else:
                Map[rsum] = i
        return Max
