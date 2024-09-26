class Solution:
    def longestPalindrome(self, s: str) -> int:
        if s is None or len(s) == 0:        #checking whether the given string is empty or not if yes it will return False and Vice versa
            return False
        st = set()          # creating a set variable using in-built set function
        count = 0           # a counter variable to keep count of single characters and pair characters

        for x in range(len(s)):
            c = s[x]      #Taking each character out
            if c in st:         # condition to check if set already has c character to form pair with current character
                count += 2       #increasing count by 2 as it is a pair
                st.discard(c)   # to remove pair element
            else:
                st.add(c)
        if len(st) != 0:        # if set is not empty 1 is added to count
            count += 1
        return count