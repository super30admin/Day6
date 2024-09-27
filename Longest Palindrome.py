class Solution:
    def longestPalindrome(self, s: str) -> int:
        #Time Complexity: O(n)
        #Space Complexity: O(1)
        #where, n is the length of string
        
        hash_map = {}
        for char in s:
            hash_map[char] = hash_map.get(char, 0) + 1
        
        even_counts = [(c // 2) * 2 for c in hash_map.values()]
        
        return min(sum(even_counts) + 1, len(s))