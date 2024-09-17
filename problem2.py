'''
525. Contiguous Array
TIME COMPLEXITY: O(N)
SPACE COMPLEXITY: O(1) to O(N)
LEETCODE: Yes
DIFFICULTY: A bit. Anyway, I solved it after the class.
'''


class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        n = len(nums)
        
        if n == 1:
            return 0
        
        res = 0 # length of contiguous array
        m = {} # sum: index
        
        # dummy variable logic
        if nums[0] == 1:
            m = {0: -1}
        else:
            m = {1: -1}
        
        # Setting up the initial sum
        s = nums[0]
        m[s] = 0
        
        for i in range(1, n):
            if nums[i] == 1:
                s += 1
            else:
                s -= 1
            if s in m.keys():
                res = max(res, i - m[s])
            else:
                m[s] = i
        return res
     
