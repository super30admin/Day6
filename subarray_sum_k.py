#Time Complexity :  O(N)
#Space Complexity : O(N)
#Did this code successfully run on Leetcode : yes
#Any problem you faced while coding this : no



class Solution(object):
    def subarraySum(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        
        if len(nums)==0:
            return 0
        else:
            hashmap = {}
            hashmap[0] = 1
            length = 0
            counter = 0
            for index,num in enumerate(nums):
                counter = counter+num
                if counter-k in hashmap:
                    length = length +hashmap[counter-k]
                    
                if counter in hashmap:
                    hashmap[counter]+=1
                    
                else:
                    hashmap[counter] = 1
                    
            return length
                    
                    
                    
                