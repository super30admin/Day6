class Solution:
    def longestPalindrome(self, s: str) -> int:
        ans=0;
        store=collections.Counter(s)
        for val in store.values():
            ans+=(val//2*2)
            if ans%2==0 and val%2==1:
                ans+=1
        return ans
    #Time O(n)- n=len of s
    #Space O(n)
