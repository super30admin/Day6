# Time Complexity :  O(n), where n is the length of nums
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes!
# Any problem you faced while coding this : I still have some trouble grasping
# the concept for this implementation, implemented optimized solution after session.

# Your code here along with comments explaining your approach
class Solution(object):
    # compute a running sum by adding all values in nums.
    # compute compliment by subtracting k from running sum
    # add sum with number of times it occurred in hashmap
    # if compliment exists before, add occurrence to count.
    def subarraySum(self, nums, k):
        if nums == None or len(nums) == 0:
            return 0
        store = {0: 1}
        sum = 0
        count = 0
        for i in range(len(nums)):
            sum += nums[i]
            compliment = sum - k
            if compliment in store:
                count += store[compliment]

            if not sum in store:
                store[sum] = 0
            store[sum] += 1

        return count


print Solution().subarraySum([3, 4, 7, 2, -3, 1, 4, 2, 0, 1], 7)
