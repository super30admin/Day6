# Time: O(N) | Space: O(1)

class Solution:
    def longestPalindrome(self, s):
        charset = set()
        ans = 0
        for ch in s:
            if ch in charset:
                ans += 2
                charset.remove(ch)
            else:
                charset.add(ch)
        return ans if not charset else ans+1




if __name__ == "__main__":
    print(Solution().longestPalindrome("abccccdd"))
