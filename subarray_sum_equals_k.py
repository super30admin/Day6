# O(N) TIME AND O(N) SPACE WHERE N IS LEN(NUMS)
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        sums = {0:1}
        currentSum = 0
        count = 0
        for num in nums:
            currentSum += num
            if currentSum-k in sums:
                count += sums[currentSum-k]
            if currentSum not in sums:    
                sums[currentSum] = 0
            sums[currentSum] += 1
        return count