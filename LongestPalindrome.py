# Time Complexity: O(n), Space: O(1)
class Solution:
    def longestPalindrome(self, s: str) -> int:
        x = set()
        count = 0
        
        for i in s:
            if(i in x):
                x.remove(i)
                count += 2
            else:
                x.add(i)
        
        if(len(x)>0):
            return count+1
        else:
            return count