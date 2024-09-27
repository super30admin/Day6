# Time Complexity : O(n)
# Space Complexity : O(n) - hashmap

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        
        count = 0;
        # Hashmap has the key-value pair:
        # Key : Cummulative Sum
        # Value : Count of the cummulative sum
        hashMap = {}
        
        currSum = 0
        
        # Initial sum is 0 ,and occurence of 0 is 1.
        # So, add (0,1) into the hashmap.
        hashMap[0] = 1;
        
        for i in range(len(nums)):
            
            # Calculate the cummulative sum
            currSum += nums[i]
            
            # Check if any two cummulative sums have a difference of target
            # If yes, increase the count 
            val = (currSum - k)
            if val in hashMap :
                count += hashMap[val]
                
            # If no, Update the new cummulative sum in the hashmap
            if currSum not in hashMap :
                hashMap[currSum] = 1
            else:
                hashMap[currSum]  += 1
    
        return count