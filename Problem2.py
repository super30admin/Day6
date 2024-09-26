class Solution(object):
    def findMaxLength(self, nums):
        n = len(nums)
        if n == 0:
            return 0
        
        mymap = {}
        ans = 0
        csum = 0
        for index in range(n):
            if nums[index] == 1:
                csum +=1
            else:
                csum -=1
            
            if csum ==0:
                ans = max(ans,(index+1))
            elif csum not in mymap:
                mymap[csum] = index
            else:
                ans = max(ans,index - mymap[csum])
        return ans
        """
        :type nums: List[int]
        :rtype: int
        """
        