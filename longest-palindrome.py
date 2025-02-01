# The algorithm counts character frequencies using a set, adding 2 to the palindrome length when a character 
# appears twice and removing it. If any character remains, one odd character can be placed in the center, 
# adding 1 to the final length.
# Time: O(N) | Space: O(1) (since there are at most 52 characters for uppercase/lowercase English letters).
def longestPalindrome(self, s: str) -> int:
    count = set()
    ans = 0
    for num in s:
        if num in count:
            ans += 2
            count.remove(num)
        else:
            count.add(num)
    if count: 
        return ans + 1
    return ans