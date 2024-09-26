#TimeComplexity:O(N)
#SpaceComplexity: Space for dictionary 
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : No

class Solution(object):
    def findMaxLength(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        Max=0
        Dict={}
        Dict[0]=-1
        count=0
        start=0
        for i in range(len(nums)):
            if nums[i]==1:
                count+=1
            else:
                count-=1
            if count in Dict:
                end=i
                start=Dict[count]
                
                Max=max(end-start,Max)
            else:
                Dict[count]=i
        return Max
