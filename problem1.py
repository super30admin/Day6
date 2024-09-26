# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : N/A


# Your code here along with comments explaining your approach

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        nsum = 0
        cnt = 0
        dict1 = {}
        dict1[0] = 1
        for i in nums:
            nsum += i
            if (nsum - k) in dict1.keys():
                cnt += dict1[nsum-k]
            if nsum in dict1.keys():
                dict1[nsum] += 1
            else:
                dict1[nsum] = 1
        return cnt