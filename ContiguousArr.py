#Time Complexity: O(n)
#Sapce Complexity : O(n)
#Given a binary array nums, return the maximum length of a contiguous subarray with an equal number of 0 and 1

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        maxSubArr = 0
        sumIndex = {}
        currSum = 0
        sumIndex[0] = -1
        
        for i in  range(len(nums)):
            if nums[i] == 0:
                currSum -= 1
                if currSum in sumIndex:
                    maxSubArr = max(maxSubArr, i - sumIndex[currSum])
                else:
                    sumIndex[currSum] = i
            else:
                currSum += 1
                if currSum in sumIndex:
                    maxSubArr = max(maxSubArr, i - sumIndex[currSum])
                else:
                    sumIndex[currSum] = i
        return maxSubArr
