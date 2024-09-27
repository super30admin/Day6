# Time Complexity : O(N) //As it would run N number of time the letters present
#  Space Complexity :O(N) //It would run for N element present in array
#  Did this code successfully run on Leetcode : Yes
#  Any problem you faced while coding this : N/A

#  Your code here along with comments explaining your approach

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        #For empty case
        if not nums:
            return 0

        hashMap = {}
        hashMap[0] = 1 #Add initial dummy value for cases like [1,1,1]
        count = 0
        rSum = 0
        
        #Run a loop over nums length, add the cuurent nums value to the previous rSum, if the differnce between the sum and target is present in hashmap the assign count appropriately
        for i in range(len(nums)):
            rSum = rSum + nums[i]
            
            if rSum - k in hashMap:
                count = count + hashMap[rSum-k]
            #if the sum itself is present then update the value of it in hashmap
            if rSum in hashMap:
                hashMap[rSum] = hashMap.get(rSum) +1
                
            else:
                hashMap[rSum] = 1
        return count