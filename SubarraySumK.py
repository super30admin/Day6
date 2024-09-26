"""
Time Complexity : O(n)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No
"""
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        count = 0
        runningSum = 0
        mainDict = {0:1}
        if len(nums) == 0:
            return 0
        else:
            for num in nums:
                # Calculating the cummulative sum
                runningSum += num
                # Check if diff exists in the map increment count
                if (runningSum - k) in mainDict:
                    count += mainDict[runningSum - k]
                # If i already have the key in map update value
                if runningSum in mainDict:
                    mainDict[runningSum] += 1
                # If i don't have it in my map add it
                else:
                    mainDict[runningSum] = 1
            return count