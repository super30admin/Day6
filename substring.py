class Solution:#Time O(n) and space O(n)
    def longestPalindrome(self, s: str) -> int:
        st=set()
        c=0
        for i in s:
            if i in st:
                c+=2
                st.remove(i)
            else:
                st.add(i)
        if len(st)!=0: c+=1
        return c
