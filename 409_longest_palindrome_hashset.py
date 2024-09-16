#TC: O(n)
#SC: O(1)

class Solution:
    def longestPalindrome(self, s: str) -> int:
        word_set = set()
        
        count = 0
        for elem in s:
            if elem in word_set:
                count += 2
                word_set.remove(elem)
            else:
                word_set.add(elem)
                
        if len(word_set) > 0:
            count += 1
        return count
