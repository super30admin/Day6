# Time Complexity : O(N) as it is single pass
# Space Complexity : O(N) for N characters in the string put in the set
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : I got stuck at the space complexity

class Solution:
    def longestPalindrome(self, s: str) -> int:
        myset = set()
        count = 0
        for i in range(len(s)):
            if s[i] in myset:
                count += 2
                myset.remove(s[i])
            else:
                myset.add(s[i])
        if len(myset) != 0:
            count += 1
        return count
        

s = "ccc"
obj = Solution()
print(obj.longestPalindrome(s))