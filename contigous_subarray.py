"""
Time Complexity: O(n)
Spaace Complexity: O(n)
"""


class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        hmap = {0:-1}
        rSum = 0 
        mSArray = 0 

        for i in range(len(nums)):
            if nums[i] == 0:
                rSum -= 1
            else:
                rSum += 1

            if hmap.__contains__(rSum):
                mSArray = max(mSArray, i - hmap[rSum])
            else:
                hmap[rSum] = i

        return mSArray

        