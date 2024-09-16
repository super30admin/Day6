'''
Time Complexity: O(n)
Space Complexity : O(n)
'''
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        iter_sum = 0
        count = 0
        sum_counter = {0: 1}

        for num in nums:
            iter_sum += num
            residual = iter_sum - k
            if residual in sum_counter:
                count += sum_counter[iter_sum - k]

            if iter_sum in sum_counter:
                sum_counter[iter_sum] += 1
            else:
                sum_counter[iter_sum] = 1

        return count