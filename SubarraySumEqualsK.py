#  Subarray Sum Equals K
# Time Complexity : O(n); n = length of the array
# Space Complexity : O(n); n = length of hashmap
# Did this code successfully run on Leetcode : Yes
# Approach: We are using a cumulative sum. This sum will store sum of the elements upto a given index (sum[i] for the sum upto ith index). One more thing is that if sum[j]-sum[i] =k then sum of elements lying between i and j is k. That means we need to keep a constant lookout for sum[j] - k = sum[i] where i<j. So what we can do here while iterating over the array we will keep storing the sum[i] and how many times it has occured in the array in a hashmap. 

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        result = 0
        cum_sum = 0
        hmap = {}
        hmap[0] = 1
        n = len(nums)
        
        
        for i in range(n):
            cum_sum += nums[i]
            diff = cum_sum - k
            
            if diff in hmap:
                result += hmap[diff]
            
            if cum_sum in hmap:
                hmap[cum_sum] += 1  
            else:
                hmap[cum_sum] = 1
                
        return result
        
        