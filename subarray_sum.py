# Time Complexity : Add - O(n)
# Space Complexity :O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

'''
1. The algorithm leverages uses the running sum to find the balanced subaray between any given running sum
2. The Running sum is calculated by adding the numbers as they appear
3. IF running sum - target == some value that has appeared before, then that confirms the presence of a
   subarray summing to k
4. Therefore we keep storing the running sum in a hashmap to enable O(1) key search
'''


def subarraySum(self, nums, k):
    
    if nums == [] or len(nums) < 1:
        return 0

    rsum = 0
    rsum_dict = {0:1}
    total_count = 0
    
    for i in range(len(nums)):

        rsum += nums[i]

        if rsum-k in rsum_dict:
            total_count += rsum_dict[rsum-k]

        if rsum in rsum_dict:
            rsum_dict[rsum] += 1
        else:
            rsum_dict[rsum] = 1




    return total_count