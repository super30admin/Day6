# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode :Yes
# Any problem you faced while coding this : -

class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: int
        """
        lookup, result, flag = {}, 0, False
        for char in s:
            if char not in lookup:
                lookup[char] = 1
            else:
                lookup[char] += 1
        for key in lookup:
            # For even cases
            if lookup[key]%2==0:
                result += lookup[key]
            # For odd cases
            else:
                result += lookup[key] - 1
                flag = True
        if flag:
            result +=1
        return result


obj = Solution()
s = 'abccccdd'
print(obj.longestPalindrome(s))