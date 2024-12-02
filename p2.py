# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this :


#  Your code here along with comments explaining your approach

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:

        if len(nums) == 0:
            return 0

        c = 0
        for i in range(len(nums)):
            if nums[i] == 0:
                c -= 1
                nums[i] = c
            else:
                c += 1
                nums[i] = c

        if c == 0:
            return len(nums)

        maxLength = 0
        firstOccurrenceDict = dict()

        firstOccurrenceDict[0] = -1

        for i in range(len(nums)):
            if nums[i] in firstOccurrenceDict:

                maxLength = max(i - firstOccurrenceDict[nums[i]], maxLength)
            else:
                firstOccurrenceDict[nums[i]] = i

        return maxLength
