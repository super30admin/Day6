# Time Complexity : o(N)
# Space Complexity: o(1)

# Hashmap
class Solution:
    def longestPalindrome(self, s: str) -> int:
        dictfreq = {}
        i = 0
        sum = 0
        while i < len(s):
            if s[i] not in dictfreq:
                dictfreq[s[i]] = 1
            else: 
                dictfreq[s[i]] += 1
            i += 1
        for key,value in list(dictfreq.items()):
            if value > 1:
                if value%2 == 0:
                    sum += value
                    del dictfreq[key]
                else:
                    sum += value-1
                 
                    
                   
        if len(dictfreq) != 0:
            return sum+1
        else:
            return sum 



## Hashset
# Time Complexity : o(N)
# Space Complexity: o(1)
class Solution:
    def longestPalindrome(self, s: str) -> int:
        setfreq = set()
        fredcount = 0
        i = 0
        while i < len(s):
            if s[i] not in setfreq:
                setfreq.add(s[i])
            else:
                setfreq.remove(s[i])
                fredcount += 2
            i += 1
        if len(setfreq) != 0:
            return fredcount+1
        else:
            return fredcount
            
                