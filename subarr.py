#Time Complexity : O(n)
# Space Complexity :O(n)
#Did this code successfully run on Leetcode :Yes
# Any problem you faced while coding this :No


class Solution(object):
    def subarraySum(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        count  =0 
        tempSum =0
        arrDict = {0:1} #initializing the dictionary with 0,1 key, value pair to increment count whem we find the difference=0 again.
        
        for i in nums:
            tempSum += i
            difference = tempSum - k
            
            count+= arrDict.get(difference, 0) # sets default value to 0 in case difference key is not found in dictionary 
            arrDict[tempSum] = 1 + arrDict.get(tempSum,0)
            
        return count
        
