# Time Complexity : O(n) = n
# Space Complexity : O(n) = n
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No problems after learning the solution in class

#Approach:
# Using running sum approach. Storing the running sum and index in a Map at each index and looking for rSum - k 
# If found that means that the index stored at the place contains sum which added to k gives current index
# so add 1 to result. At the end return result

from collections import defaultdict
class Solution:
    def subarraySum(self, nums, k):
        mapping = defaultdict(lambda: 0)
        mapping[0] = 1
        rSum = 0
        result = 0
        for i in range(len(nums)):
            rSum += nums[i]
            if mapping[rSum - k] is not None:
                result += mapping[rSum - k]
            mapping[rSum] += 1
        return result

if __name__ == "__main__":
    s = Solution()
    print(s.subarraySum([1,2,3], 3))