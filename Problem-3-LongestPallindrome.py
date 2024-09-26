class Solution:
    def longestPalindrome(self, s) :

        if s == None or len(s) == 0:
            return 0
        hashset = set()
        count = 0

        for i in s:
            if i not in hashset:
                hashset.add(i)

            else:
                count = count + 2
                hashset.remove(i)

        if len(hashset) != 0:
            count += 1

        return count

sol=Solution()
s = "aaaaccdee"
print(sol.longestPalindrome(s))


