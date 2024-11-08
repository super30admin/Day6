#TC:O(n) #Running Sum
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        if nums is None or len(nums) == 0:
            return 0

        rsum = 0
        dic = {0: 1}   
        count = 0

        for i, val in enumerate(nums):
            rsum = rsum + val
            netVal = rsum - k
            if netVal in dic:
                count = count + dic[netVal]
            if rsum in dic:
                dic[rsum] += 1
            else:
                dic[rsum] = 1 

        return count
