# Time Complexity :  O(n), where n is the length of nums
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes!
# Any problem you faced while coding this : Implemented optimized solution after session.

# Your code here along with comments explaining your approach
class Solution(object):
    # compute a running sum by adding 1 for every '1' and -1 for every '0' in nums.
    # store the running sum with indices in a hashmap,
    # if the running sum is encountered again, that implies the number of
    # 1s and 0s are equal between the two indices with the same running sum.
    def findMaxLength(self, nums):
        if nums == None or len(nums) == 0:
            return 0

        store = {0: -1}
        retVal = 0
        sum = 0

        for i in range(len(nums)):
            sum = sum - 1 if nums[i] == 0 else sum + 1
            if sum in store:
                curr = i - store[sum]
                retVal = max(retVal, curr)
            else:
                store[sum] = i

        return retVal


s = Solution()
print(s.findMaxLength([1,0,1,0,1,1,1,1,0,0,1,0,1]))

