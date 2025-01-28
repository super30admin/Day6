# Time Complexity : O(N)
# Space Complexity : O(N)
# Did this code successfully run on Leetcode : YES
# Any problem you faced while coding this : NO


# Your code here along with comments explaining your approach
# keep track of all the sums encountered while traversing the array. If cur_sum-k exists, then add that to count, update hashmap, and proceed to the end of nums

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        sum_counts = {0:1}
        cur_sum = 0
        count = 0
        for num in nums:
            cur_sum += num
            if (cur_sum - k) in sum_counts:
                count += sum_counts[cur_sum-k]
            sum_counts[cur_sum] = 1 + sum_counts.get(cur_sum, 0)
        
        return count
        