# Time complexity : 0(n)
# Space Complexity : 0(1)
class Solution(object):
    def subarraySum(self, nums, k):
        
        count = 0
        n = len(nums)
        if n == 0 and k!=0:
            return 0
        
        mymap = {}
        
        csum = 0
        index = 0
        for index in range(n):
            csum +=nums[index]
            s = csum - k 
            if s in mymap:
                count += mymap[s]
            if csum in mymap:
                mymap[csum]+=1
            else:
                mymap[csum] = 1
            if csum == k:
                count = count + 1
           
        return count

       
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        