class Solution(object):
    def subarraySum(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        hash_map = {0: 1}  # Store running sum counts
        count = 0
        rsum = 0

        for i in range(len(nums)):
            rsum += nums[i]  # Update running sum
            diff = rsum - k
            if diff in hash_map:  # Check if there is a subarray sum equals to k
                count += hash_map[diff]
            if rsum in hash_map:  # Update hash_map with running sum
                hash_map[rsum] += 1
            else:
                hash_map[rsum] = 1

        return count


# time complexity is O(n) where n is the length of the input array nums
# space complexity is O(n)
