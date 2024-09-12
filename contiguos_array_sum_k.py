## Time Commplexity O(n)
## Space Complexity O(n)


class Solution(object):
    def subarraySum(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        dicts={}
        sum_m = 0
        count = 0
        dicts[0]=1
        for i in range(len(nums)):
            sum_m+=nums[i]
            diff = sum_m-k
            if diff in dicts:
                count+=dicts[diff]
            if sum_m in dicts:
                dicts[sum_m]+=1
            else:
                dicts[sum_m]=1
        return count