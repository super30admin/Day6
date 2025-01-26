# TC: O(n)
# SC: O(1)

def longestPalindrome(s):
    char_set = set()
    ans = 0
    for c in s:
        if c not in char_set:
            char_set.add(c)
        else:
            char_set.remove(c)
            ans += 2
    if char_set:
        return ans + 1
    return ans
