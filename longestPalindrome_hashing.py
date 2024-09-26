class Solution:
    def longestPalindrome(self, s: str) -> int:
        if not len(s):
            return 0
        # char = dict()
        # count = 0
        # for i in range(len(s)):
        #     if s[i] not in char:
        #         char[s[i]]=1
        #     else:
        #         char[s[i]] += 1
        #         if char[s[i]]==2:
        #             count += 2
        #             del char[s[i]]
        # if len(char)>0:
        #     count += 1
        # return count
        char = set()
        count=0
        for i in range(len(s)):
            if s[i] not in char:
                char.add(s[i])
            else:
                char.remove(s[i])
                count += 2
        if len(char) > 0:
            count += 1
        return count
    
# this implementation takes O(n) complexity where n is the length of the string.
# sol = Solution()
# print(sol.longestPalindrome(""))