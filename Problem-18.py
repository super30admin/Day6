"""
Time complexity: O(n)
Space complexity: O(n)
Approach: Iterate over the nums and store current total in a variable.
            Result consists of total number of subarrays that have sum k.
            Store every unique sum in the subarray in a hashtable with it's frequency (number of times that sum occurs).
            and if current_total - k exists in the hash table add the sums frequency it to result.

"""
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        largest_length = 0
        total_sum = 0
        hash_sum = {0: -1}

        for i in range(len(nums)):
            if nums[i] == 1:
                total_sum += 1
            else:
                total_sum -= 1

            if total_sum in hash_sum:
                if (i - hash_sum[total_sum]) > largest_length:
                    largest_length = i - hash_sum[total_sum]
            else:
                hash_sum[total_sum] = i
        return largest_length