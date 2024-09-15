# In this problem, We have to maintain the counts of each char.
# After that, even numbered can be directly used, odd numbered can be used by eliminating one character.
# Finally, If you encounter odd sized char --> include 1 character into ans so that it can be used in middle.

# Time: O(N)
# Space: O(N)

class Solution:
    def longestPalindrome(self, s: str) -> int:
        
        counter=Counter(s)
        
        res=0
        for k,v in counter.items():
            if v%2==0:
                res+=v
            else:
                res+=v-1
        
        return res if len(s)==res else res+1