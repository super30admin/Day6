'''
Approach: Iterate over the list and add 1 to running sum if element is 1 else decrement running sum by 1. If running sum is present in the dictionary, compare the current maximum with present index - last index with same running sum. If present maximum is less, replace it with the distance between present index and last index which have same running sum. Return maximum in the end.

Time complexity: O(n)
Space complexity: O(n)

Passes all testcases in leetcode

'''

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        x = {}
        x[0] = -1
        rs = 0
        maxim = 0
        for i in range(len(nums)):
            if nums[i] == 1: 
                rs+=1
            else:
                rs-=1
            if rs in x:
                maxim = max(maxim, i-x[rs])
            else:
                x[rs] = i
        return maxim
        
        
        
