
'''
Time Complexity: O(n)
Space Complexity: O(n)

Approach: We create a set, for each character in string s,
if the char is not in set, we add it
else if it is present, we remove it.
So that at the end we only have odd number of ch left in the set

if the set is empty, we return len(s) as the whole string is palindrome
else: return the difference between len(s)-len(set)+1

'''
class Solution(object):
    def longestPalindrome(self, s):
        hashSet = set()
        for ch in s:
            if ch in hashSet:
                hashSet.remove(ch)
            else:
                hashSet.add(ch)
        
        if len(hashSet) > 0:
            return len(s)-len(hashSet)+1
        
        else:
            return len(s)