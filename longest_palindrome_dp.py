def longest_palindrome_dp(s):
    n = len(s)
    dp = [[False] * n for _ in range(n)]
    start = 0
    max_length = 1

    for i in range(n):
        dp[i][i] = True  # Single character palindromes

    for i in range(n - 1):
        if s[i] == s[i + 1]:
            dp[i][i + 1] = True
            start = i
            max_length = 2

    for length in range(3, n + 1):  # Length of substring
        for i in range(n - length + 1):
            j = i + length - 1
            if s[i] == s[j] and dp[i + 1][j - 1]:
                dp[i][j] = True
                start = i
                max_length = length

    return s[start:start + max_length]

#Time Complexity: O(n²) - where n is the length of the string⁠
⁠
#Space Complexity: O(n²) for the Dynamic Programming approach due to the 2D DP table⁠
⁠
