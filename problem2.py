# Time Complexity: O(n)
# Space Complexity: O(n)
# first modify array by putting 0 as -1 then,
# similar to subarray sum in hashmap we store (cs:firstOccurenceIndex) and check for sum ==0


from collections import defaultdict
class Solution:
    def modify(self,nums):
        nums = [-1 if i==0 else i for i in nums ]
        return nums
    def findMaxLength(self, nums: List[int]) -> int:
        nums = self.modify(nums)
        res = 0
        mp = defaultdict(lambda : sys.maxsize)
        c_s = 0
        mp[0] = -1
        for i in range(len(nums)):
            c_s += nums[i]
            if c_s in mp.keys():
                res = max(i-mp[c_s],res)
            mp[c_s] = min(mp[c_s],i)
        # print(mp)
        return res
        
        