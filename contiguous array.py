class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        map = {0:-1}
        length = 0
        runningSum = 0
        for i in range(len(nums)):
            if nums[i] == 0:
                runningSum -= 1
            else:
                runningSum += 1
            
            if runningSum in map.keys():
                length = max(length, i - map[runningSum])
            else:
                map[runningSum] = i 
        return length
