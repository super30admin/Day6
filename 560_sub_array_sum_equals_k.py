class Solution:
    def subarraySum(self, nums: [int], target: int) -> int:
        # BRUTE FORCE O(n^2)
        # count = 0
        # for i in range(len(nums)):
        #     sum = 0
        #     for j in range(i + 1, len(nums)):
        #         sum += nums[j]
        #         if sum == k:
        #             count += 1
        # return count
        """
            // Time Complexity: O(n)
                # 'n' is the number of elements in 'nums' list
            // Space Complexity:
                O(n) We have a dictionary
            // Did this code successfully run on Leetcode :
                Yes
            // Any problem you faced while coding this :
                Its tricky!
        """
        running_sums = {0: 1}
        # to keep track of total running sum
        # till the ith element
        cur_running_sum = 0
        # the total number of subarrays whose sum
        # is equal to the target
        sub_arrays_count = 0
        for num in nums:
            # current running sum including the ith number
            cur_running_sum += num
            # if the complement is present in the dictionary
            # this means we can cancel out all those terms
            # to get the subarray whose sum matches to the target
            # !!! The complement was the previous running_sum which
            # we had stored in the dictionary !!!
            complement = cur_running_sum - target
            # if the complement is present we had it to the equivalent
            # value of the key
            sub_arrays_count += running_sums.get(complement, 0)
            # if the new running_total is present we increment or we add with a new
            # value 1
            running_sums[cur_running_sum] = running_sums.get(cur_running_sum, 0) + 1
        return sub_arrays_count


if __name__ == '__main__':
    h = Solution()
    result = h.subarraySum([3, 4, 7, 2, -3, 1, 4, 2, 0, 1], 7)
    print(result)
