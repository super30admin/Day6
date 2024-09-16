#time complexity: O(n)
#space complexity: O(n)

class Solution:
    def longestPalindrome(self, s):
        self.s=s
        if(s==None or len(s)==0):
            return 0
        hashset=[]
        count=0
        for i in s:
            if i in hashset:
                count=count+2
                hashset.remove(i)
            else:
                hashset.append(i)
                
        if len(hashset)!=0:
            return count+1
        else:
            return count
        