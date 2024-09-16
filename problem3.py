class Solution:
    def longestPalindrome(self, s: str) -> int:
        if len(s) == 0:
            return 0
        occurence = set()
        
        count = 0
        
        for c in s:
            print("c:",c)
            if c not in occurence:
                occurence.add(c)
            else:
                count += 2
                occurence.remove(c)
            print("count:",count)
            print("occurence:",occurence)

        
        if len(occurence) != 0:
            return count+1
        else:
            return count
