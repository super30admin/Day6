class Solution:
    def longestPalindrome(self, s: str) -> int:
        hashset = set()
        count = 0
        odd_freq = False

        for char in s:
            if char in hashset:
                hashset.remove(char)
                count += 2
            else:
                hashset.add(char)

    
        return count+1 if len(hashset) != 0 else count
            
