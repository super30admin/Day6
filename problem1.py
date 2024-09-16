#Time Complexity: O(n)
#Space Complexity: O(n)
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        dic = {}
        dic[0] = 1
        rSum = 0
        count = 0
        for i in range(len(nums)):
            rSum += nums[i]
            if rSum-k in dic:
                count += dic[rSum-k]
            if rSum not in dic:
                dic[rSum] = 0
            dic[rSum] += 1
            
        return count
                
            