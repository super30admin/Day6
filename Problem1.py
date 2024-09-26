# Time Complexity: O(N)
# Space Complexity: O(1)
# Leetcode all test cases passed: Yes
# Any difficulties: No

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        sum_ = 0
        count = 0
        dic = {}
        for i in nums:
            sum_ += i
            if sum_ == k:
                count += 1                  
            if sum_ - k in dic:             
                count += dic[sum_ - k]
            if sum_ not in dic:
                dic[sum_] = 1
            else:
                dic[sum_] += 1
        return count
