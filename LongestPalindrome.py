#time complexity:o(n) 
#space complexity: o(1) 
#passed all cases on LeetCode: yes

class Solution:
    def longestPalindrome(self, s: str) -> int:
        if not s or len(s) == 0 : return 0
        
        sSet = set()
        length = 0
        for i in range(len(s)):
            
            if s[i] in sSet:
                length = length+2
                sSet.remove(s[i])
            else:
                sSet.add(s[i])
                
        if len(sSet)!=0:
            length+=1
        
        return length
                