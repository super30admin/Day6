# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        dict_store = {0:-1}
        count = rsum = 0
        for i in range(0,len(nums)):
            if nums[i] == 0:
                rsum-=1
            else:
                rsum+=1
            if rsum in dict_store:
                ind = dict_store[rsum]
                if abs(ind-i) > count:
                    count = abs(ind-i)
            else:
                dict_store[rsum] = i
        return count
