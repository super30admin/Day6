
# Contiguous Array
'''
Leetcode all test cases passed: Yes
Solution:
    findMaxLength(self,nums):
        n is no of elements in nums
        Space Complexity: O(n)
        Time Complexity: O(n)
'''

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        max_len = 0
        hashMap = {0:-1}
        running_sum = 0
        
        for idx,num in enumerate(nums):
            if num == 0:
                running_sum += -1
            else:
                running_sum += +1
            if running_sum in hashMap:
                max_len = max(idx - hashMap[running_sum],max_len)
            else:
                hashMap[running_sum] = idx
        return max_len
