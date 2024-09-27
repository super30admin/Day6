""""// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
"""



class Solution:
    def findMaxLength(self, nums):
        d = {0: -1}
        start=0
        end=0

        result = 0
        m = 0
        for i in range(len(nums)):
            if nums[i] == 1:
                result += 1
            else:
                result -= 1
            if result in d.keys():
                if m<(i-d[result]):
                    m=i-d[result]
                    start=d[result]+1
                    end=i
                # m = max(m, i - d[result])
            else:
                d[result] = i
        return m


