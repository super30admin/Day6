#Time Complexit O(n)

class Solution(object):
    def subarraySum(self, nums, k):
        if not nums and not k:
            return 1
        d = {}
        cum_sum = 0
        count = 0
        d[0] = 1
        for i in nums:
            cum_sum += i
            if cum_sum - k in d:
                count += d[cum_sum - k]
            if cum_sum in d:
                d[cum_sum] +=1

            else:
                d[cum_sum] = 1

        return count




        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
