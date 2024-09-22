class Solution:
    def subarraySum(self, nums, k):
        rSum = 0
        rDict = {0 : 1}
        count = 0
        for i in range(len(nums)):
            rSum = rSum + nums[i]

            if rSum - k in rDict:
                count = count + rDict[rSum - k]

            if rSum in rDict:
                rDict[rSum] += 1
            else:
                rDict[rSum] = 1
        return count


obj = Solution()
print(obj.subarraySum([1, 2, 3], 3))
                
