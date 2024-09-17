# Time Complexity : O(N)
# Space Complexity : O(N)
# Did this code successfully run on Leetcode : YES
# Any problem you faced while coding this : Handling cases with 0s


# Your code here along with comments explaining your approach

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        
        # Prefix sum map to maintain number of indices prior to 'i' where array with sum=k appears
        prefix_sum_map = collections.defaultdict(int)

        # Cumulative sum array
        prefix_sum = []
        num_arr = 0
        for i in range(0, len(nums)):
            # Computing cumulative sum
            val = nums[i] + prefix_sum[i-1] if i>0 else nums[i]
            prefix_sum.append(val)

            # If sum upto this point = k, add it
            if val == k:
                num_arr += 1
            map_value = prefix_sum_map.get(val - k, 0)
            # Add the updated map value
            num_arr += map_value

            # Update map
            prefix_sum_map[val] = prefix_sum_map.get(val, 0) + 1
        
        return num_arr