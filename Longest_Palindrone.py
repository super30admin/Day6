#Time Complexity - O(n)
#Space Complexity - O(n)
#Successfully compiled and run on Leetcode

class Solution:
    def longestPalindrome(self, s: str) -> int:
        hm = {}
        out = 0
        flag = 0


        for i in range(0, len(s)): # construct the hashmap
            if s[i] in hm:
                hm[s[i]] += 1 #if char already seen, increment count by 1
            else:
                hm[s[i]] = 1 #if not make an entry

        for i in hm:
            if hm[i] % 2 == 0: # if count is even
                out += hm[i]
            else:
                out += hm[i] - 1 #if count is odd - take even part of it
                flag = 1  # rest left out chars,just pick one of them

        if flag == 1: # adding the last single char one time
            out += 1

        return out