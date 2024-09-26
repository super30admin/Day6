# Time Complexity : O(N) Iterate over the input string of length N once
# Space Complexity : O(1) Max length of charset will be 26 char's so it is constant as compared to the size of the input string
# 409. Longest Palindrome


def longestPalindrome(s: str) -> int:
    if len(s) <= 1: return len(s)
    charset = set()
    result = 0
    for ch in s:
        if ch not in charset:
            charset.add(ch)
        else:
            charset.remove(ch)
            result += 2
        
    if len(charset) >= 1: return result + 1
    else: return result


print(longestPalindrome("abccccdd"))