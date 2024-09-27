# time complexity = O(n)
# space Complexity = O(N)
# All test cases passed in Leetcode

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        presum = {}
        currentSum = 0
        count = 0
        for num in nums:
            currentSum += num
            if currentSum == k:
                count +=1
            count += presum.get(currentSum - k, 0)
            if currentSum in presum:
                presum[currentSum] += 1
            else:
                presum[currentSum] = 1
        return count
    