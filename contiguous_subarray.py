class Solution(object):
    def findMaxLength(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        count = 0
        length = 0
        hm = dict()
        hm[0] = -1
        for i in range(len(nums)):
            if nums[i] == 1:
                count += 1
            else:
                count -= 1
            if hm.has_key(count):
                length = max(length, i - hm[count])
            else:
                hm[count] = i
        return length