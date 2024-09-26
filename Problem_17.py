# Time Complexity : O(n) where n is the length of nums
# Space Complexity : O(n) for the hashmap which can have a max of n different keys
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        h = {} # Initialize a hashmap
        h[0] = 1 # Put 0th index as 1, this means that there is 1 count for sum=0 till now
        rSum = 0 # Initialize running sum
        count = 0 # Initialize count of sub arrays with sum = k
    
        for i in range(len(nums)):
            # Iterate through the length of nums
            rSum += nums[i] # Add  current element value to running sum
            if rSum-k in h.keys(): # If running sum - k is present in the hashmap, we add its value to count
                # We have a running sum of rSum, if we had rSum-k as the sum before then the sub array between rSum-k and rSum would be having a sum of k
                count += h[rSum-k]
            if rSum not in h.keys():
                h[rSum] = 0 # If rSum is not in keys of hashmap, initialize it with value 0
            h[rSum] += 1 # Add 1 occurence of rSum to the hashmap
        return count