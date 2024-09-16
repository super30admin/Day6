# Time: O(n)
# Space: O(1) # Maximum space will be ocupied is 52
class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: int
        """
        st = set()
        ans = 0
        for c in s:
            if c in st:
                ans += 2
                st.remove(c)
            else:
                st.add(c)
        if len(st) !=0:
            print(100)
            ans += 1
        return ans
