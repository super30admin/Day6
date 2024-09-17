#Time Complexity :  O(N)
#Space Complexity : O(N)
#Did this code successfully run on Leetcode : yes
#Any problem you faced while coding this : no



class Solution(object):
    def findMaxLength(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if len(nums)==0:
            return 0
        else:
            length = 0
            max_len = 0
            hashmap = {}
            hashmap[0] = -1
            
            for index,num in enumerate(nums):
                if num == 1:
                    length = length +1
                else:
                    length = length -1
                    
                if length not in hashmap:
                    hashmap[length] = index
                    
                else:
                    max_value = index - hashmap[length]
                    if max_value >max_len:
                        max_len = max_value
                        
            return max_len
                
