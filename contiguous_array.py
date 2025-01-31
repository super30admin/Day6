'''
Time Complexity :
O(n)
Space Complexity : O(n))
Did this code successfully run on Leetcode : yes
Any problem you faced while coding this : No
'''

class Solution(object):
    def findMaxLength(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        n=len(nums)
        result=0
        running_sum=0
        prefix_sum={0:-1}
        for i in range(n):
            if nums[i]==0:
                running_sum-=1
            else:
                running_sum+=1
            if running_sum in prefix_sum:
                    result=max(result,i-prefix_sum[running_sum])
            else:
                prefix_sum[running_sum]=i
                

        return result