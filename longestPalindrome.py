# // Time Complexity : O(n)
# // Space Complexity : O(n)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No

# Approach/Intuition:

# 1. Need to keep a list of letters that occur odd numbers of times, as if the number is even-> they are a part of palindrome!
# 2. Push chars in the list if they don't exist in the set, remove char if it already exists and update the count to 2
# 3. Return cnt as final result if the set is empty: meaning all letters occured twice and hence its an even palindrome
# 4. Return cnt+1 if set is not empty: meaning there are letters in the set that can be used to form an odd palindrome.

class Solution:
    def longestPalindrome(self, s: str) -> int:
        cnt = 0
        
        hashSet = []
        
        for i in range(len(s)):
            ch = s[i]
            
            if ch in hashSet:
                cnt += 2
                
                hashSet.remove(ch)
            else:
                hashSet.append(ch)
                
                
        if hashSet:
            return cnt+1
        else:
            return cnt
        