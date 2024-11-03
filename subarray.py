# The code defines a subarraySum method to find the number of continuous subarrays that sum to a given target value, k.
# The approach uses a running prefix sum and a dictionary (prefix_sum_count) to keep track of the frequency of prefix sums encountered so far.
# 
# In each iteration:
#   - The current element (num) is added to the prefix sum (prefix_sum).
#   - If (prefix_sum - k) exists in prefix_sum_count, it means there is a subarray ending at the current position with a sum equal to k.
#       - The count of such subarrays is incremented by the frequency of (prefix_sum - k) stored in prefix_sum_count.
#   - The current prefix_sum is then added to prefix_sum_count:
#       - If prefix_sum already exists in the dictionary, its frequency is incremented by 1.
#       - If prefix_sum is not in the dictionary, it is added with an initial frequency of 1.
# 
# After the loop, 'count' holds the number of subarrays with a sum equal to k, which is returned as the result.
# 
# TC: O(n) - The time complexity is linear as each element is processed once.
# SC: O(n) - The space complexity is linear due to the dictionary storing prefix sums and their frequencies.


class Solution(object):
    def subarraySum(self, nums, k):
        count = 0
        prefix_sum = 0
        prefix_sum_count = {0: 1} 
        
        for num in nums:
            prefix_sum += num 
            if (prefix_sum - k) in prefix_sum_count:
                count += prefix_sum_count[prefix_sum - k]  
            if prefix_sum in prefix_sum_count:
                prefix_sum_count[prefix_sum] += 1 
            else:
                prefix_sum_count[prefix_sum] = 1 
        
        return count