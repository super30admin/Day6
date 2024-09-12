from typing import List

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        if nums == None or len(nums) == 0:
            return 0
        map = {}
        map[0] = -1
        result = 0
        rSum = 0
        for i in range(0,len(nums)):
            if nums[i] == 0:
                rSum -= 1
            else:
                rSum += 1
            if rSum in map.keys():
                currLen = i - map[rSum] 
                if currLen >= result:
                    result = currLen
                    start = map[rSum] + 1
                    end = i
                #result = max(result, i - map[rSum])
            else:
                map[rSum] = i
        # Also printing start and end index of longest balanced array
        print(start, end) 
        return result

obj = Solution()
print(obj.findMaxLength([0,1]))
print(obj.findMaxLength([0,1,0]))
print(obj.findMaxLength([1,0,1,0,1,1,1,1,0,0,1,0,1]))


# Time Complexity: O(n)
# Space Complexity: O(n)