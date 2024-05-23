# Time Complexity
# O(N)
# Space Complexity
# O(n)

# Approach :

# using a hashset to store characters of odd length
# if even length characters are present then, they are removed and count is incremented by 2
# if the hashset is not empty , that means a odd length character can be added in the string
# so increment count by 1

class Solution:
    def longestPalindrome(self, s: str) -> int:

        if not s:
            return -1

        count = 0
        sHashSet = set()
        lenS = len(s)
        for i in range(lenS):
            if s[i] not in sHashSet:
                sHashSet.add(s[i])
            else:
                sHashSet.remove(s[i])
                count = count+2

        if sHashSet:
            count = count+1

        return count
