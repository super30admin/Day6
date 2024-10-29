class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        map = {0:1}
        runningSum = 0
        count = 0
        for num in nums:
            runningSum += num
            if runningSum - k in map.keys():
                count += map[runningSum - k]
            
            if runningSum not in map.keys():
                map[runningSum] = 1
            else:
                map[runningSum] += 1
        return count
