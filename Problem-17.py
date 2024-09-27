"""
Time complexity: O(n)
Space complexity: O(n)
Approach: Iterate over the nums and store current total in a variable.
            Result consists of total number of subarrays that have sum k.
            Store every unique sum in the subarray in a hashtable with it's frequency (number of times that sum occurs).
            and if current_total - k exists in the hash table add the sums frequency it to result.

"""
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        all_sums = { 0 : 1 }
        result = 0
        total = 0
        for i in nums:
            total += i
            if total - k in all_sums:
                result += all_sums[total - k]
            if total in all_sums:
                all_sums[total] += 1
            else:
                all_sums[total] = 1
        return result