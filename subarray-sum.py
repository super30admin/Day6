# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach

class Solution(object):
    def subarraySum(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        rsum = {0: 1}  # creating a dictionary to store rsum values

        sum_count = 0

        count = 0

        for i in range(len(nums)):
            sum_count = sum_count + nums[i]  # calculate the rsum

            # if the subarray is found
            if sum_count - k in rsum:
                count = count + rsum[sum_count-k]

            # if no subarray is found so keep on updating with the frequency
            if sum_count in rsum:
                rsum[sum_count] = rsum[sum_count] + \
                    1  # if already exists update
            else:
                rsum[sum_count] = 1  # new value

        return count
