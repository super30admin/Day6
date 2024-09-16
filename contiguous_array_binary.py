# -*- coding: utf-8 -*-
"""
Time Complexity : O(N) as we have to traverse through the given string
Space Complexity : O(N) for hashmap O(1) for lookup in a hashmap

"""

class Solution:
    def findMaxLength(self, nums:[]) -> int:
        #edge case 
        if not nums or len(nums) == 0 or len(nums)>50000:
            return -1
        
        hashmap = {} #create an empty hashmap
        max_len = 0
        rsum = 0
        
        for key,val in enumerate(nums): #run though the nums array
            if val == 1: 
                rsum += 1 #if element is 1, add rsum + 1
            else:
                rsum -= 1 #if element is 0, substract - 1 from rsum
                
            if rsum == 0: #if running sum is zero, that is we received the balanced contiguous array
                max_len = key + 1 #return the index + 1 
            
            if rsum in hashmap: #if runningsum is in hashmap
                if max_len < key - hashmap[rsum]: #check for max_len less than hashmap's runningsum
                    max_len = key - hashmap[rsum] #if max_len is less, add it to max_len
                else:
                    hashmap[rsum] = key #assign the index to hashmap
        return max_len#return the maximum length of the subarray


S = Solution()
nums =[1,0,1,0]
print(S.findMaxLength(nums))               