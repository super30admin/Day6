class Solution:
    def subarraySum(self, nums):
        Max = 0
        rSum = 0
        rDict = {0 : -1}
        for i in range(len(nums)):

            if nums[i] == 0:
                rSum = rSum - 1
            else:
                rSum = rSum + 1

            if rSum in rDict:
                if (Max <  i - rDict[rSum]):
                    Max =  i - rDict[rSum]
                    
            else:
                rDict[rSum] = i
        return Max

    
obj = Solution()
print(obj.subarraySum([1, 0, 1, 1, 0 ,0 ,1, 1, 0, 0]))