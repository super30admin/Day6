# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


#mapping 0 -> -1 and 1 -> 1 and maintaining current values such that
# keeping track previous same number
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        if len(nums) == 0:
            return 0
        a = {}
        currMax = 0
        currVal = 0
        for i in range(len(nums)):
            currVal = currVal - 1 if nums[i] == 0 else currVal + 1
            if currVal == 0:
                currMax = max(currMax,i+1)
            if currVal in a:
                currMax = max(currMax,i-a[currVal])
            else:
                a[currVal] = i
        return currMax