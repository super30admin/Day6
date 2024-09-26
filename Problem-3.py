# T.C = O(n) S.C = O(n)
# count the even number and remove it from the set and at last check if the set>0 than icrease the count by 1 because we can fit any of the character in between  
class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: int
        """

        hashSet = set()
        count = 0

        for i in range (len(s)):
            if s[i] in hashSet:
                count += 2
                hashSet.remove(s[i])
            else:
                hashSet.add(s[i])

        if(len(hashSet)>0):
            return count + 1
        return count

        