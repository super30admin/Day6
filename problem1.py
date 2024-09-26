# Time Complexity: O(n)
# Space Complexity: O(n)
# Aproach we keep track of all sum occured
# if curr_sum - k exists then we append result by total number of its occurences
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        mp = dict()
        result = 0
        n = len(nums)
        mp[0] = 0
        curr_sum = 0
        for i in range(n):
            curr_sum += nums[i]
            if curr_sum == k:
                result += 1
            if (curr_sum - k) in mp.keys():
                result += mp[curr_sum - k]                    
            try:
                mp[curr_sum] += 1
            except:
                mp[curr_sum] = 1
        return result