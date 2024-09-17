class Solution:
    def longestPalindrome(self, s: str) -> int:
        
        palin = set()
        count = 0
        
        for st in s:
            if st in palin:
                palin.remove(st)
                count += 2
            else:
                palin.add(st)
            print(palin)
                
        if len(palin):
            return count+1
        else:
            return count