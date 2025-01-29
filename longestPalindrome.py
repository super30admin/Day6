"""
409. Longest Palindrome

Hashing approach

TC - O(n)
SC - O(n)
"""

s = "abccccddxa"


def longestPalindrome(sstr):
    if s is None or len(s) == 0: return 0

    if len(s) == 1: return 1

    hSet = set()
    count = 0

    for i in range(len(sstr)):
        if s[i] in hSet:
            count += 2
            hSet.discard(s[i])
        else:
            hSet.add(s[i])

    if len(hSet) > 0:
        count += 1

    return count


if __name__ == '__main__':
    print(longestPalindrome(s))
