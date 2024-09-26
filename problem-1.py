# Time Complexity: O(n)
# Space Complexity: O(n)
# leetcode execution: YES

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        # initializing rsum to 0 and counter to count the sum to 0 and mapping to mainintng occurance of rsum to 0:1
        rsum=0
        mapping={0:1}
        counter=0
        # loop through the array and computer r sum 
        # subtract it with k and check if the key is present if yes then add the value of the found key to the counter
        # # then chce if the rsum is in mapping if yes increment by 1 else add it to the map with value 1 
        for x in nums:
            rsum+=x
            
            if rsum-k in mapping:
                counter+=mapping[rsum-k]
                
            if rsum in mapping:
                mapping[rsum]+=1
            else:
                mapping[rsum]=1
           
        return counter