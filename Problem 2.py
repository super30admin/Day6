# Time:O(n)
# Space: O(n)
class Solution(object):
    def findMaxLength(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        sm = 0
        for ind in range(len(nums)):
            if nums[ind]==0:
                nums[ind] = -1
        dic = {}
        dic[0] = -1
        mx = 0
        ans = 0
        for i, ind in zip(nums, range(len(nums))):
            sm += i
            if sm not in dic:
                dic[sm] = ind
            else:
                if mx < ind - dic[sm]:
                    mx = ind - dic[sm]
        return mx
