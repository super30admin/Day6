# // Time Complexity : O(N)
# // Space Complexity : O(N)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this :


# // Your code here along with comments explaining your approach

class Solution:
    def longestPalindrome(self, s: str) -> int:
        hashSet= set()
        result = 0
        for i in range(len(s)):
            if s[i] in hashSet :
                result += 2
                hashSet.remove(s[i])
            else:
                hashSet.add(s[i])
                
        if len(hashSet)==0:
            return result
        else:
            return result+1
                
solution = Solution() 
print(solution.longestPalindrome("abccccdd"))

