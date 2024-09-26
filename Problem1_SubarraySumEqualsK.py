# Time Complexity: O(n), where n is length of nums
# Space Complexity: O(n)
# Did this code successfully run on Leetcode: Yes

# Solution:

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        if not nums or len(nums) == 0:
            return 0

        # Dictionary to store the running sums and their no of occurrences
        rmap = dict()
        rmap[0] = 1

        count = rsum = 0

        for i in range(len(nums)):
            rsum += nums[i]

            # Whenever the diff between rsum and k is found, increase the count with its frequency
            diff = rsum - k
            if diff in rmap:
                count += rmap[diff]

            # Update the frequency of rsum in the dictionary
            rmap[rsum] = rmap[rsum] + 1 if rsum in rmap else 1

        return count