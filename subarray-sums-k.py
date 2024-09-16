class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        hashMap = {}
        hashMap[0] = 1
        rSum  = 0
        count = 0
        for i in range(len(nums)):
            rSum += nums[i]
            complement = rSum - k 
            if complement in hashMap:
                count+=hashMap[complement]
            if rSum not in hashMap:    
                hashMap[rSum]=1
            else:
                 hashMap[rSum] = hashMap[rSum]+1
        return count
                
#TC: O(N) the algorithm goes over all the elements once
#SC: O(N) at any time all our elements can have different running sums hence all the different sums could be in the hashtable