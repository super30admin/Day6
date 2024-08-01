# TC: O(n) SC: O(1)

class Solution:
    def longestPalindrome(self, s: str) -> int:
        hashSet=set()
        count = 0

        for i in s:
            if i not in hashSet:
                hashSet.add(i)
            else:
                hashSet.remove(i)
                count +=2
        if hashSet:
            count+=1
        return count
        