class Solution:
    # leetcode URL : https://leetcode.com/problems/subarray-sum-equals-k/
    # Problem : 560. Subarray Sum Equals K
    # Time Complexity : O(n)
    # Space Complexity : O(n) for the keys value pairs in dictionary
    def subarraySum(self, nums: List[int], k: int) -> int:
        # sum(i,j) = sum(0,j) - sum(0,i-1)
        sum_dict = dict()
        sum_dict[0] = 1
        
        prefix_sum = 0
        excess_sum = 0
        count = 0
        
        i = 0
        while i<len(nums):
            prefix_sum = prefix_sum+nums[i] #summing previous subarrays
            excess_sum = prefix_sum - k 
            if excess_sum in sum_dict.keys(): # checking if any prev subarray has sum that offsets the excess sum required to hit the target
                count = count+sum_dict[excess_sum]
            if prefix_sum in sum_dict.keys():
                sum_dict[prefix_sum] = sum_dict[prefix_sum]+1
            else:
                sum_dict[prefix_sum]=1
            i = i+1
        return count
            
