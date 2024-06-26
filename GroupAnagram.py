from collections import defaultdict

class Solution:
    def groupAnagrams(self, strs):
        # Map each character to a prime number
        prime_numbers = {
            'a': 2, 'b': 3, 'c': 5, 'd': 7, 'e': 11, 'f': 13, 'g': 17, 'h': 19, 'i': 23, 'j': 29,
            'k': 31, 'l': 37, 'm': 41, 'n': 43, 'o': 47, 'p': 53, 'q': 59, 'r': 61, 's': 67,
            't': 71, 'u': 73, 'v': 79, 'w': 83, 'x': 89, 'y': 97, 'z': 101
        }

        # Create a dictionary to group anagrams
        anagram_map = defaultdict(list)

        for s in strs:
            key = self.calculate_product(s, prime_numbers)
            anagram_map[key].append(s)

        return list(anagram_map.values())

    def calculate_product(self, s, prime_numbers):
        product = 1
        for char in s:
            product *= prime_numbers[char]
        return product

# Example usage
solution = Solution()
strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
result = solution.groupAnagrams(strs)
print(result)
