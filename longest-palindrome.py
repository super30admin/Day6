# Time : O(n)
# Space: O(1)
class Solution:
    def longestPalindrome(self, s: str) -> int:
        hash1={}
        length=0
        isOdd=False
        
        for char in s:
            if char in hash1:
                hash1[char]+=1
            else:
                hash1[char]=1
        
        for key in hash1:
            if hash1[key]%2==0:
                length+=hash1[key]
            else:
                if isOdd is False:
                    length+=hash1[key]
                    isOdd=True
                else:
                    length+=hash1[key]-1
                    
        return length