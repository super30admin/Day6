class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        count = 0
        sums = 0
        leftSum = {sums : 1}
        for i in nums:
            sums = sums+i
            if sums-k in leftSum:
                count += leftSum[sums-k]
            if sums in leftSum:
                leftSum[sums] += 1
            else:
                leftSum[sums] =1
        return count

        
