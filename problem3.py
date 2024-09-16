#Time Complexity: O(n)
#Space Complexity: O(1)
class Solution:
    def longestPalindrome(self, s: str) -> int:
        result = 0
        st = set()
        for i in range(len(s)):
            if s[i] not in st:
                st.add(s[i])
            else:
                result += 2
                st.remove(s[i])
        if len(st)>=1:
            return result +1
        else:
            return result