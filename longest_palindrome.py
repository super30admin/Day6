"""
Brute force the longest palindrome: Generate all possible arrangements of characters with different lengths
and then check each arrangement is palindrome or not.
Takes n! * n time.

Optimal solution1: a string is palindrome if each character's frequency is even except for one.
The idea is the store the frequency of each character into a hashmap. And then traverse the hashmap values.
Add the value to max length if it is even and keep track of if any character frequency is odd. If yes,
add 1 to max length.
Time complexity: O(n): to create the hashmap + O(26): to traverse the hashmap
Space complexity: O(1) since max 26 characters
Why use hashmap?
This is because, while traversing the string, we are updating the frequency of each character and to do so
search is required for a specific character, which can be done in O(1) time using hashmap.
Edge case: "ccc"
Note: the hashmap can be switched with an array of size 60 since the number of characters is fixed.

Optimal solution2:  Instead of the frequency hashmap, set can be used.
The idea is to traverse the string and keep checking for the character in the set. If the character is already present,
increase the max length and remove it from the set.
In the end, if there are characters left in the set, add one to max length. Since they account for the odd number
of characters.
this removes the O(26) traverse of the hash map.


"""


class Solution:
    def longestPalindrome_hashmap(self, s: str) -> int:
        hmap = {}
        max_len = 0
        isOdd = False
        for ch in s:
            if ch not in hmap:
                hmap[ch] = 1
            else:
                hmap[ch] += 1
        for k, v in hmap.items():
            if v % 2 == 0:
                max_len += v
            else:
                isOdd = True
                max_len += v - 1

        if isOdd:
            return max_len + 1
        else:
            return max_len

    def longestPalindrome_set(self, s: str) -> int:
        hset = set()
        max_len = 0

        for ch in s:
            if ch not in hset:
                hset.add(ch)
            else:
                max_len += 2
                hset.remove(ch)

        if hset:
            return max_len + 1
        else:
            return max_len


obj = Solution()
ans = obj.longestPalindrome_set("ccc")
print(ans)
