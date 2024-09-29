# Time Complexity : O(N) where N is the length of the string s
# Space Complexity : O(k) where k is the number of unique characters in the string 
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

class Solution:
    def longestPalindrome(self, s: str) -> int:
        count = 0
        flag = False
        map = {}
        if s == None or len(s) == 0:
            return -1

        for c in s:
            map[c] = map.get(c, 0) + 1

        for c in map:
            freq = map[c]
            if freq %2 == 0:
                count += freq
            else:
                count += freq - 1
                flag = True

        if flag:
            return count + 1
        return count
