"""
Brute force solution: Find all the contiguous subarray. For each subarray, find if it is balanced or unbalanced.
If it is balanced, keep comparing its length with global max length.
Takes: O(n power 3) time complexity because once subarray is formed need to check if it is balanced or not, that would
take O(n) time complexity.
 O(1) space complexity.

Optimal solution: To remove the nested iteration, running sum technique could be explored here. The idea is that the
difference between running sum at two different indexes is the sum of subarray between those indexes. For this problem,
the running sum at index i is current running sum -1 if integer is 0 and the current running sum +1 if integer is 1.
Now, if adding all the numbers in the subarray (or running sum) gives 0 then it is balanced subarray.
The problem comes down to the idea that when traversing the running sum array, if (the number at ith index - 0) exists
in the previous indexes of the running sum array.
Since we need to search for the number in the subarray, we could use a hash map, where key is running sum and
value is index.

Edge case: arr = [0,1] this is a balanced subarray. To handle this, either add a condition that whenever at ith
index the running sum is zero, max length = ith index - 0. Or add (0, -1) key-value pair in hashmap.

Time complexity: O(n) and space complexity: O(n)
"""
from typing import List


class Solution:
    def findMaxLength_2pass(self, nums: List[int]) -> int:

        running_sum_arr = [0 for _ in range(len(nums))]
        hmap = {0: -1}
        max_len = 0
        running_sum = 0
        for idx, num in enumerate(nums):
            if num == 0:
                running_sum -= 1
                running_sum_arr[idx] = running_sum
            else:
                running_sum += 1
                running_sum_arr[idx] = running_sum

            # need to find the longest length, so use the earliest index and don't update the hmap
            # with the latest value
            if running_sum not in hmap:
                hmap[running_sum] = idx

        for idx, rs in enumerate(running_sum_arr):
            if rs in hmap:
                length = abs(hmap[rs] - idx)
                max_len = max(max_len, length)

        return max_len

    def findMaxLength_1pass(self, nums: List[int]) -> int:
        hmap = {0: -1}
        running_sum = 0
        max_len = 0

        for idx, num in enumerate(nums):
            if num == 0:
                running_sum -= 1
            else:
                running_sum += 1

            if running_sum in hmap:
                length = abs(hmap[running_sum] - idx)
                max_len = max(max_len, length)
            else:
                hmap[running_sum] = idx

        return max_len


obj = Solution()
print(obj.findMaxLength_1pass([0, 1]))
