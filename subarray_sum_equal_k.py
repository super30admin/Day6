"""
Brute force solution: Generate all the contiguous subarray and check for their sum. If equal to k increment
global answer.
Time Complexity: O(n pow 3): 2 loops to generate the subarray and one loop to calculate the sum of subarray.
Space Complexity: O(n) since need to store the subarray to calculate the sum of subarray.

Optimal approach: To remove the nested iteration, running sum technique could be explored here. The idea is that the
difference between running sum at two different indexes is the sum of subarray between those indexes. For this problem,
we check (or searching) if RS[i] - RS[j] is equal to k, meaning if RS[j] - k (that is RS[i]) is present in the running
sum array.
Since we need to search for the number in the subarray, we could use a hash map, where key is running sum and
value is frequency of the running sum.
Edge case: arr = [1,1] and k = 2. To handle this, add (0,1) key-value pair in hmap.

Time complexity: O(n) and space complexity: O(n)
"""
from typing import List


class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        hmap = {0: 1}
        running_sum = 0
        total = 0

        for idx, num in enumerate(nums):
            running_sum += num
            to_search = running_sum - k

            if to_search in hmap:
                total += hmap[to_search]
            if running_sum not in hmap:
                hmap[running_sum] = 0
            hmap[running_sum] += 1

        return total

