# Since palindrome has even number of each character set to make it valid. we can use this idea
# whenever we see a char for first time we add it to hashmap, if we see it again we subtract its occurance and add that final counter that tracks the longest length(like canceling out)
# at the end if we have one char left then we can add to get maximum length
# Time Complexity: O(n) # string parsing
# Space Complexitu: O(n) # hashmap storage O(26) if we consider smallcase alphabets
class Solution:
    def longestPalindrome(self, s: str) -> int:
        hmap = set()
        counter = 0
        for i in range(len(s)):
            if s[i] in hmap:
                counter += 2
                hmap.remove(s[i])
            else:
                hmap.add(s[i])
        if len(hmap) > 0:
            counter += 1
        return counter



        