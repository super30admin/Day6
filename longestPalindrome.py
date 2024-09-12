#Time Complexity: O(n)
#Space Complexity: O(n)
#Did it run on leetcode: Yes
class Solution:
    def longestPalindrome(self, s: str) -> int:
        if len(s) == 1:
            return 1
        
        #create a hashset
        hash_set = set()
        length_palindrome = 0
        for s_char in s:
            if s_char in hash_set:
                hash_set.remove(s_char)
                length_palindrome += 2
            else:
                hash_set.add(s_char)
        if len(hash_set) > 0:
            length_palindrome += 1
        return length_palindrome