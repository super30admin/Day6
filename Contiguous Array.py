class Solution:
    def findMaxLength(self, nums: List[int]) -> int:

        if nums == None or len(nums) == 0:
            return 0

        map ={}
        Max = 0
        rsum = 0
        map[0] = -1

        for i in range(len(nums)):
            if nums[i] == 0:
                rsum = rsum -1
            elif nums[i] == 1:
                rsum = rsum +1
            if rsum not in map:
                map[rsum] = i
            else:
                Max = max(Max, i - map[rsum])    
        return Max            

        