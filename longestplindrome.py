class Solution:
    def longestPalindrome(self, s: str) -> int:
        '''
        Time Complexity : O(n)
        Space Complexity : O(n)
        Approach:
            store the count of each letters
            check the count of the letter add the length.
        '''
        d = collections.defaultdict(int)
        for i in s:
            d[i] += 1
                
        ans = 0
        for k,v in d.items():
            ans += (v//2) * 2
        if ans < len(s):
            ans += 1
        return ans