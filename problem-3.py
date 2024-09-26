# Tc: O(n)
# Sc: O(n)

class Solution:
    def longestPalindrome(self, s: str) -> int:
        bucket = set()
        res = 0
        for c in s:
            if c in bucket:
                bucket.remove(c)
                res += 2
            else:
                bucket.add(c)
        if len(bucket) == 0: return res
        else: return res+1

obj = Solution()
print(obj.longestPalindrome("aaababsns"))