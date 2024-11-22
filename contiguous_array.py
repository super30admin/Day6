# Base case: If one length array then its invalid as asked in question
# Idea is to user prefix sum, we will maintain array (sort of prefix sum) such that if we encounter 0 we add and we encounter 1 we subtract
# This way whenever we encounter the value again at an index i (same prefix sum as some index j) that means j - i array has same equal number of ones and zeroes hence they got cancelled out and
# lead to the same sum again
# Time Complexity: O(n)
# Space Complexity: O(b)
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        prefix_sums = [0 for i in range(len(nums))]
        cum_sum = 0
        if nums[0] == 0:
            prefix_sums[0] =1
        else:
            prefix_sums[0] =-1
        for i in range(1,len(nums)):
            if nums[i] == 0:
                prefix_sums[i] = prefix_sums[i-1] +1
            else:
                prefix_sums[i] = prefix_sums[i-1] -1
        hmap = {0:-1}
        output = 0
        for index in range(len(prefix_sums)):
            if prefix_sums[index] in hmap.keys():
                output = max(output,index-hmap[prefix_sums[index]])
            else:
                hmap[prefix_sums[index]] = index
        return output