# Time complexity : O(n)
# Space complexity : O(n) where n is the length of the given list, if complete list all 0 or 1, then space required would be n
# Leetcode: Solved and submitted

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
      
        # creating an empty hashmap
        rcount = {}
        
        # rSum is the running sum, maxl is the maximum lenght of the array, and to check if the first element in list for the balanced array, we add 
        # the key, value pair as (0,-1)
        rSum = 0
        maxl = 0
        rcount[0] = -1
        
        for i in range(len(nums)):
            
            # if we find that there is an element encountered as 0 in the list, then running sum would be decremented by 1
            if nums[i] == 0:
                rSum -= 1
            else:
            # if we find that there is an element encountered as 1 in the list, then running sum would be incremented by 1
                rSum += 1
            
            # if we encounter the value of rSum in the hashmap, that means that we have a balanced sub-array, so we find the lenght of the sub-array
            # and check if that is the max till now, if not present, then we add it to the set
            # At the very last, we return the maxl which has the max lenght of the sub-array which is balanced
            if rSum in rcount:
                maxl = max(maxl, i - rcount[rSum])
            else:
                rcount[rSum] = i
        
        return maxl
