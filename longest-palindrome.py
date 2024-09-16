class Solution:
    def longestPalindrome(self, s: str) -> int:
        hashSet = {}
        counter = 0
        for ch in s:
            if ch in hashSet:
                del hashSet[ch]
                counter+=2
            else:
                hashSet[ch]=1
        if hashSet:
            counter+=1
        return counter
        
#TC : O(N)
#SC: O(1)
#Notes: I can also use the HashMap to store the counter and iterate over the HashMap to reduce the counter by 2 and adding it to the counter.