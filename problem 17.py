# 560. Subarray Sum Equals K: https://leetcode.com/problems/subarray-sum-equals-k/description/


# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : YES
# Any problem you faced while coding this : NO


# Your code here along with comments explaining your approach

# find the running sum at each index and save it in a map and check for ps - k in map if found 
# add its value to ans else make an entry of it or increment its value by 1.
# return ans.


class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        hm = {0:1}
        ps = 0
        ans = 0
        for i in range(len(nums)):
            ps += nums[i]
            if(ps - k) in hm:
                ans += hm[ps-k]
            if(ps not in hm):
                hm[ps] = 1
            else:
                hm[ps] += 1
        return ans