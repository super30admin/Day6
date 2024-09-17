# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach
# Used hashmap to store the cumulative sum of each number in array.
# Check if the sum-k exists in hashmap if it does then increment count by the value in hashmap


class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        dict = {0: 1}
        count = 0
        sum = 0
        for i in range(len(nums)):
            sum += nums[i]
            if sum - k in dict:
                count += dict[sum - k]
            if sum not in dict:
                dict[sum] = 1
            else:
                dict[sum] += 1

        return count
