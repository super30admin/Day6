# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach
def longestPalindrome(s: str) -> int:
    letters = {}
    for ch in s:
        if ch not in letters:
            letters[ch] = 1
        else:
            letters[ch] += 1
    res = 0
    odd = 0
    if len(letters) == 1:
        return letters[s[0]]
    for i in letters.values():
        if i > 1:
            if i % 2 == 0:
                res += i
            else:
                res += i-1
                odd += 1
        else:
            odd += 1
    if odd > 0:
        res += 1
    return res

s = "abccccdd"
print(longestPalindrome(s))