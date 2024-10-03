class Solution(object):
    def findMaxLength(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        rsum = 0  # Running sum to track balance of 0's and 1's
        max_len = 0
        hash_map = {0: -1}  # Store running sum with its first occurrence index

        if len(nums) == 0 or nums is None:
            return 0

        for i in range(len(nums)):
            if nums[i] == 0:
                rsum -= 1  # Treat 0 as -1 to balance out with 1's
            else:
                rsum += 1

            if (
                rsum in hash_map
            ):  # If running sum was seen before, calculate subarray length
                max_len = max(max_len, i - hash_map[rsum])
            else:
                hash_map[rsum] = i  # Store first occurrence of running sum
        return max_len


# time complexity is O(n) where n is the length of the input array nums
# space complexity is O(n)
