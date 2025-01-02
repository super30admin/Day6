class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        one, zero = 0, 0
        res = 0
        diff_index = {}  # diff -> index

        for i, n in enumerate(nums):
            if n == 0:
                zero += 1
            else:
                one += 1

            # Check if the diff is in hashmap
            # If not, add it
            if one - zero not in diff_index:
                diff_index[one - zero] = i

            if one == zero:
                res = one + zero
            else:
                idx = diff_index[one - zero]
                res = max(res, i - idx)
        return res

    # T: O(n), S: O(n)