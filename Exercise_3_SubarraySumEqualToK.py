# Time Complexity :
# O(N) 


# Space Complexity :  
# O(N)


# Approach:
# Here we create hashMap to store key(runningSum) and values(count of such running sum).
# We record the runningSum at each element in the array, and check if runningSum-k is present as a key in
# our hashMap, if present, we update "maxcount" based on the value retrieved from that key, since it indicates
# that the subarray from that runningSum-k index to current index has "hashMap[runningSum-k]" number
# of subarrays that sum to k
# Lastly, for each runningSum , update its count in hashMap.
# Then return final value of "maxcount" which is required number of subarrays whose sum equals k.

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:

        if nums is None or len(nums)==0:
            return 0
        
        # running sum
        rSum = 0

        # the number of subarrrays having the sum equal to k
        maxCount = 0

        # hashMap to store key(rSum) and value(count of the rSum)
        hashMap = {}

        # base case
        hashMap[rSum] = 1   # rSum =0 has occured once even before we start traversing the array

        for i in range(0, len(nums)):
            # update rSum according to element 
            rSum = rSum + nums[i]
           
            # update the hashMap according to current rSum, its count, and whether rSum-k is present in map.keys()
            if rSum-k in hashMap.keys():
                maxCount = maxCount + hashMap[rSum-k]
        
            # update the count of rSum in hashMap irrespective of above condition
            if rSum in hashMap.keys():
                hashMap[rSum] += 1
            else:
                hashMap[rSum] = 1