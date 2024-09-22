class Solution:
    def longestPalindrome(self, s: str) -> int:
        count = 0
        list = []
        for i in s:
            if i in list:
                list.remove(i)
                count = count + 2
            else:
                list.append(i)
        if len(list) != 0:
            count = count + 1
        return count 

length = Solution()
print(length.longestPalindrome("ababddc"))