"""
Time Complexity:    O(n)
Space Complexity:   O(n)
YES, The code successfully ran on Leetcode

"""
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        if nums is None or len(nums) == 0:
            return False
        cnt, hp, longest = 0, dict(), 0
        hp[0] = -1
        for i, num in enumerate(nums):
            if num == 0:
                cnt -= 1
            else:
                cnt += 1
            if cnt not in hp:
                hp[cnt] = i
            else:
                if i - hp[cnt] > longest:
                    longest = i - hp[cnt]
        return longest
