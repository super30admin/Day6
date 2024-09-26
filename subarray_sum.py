# Did this code successfully run on Leetcode : NO

# tried a two pointers approach, realised late that input can have negative numbers too

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        l, r = 0, 0
        n = len(nums)
        _sum = nums[0]
        cnt = 0
        while l < n and r < n:
            if l > n - 1:
                break
            # print((l, r, _sum))
            if _sum == k:
                cnt += 1
                _sum -= nums[l]
                l += 1
            elif _sum < k:
                if r <= n-1:
                    r += 1
                    _sum += nums[r]
                else:
                    continue
            else:
                _sum -= nums[l]
                l += 1
        return cnt