class Solution:
    def longestPalindrome(self, s: str) -> int:
        # c= Counter(s)
        # cnt=0
        # any_odd= False


        # for k,v in c.items():
        #     if v%2==0:
        #         cnt+=v
        #     else:
        #         any_odd =True
        #         cnt+=(v-1)

        # return cnt+1 if any_odd else cnt
        # can use hm or hashset-- remove on second occurance
        hs= set()
        cnt=0
        for i in s:
            if i not in hs:
                hs.add(i)
            else:
                hs.remove(i)
                cnt+=2
        return cnt+1 if len(hs)>=1 else cnt