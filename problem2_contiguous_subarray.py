#First solution: Brute force approach
# Time exceeded in Leetcode 

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        max_length = 0
        table = {}
        n = len(nums)
        while n > 0:
            table[0] = nums.count(0)
            table[1] = nums.count(1)
            if table[0] == table[1]:
                max_length = table[0] + table[1]
            else:
                nums.pop()
                n = n-1
        return max_length