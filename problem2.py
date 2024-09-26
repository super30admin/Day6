#longest palindrome in a string
    class Solution:
    def longestPalindrome(self, s: str) -> int:
        charDict={}
        for i in s: 
            if i not in charDict:
                charDict[i]=0
            charDict[i]+=1
            vals=list(charDict.values())
            single=0
            maxlen=0
            for i in vals:
                if i%2==0:
                    maxlen+=i
                else:
                    maxlen+=(i-1)
                    single=1
        return maxlen+single