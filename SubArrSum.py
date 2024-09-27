'''
time complexity: O(n)
space complexity: O(n)
'''
class Solution(object):
    def subarraySum(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        count_dict= {}
        count_dict[0]=1
        count=0
        sums=0
        for i in range(0,len(nums)):
            sums+=nums[i]
            if(sums-k in count_dict):
               count+=count_dict[sums-k]
            if(sums not in count_dict):
                count_dict[sums] = 1
            else:
                count_dict[sums]=count_dict[sums]+1
        return count