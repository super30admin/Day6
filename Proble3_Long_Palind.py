# Time Complexity O(n)
# Space Complexity O(1)
class Solution:
    def longestPalindrome(self, s: str) -> int:
        map=dict()
        count=0
        for i in range(len(s)):
            map[s[i]]=map.get(s[i],0)+1
            if(map[s[i]]>1):
                count+=2
                map[s[i]]=map[s[i]]-2
        if(count<len(s)):
            count+=1
        return count

# Time Complexity O(n)
# Space Complexity O(1)
class Solution:
    def longestPalindrome(self, s: str) -> int:
        set1=set()
        count=0
        for i in range(len(s)):
            if s[i] in set1:
                count+=2
                set1.remove(s[i])
            else:
                set1.add(s[i])
        if len(set1)>0:
            count+=1
        return count
# Time Complexity O(n)
# Space Complexity O(1)
class Solution:
    def longestPalindrome(self, s: str) -> int:
        boolList=list()
        count=0
        trueCount=0
        [boolList.append(False) for i in range(58)]
        for char in range(len(s)):
            idx=ord(s[char])-ord('A')
            if(boolList[idx]):
                count+=2
                boolList[idx]=False
                trueCount-=1
            else:
                boolList[idx]=True
                trueCount+=1
        if(trueCount>0):
            count+=1
        return count
        