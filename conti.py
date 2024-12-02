class Solution:
    # TC O(n)
    # SC O(n)
    def findMaxLength(self, nums: List[int]) -> int:
        if nums == None or len(nums) == 0:
            return 0
        maps ={}
        cnt = 0
        maps[0] = -1
        maxs = 0
        for i, n in enumerate(nums):
            if n == 0:
                cnt -= 1
            else:
                cnt += 1
            if cnt not in maps:
                maps[cnt] = i
            else:
                maxs = max(maxs,i -maps[cnt])
        return maxs
