# Time Complexity : O(N) where N is length of the string
# Space Complexity : O(1) because there will be constat number of characters
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def longestPalindrome(self, s: str) -> int:
        hashmap = {}
        for l in s:
            if l in hashmap:
                hashmap[l] += 1
            else:
                hashmap[l] = 1

        maxlen = 0
        for val in hashmap.values():
            if val >= 2:
                maxlen += val if val % 2 == 0 else val - 1
            
        return maxlen if maxlen == len(s) else maxlen + 1


solution = Solution()
print(f'OUTPUT >> {solution.longestPalindrome("abccccdd")}')
print(f'OUTPUT >> {solution.longestPalindrome("a")}')
print(f'OUTPUT >> {solution.longestPalindrome("bb")}')