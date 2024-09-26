#TimeComplexity:Push=O(N), Pop and Peek = Amortized O(1)
#SpaceComplexity: Space for dictionary 
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : No
#Implement Stack using Array.
class Solution(object):
    def subarraySum(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        Dict={}
        cursum=0
        count=0
        Dict[0]=1
        for i in nums:
            cursum=cursum+i
            compliment=cursum-k
            if(compliment in Dict):
                count=count+Dict.get(compliment)
            else:
                pass
            if cursum not in Dict:
                Dict[cursum]=1
            else:
                Dict[cursum]=Dict[cursum]+1


        return count
