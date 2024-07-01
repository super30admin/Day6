"""
Time Complexity: O(n)
Spaace Complexity: O(n)
"""

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        hMap = {0:1}
        count = 0
        rSum = 0


        for i in range(len(nums)):
            rSum += nums[i]
            if(hMap.__contains__(rSum - k)):
                count += hMap[rSum - k]

            if hMap.__contains__(rSum):
                l = hMap[rSum] + 1
                hMap[rSum] = l
                
            else:
                hMap[rSum] = 1
                
                

        return count

        