# TC : O(n)
# SC : O(n)
class Solution(object):
    def subarraySum(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        ans=0
        prefsum=0
        d={0:1}

        for num in nums:
            prefsum = prefsum + num

            if prefsum-k in d:
                ans = ans + d[prefsum-k]

            if prefsum not in d:
                d[prefsum] = 1
            else:
                d[prefsum] = d[prefsum]+1

        return ans