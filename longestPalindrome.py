'''
Time complexity : O(N)
Space complexity :O(1)
'''
class Solution:
    def longestPalindrome(self, s) -> int:

        if len(s) == 0:
            return 0
        count = 0
        hashset = set()

        for char in s:
            if char not in hashset:
                hashset.add(char)
            else:
                count += 2
                hashset.remove(char)

        if len(hashset) > 0:
            count+=1
        
        return count

s = Solution()
print(s.longestPalindrome("abccccdd"))