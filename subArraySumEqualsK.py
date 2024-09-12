"""
Intuition: Brute force solution is getting all the possbile combinations of subarrays which equal to K

To optimzie it, keep a runningSum. We subtract target from runningSum to get a the sum of the other half of the subarray.
#####################################################################
For brute force:
Time Complexity : O(N^3) N = number of elements
Space Complexity : O(1) 
#####################################################################
For hashing
Time Complexity : O(N)  N = number of elements
Space Complexity : O(N) 
#####################################################################
"""


class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        
        countSubarrays = 0
        totalSum = 0
        hashMap = {0:1}
        for num in nums:
            
            totalSum += num

            if (totalSum - k) in hashMap:
                countSubarrays += hashMap[totalSum - k]
            
            if totalSum in hashMap:
                hashMap[totalSum] += 1
            else:
                hashMap[totalSum] = 1
        return countSubarrays