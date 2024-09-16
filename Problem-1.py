
# Subarray Sum Equals K
'''
Leetcode all test cases passed: Yes
Solution:
    subarraySum(self,nums,k):
        n is no of elements in nums
        Space Complexity: O(n)
        Time Complexity: O(n)
'''

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        count = 0
        hashMap = {0:1}
        running_sum = 0
        
        for num in nums:
            running_sum += num
            if running_sum - k in hashMap:
                count += hashMap[running_sum - k]
            if running_sum in hashMap:
                hashMap[running_sum] += 1
            else:
                hashMap[running_sum] = 1
        return count
