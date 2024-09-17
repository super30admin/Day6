'''
Implementation: 
Use of formula: sum[i,j] = sum[0,j] - sum[0,i-1]

Time complexity: O(n)
Space complexity: O(n)
'''

class Solution(object):
    def subarraySum(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        sum = 0
        count = 0
        d = {}
        d[0] = 1
        for i in range(len(nums)):
            sum += nums[i]
            count += d.get(sum-k,0)
            d[sum] = d.get(sum,0) + 1
        return count
        
        '''
        Aproach 2 - Discussed in class
        current_sum = 0
        count = 0
        d = {}
        d[0] = 1
        for i in range(len(nums)):
            current_sum += nums[i]
            compliment = current_sum - k
            if d.get(compliment):
                count += d.get(compliment)
            if d.get(current_sum):
                d[current_sum] += 1
            else:
                d[current_sum] = 1
        '''