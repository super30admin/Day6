"""
Runtime Complexity:
O(n) - because we go over 'n' elements in the list and check whether if it's 0 or 1. If it's 1 we increment rsum by 1 else decrement by 1. Then we check if rsum 
is in hashmap or not. If the rsum is present in the map then we compute the max between current max and the computed value. If rsum is not present then we just add it.
Finally we return the max length.
Space Complexity:
O(n) - Because we declare a hashmap and store rsum traversing each element. If the rsum is already present then we just update the max or put the new rsum into our map.
Yes, the code worked on leetcode.
"""



class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        max_len = 0
        rsum = 0
        max_map = {}
        max_map[0]= -1
        for i in range(0,len(nums)):
            if nums[i] == 1: 
                rsum+=1 
            else:
                rsum-=1
       
            if rsum in max_map:
                max_len = max(max_len,i-max_map.get(rsum))
            else:
                max_map[rsum] = i
        return max_len
            
        
