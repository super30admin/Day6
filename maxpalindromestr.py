# Time - O(n)
# Space - O(1) -- Atmost we can have 52 characters in the hashset

class Solution:
    def longestPalindrome(self, s: str) -> int:
        hash_set = set()
        max_length_count = 0
        for i in s:
            if i not in hash_set:
                hash_set.add(i)
            else:
                max_length_count += 2
                hash_set.remove(i) # Remove and increment the counter by 2 as its a pair
        if len(hash_set):
            max_length_count += 1 # Single elements are there we can take any one of them only once
        return max_length_count
                        