# // Time Complexity : O(n)
# // Space Complexity : O(n)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this :
#
#
# // Your code here along with comments explaining your approach


class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        hashmap = {}
        hashmap[0] = 1
        rsum = 0
        count = 0

        for i in range(len(nums)):
            rsum = rsum + nums[i]
            if rsum - k in hashmap.keys():
                count += hashmap[rsum - k]

            if rsum in hashmap.keys():
                hashmap[rsum] += 1
            else:
                hashmap[rsum] = 1

        return count

