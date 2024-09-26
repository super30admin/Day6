    # 409. Longest Palindrome

    # Time Complexity : O(n)
    # Space Complexity : O(1)
    # Did this code successfully run on Leetcode : Yes
    # Any problem you faced while coding this : No

class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: int
        """
        hash_map = set()
        count = 0
        for i in range(len(s)):
            if s[i] in hash_map:
                count += 2
                hash_map.remove(s[i])
            else:
                hash_map.add(s[i])
    
        return count +1 if hash_map else count