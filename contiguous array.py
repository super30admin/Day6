'''
Time Complexity : O(n), where n is the length of the nums
Space Complexity : O(n), where n is the length of the nums
Successfully executed all the test cases
'''


class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        temp = {0:-1}
        rsum = 0
        max_rsum = 0
        for ind,ele in enumerate(nums):
            if ele == 1:
                rsum += 1
            else:
                rsum -= 1
            if rsum in temp:
                max_rsum = max(max_rsum,ind-temp[rsum])
            else:
                temp[rsum] = ind
        return max_rsum