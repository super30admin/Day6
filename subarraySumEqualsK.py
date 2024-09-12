#Time Complexity: O(n)
#Space Complexity: O(n) 
#Did it run on leetcode: Yes

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        precalSum = {}
        currentSum = 0
        count = 0
        for num in nums:
            currentSum += num
            if currentSum == k:
                count +=1
            #if currentSum - k in precalSum:
            count += precalSum.get(currentSum - k, 0)
            if currentSum in precalSum:
                precalSum[currentSum] += 1
            else:
                precalSum[currentSum] = 1
        return count