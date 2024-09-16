'''
Time Complexity: O(N)
Space Complexity: O(N) //At worst case
'''
class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: int
        """
        palindrome = 0
        hash_map = {}
        flag = 0
        for i in s:
            if(i in hash_map):
                hash_map[i] += 1
            else:
                hash_map[i] = 1
        for i in list(hash_map.keys()):
            if(hash_map[i] % 2 ==0):
                palindrome += hash_map[i]
            else:
                if(hash_map[i]>1):
                    palindrome += hash_map[i]-1
                flag = 1
        if(flag==1):
            palindrome += 1
        return palindrome
                
        