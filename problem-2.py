# Time Complexity: O(n)
# Space Complexity: O(n)
# leetcode execution: YES

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        if len(nums)<=1:
            return 0
        # maintaining a running sum and 
        rsum=0
        # mainingn a hash map where we maintain key as rsum and value as index to computer curretn occurance of index rsum - previous occurance index and find the length of the equal number of zeros and ones
        mapping={0:-1}
        counter=0
        
        # rsum +1 if nums[i]  is 1 rsum-1 if nums[i] is 0. comuter when rsum is in mapping else put the rsum in mapping wth index as value
        for i in range(len(nums)):
            if nums[i]==0:
                rsum-=1
            else:
                rsum+=1
            if rsum in mapping:
                counter=max(counter,i-mapping[rsum])
            else:
                mapping[rsum]=i
        return counter
                
                
            
        