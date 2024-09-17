# Time complexity: O(n)
# Space complexity: O(n)


class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        
        c = collections.Counter()
        c[0] = 1
        res, su = 0,0
        for x in nums:
            su += x
            res += c[su-k]
            c[su] += 1
        return res
