//Time Complexity : O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :YES
// Any problem you faced while coding this : NO


class Solution(object):
    def findMaxLength(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if len(nums)==0:
            return 0
        s_map={}
        cnt=0
        start = -1
        end = -1
        maximum=0
        s_map[0]=-1
        for i in range(0,len(nums)):
            if(nums[i]==0):
                cnt=cnt-1
            else:
                cnt=cnt+1
            if cnt not in s_map:
                s_map[cnt]=i
            else:
                maximum=max(maximum,i-s_map[cnt])
                start = s_map[cnt]
                end = i
        if start == -1:
            start = 0
        print(start)
        print(end)             
        return maximum