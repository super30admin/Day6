// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this : No


def findMaxLength(self, nums: List[int]) -> int:
        d = {}
        d[0], res = 0, 0
        F = [0 for i in range(len(nums) + 1)]
        for i in range(len(nums)):
            F[i + 1] = F[i] + 1 if nums[i] == 1 else F[i] - 1
            if F[i + 1] in d:
                res = max(res, i + 1 - d[F[i + 1]])
            else:
                d[F[i + 1]] = i + 1
        return res
