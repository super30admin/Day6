# Time Complexity : O(n), where n is the length of the input array
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        rsum = 0
        freq = dict()
        count = 0

        freq[0] = 1

        for num in nums:
            rsum += num

            if rsum - k in freq:
                count += freq[rsum - k]

            freq[rsum] = freq.get(rsum, 0) + 1

        return count
