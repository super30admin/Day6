# Time Complexity : o(n)
# Space Complexity : o(1) as the hashmap only stores alphabets irrespective of the length of input
# Did this code successfully run on Leetcode : Yes

class Solution:
    def longestPalindrome(self, s: str) -> int:
        d = {}
        flag = False
        for i in range(len(s)):          # stores the occurence of each letter
            if s[i] in d:
                d[s[i]]+=1
            else:
                d[s[i]] = 1
        ans = 0        
        for v in d:                      # if count is even, it can be added to palindrome length
            if d[v]%2 == 0:
                ans += d[v]
                d[v] = 0
            elif d[v]-1>0:               # if odd but greater than 0, then the even occurences can be added to palindrome length
                tmp = d[v] -1
                d[v] =d[v]-tmp
                ans += tmp
            if d[v]>0:                   # if odd occurences left i.e. any single letter that can be placed in the middle, then length += 1
                flag = True
        if flag:
            return ans+1
        return ans    