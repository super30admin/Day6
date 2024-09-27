    
# Time Complexity : O(n)
# Space Complexity : O(n) - hashmap

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
    
        # key - currsum
        # value - First index
        hashmap = {}
    
        # Initial sum is 0 ,and occurence of 0 is at index -1.
        # So, add (0,-1) into the hashmap.
        hashmap[0] = -1 
        
        currSum = 0
        maxLength = 0
        
        for i in range(len(nums)):
            
            # Calculate the cummulative sum
            if nums[i] == 0:
                # by subtracting 1 when 0 is seen -> It calculates the equal count of 0s and 1s
                currSum += -1 
            else:
                currSum += 1
                    
            # Calculate the new longest length
            if currSum in hashmap :
                maxLength = max(maxLength , i - hashmap[currSum])
            
            # Otherwise, store the first occurence index in hashmap
            else:
                hashmap[currSum] = i
        
        
        return maxLength