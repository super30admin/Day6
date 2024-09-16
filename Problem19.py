class Solution:
    def longestPalindrome(self, s: str) -> int:
        
        counter = {}
        for c in s:
            counter[c] = counter.get(c, 0) + 1
        
        longest = 0
        
        values = sorted(counter.values(), reverse=True)
                
        find_odd = False
        
        for value in values:
            if value % 2 == 0:
                longest += value
            else:
                longest += (value - 1)
                find_odd = True
        
        if find_odd:
            return longest + 1
        
        return longest
        
%TC: O(N).
%SC: O(N).