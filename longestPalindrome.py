#Did it run on LC: Yes
#TC: O(N)
#SC: O(1)

class Solution(object):
    def longestPalindrome(self, s):
        ref = set()
        for i in range(len(s)):
            if s[i] not in ref:
                ref.add(s[i])
            else:
                ref.remove(s[i])
        if len(ref) != 0:
            return len(s) - len(ref) + 1
        else:
            return len(s)

if __name__ == "__main__":
    lp = Solution()
    res = lp.longestPalindrome("abcccdd")
    print(res)