'''
Time Complexity :
O(n)
Space Complexity : O(n))
Did this code successfully run on Leetcode : yes
Any problem you faced while coding this : No
'''
class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: int
        """
        hash1 = {}
        for c in s:
            if c not in hash1:
                hash1[c]=0
            hash1[c]+=1

        count=0
        odds=0
        odd_found=False
        for k, v in hash1.items():
            if v%2!=0:
                count+=v-1
                odd_found=True
            elif v%2==0:
                count+=v
        
        if odd_found:
            count=count+1
        
        return count