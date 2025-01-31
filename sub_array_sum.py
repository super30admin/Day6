'''
Time Complexity :
O(n)
Space Complexity : O(n))
Did this code successfully run on Leetcode : yes
Any problem you faced while coding this : No
'''

class Solution(object):
    def subarraySum(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        prefix_sum={0:1}
        running_sum=0
        count=0
        n=len(nums)
        for i in range(n):
            running_sum+=nums[i]
            if running_sum-k in prefix_sum:
                count+=prefix_sum[running_sum-k]
            if running_sum not in prefix_sum:
                prefix_sum[running_sum]=0
            prefix_sum[running_sum]+=1

        
        return count
            
        