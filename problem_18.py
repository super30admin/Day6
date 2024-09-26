class Solution(object): #hashset impelmetaion
    def longestPalindrome(self, s): #create hashset and keep updating the set, if the element repeats twice then remove it from set and increase the count by 2
        #if the same element appears again add it to set and repeat the same procedure, finally if the set is not em
        """
        :type s: str
        :rtype: int
        """
        self.s=list(s)
        self.k=set()
        count=0
        for i in range(len(self.s)): #0(n) ??
            if self.s[i] not in self.k:
                self.k.add(self.s[i])
            else:
                self.k.remove(self.s[i])
                count += 2
        if self.k:
            count += 1
        return count


class Solution2(object):  #using hash maps but not a optimal one
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: int
        """
        self.s=list(s)
        self.k={}
        count=0
        for i in range(len(self.s)): #0(n)
            if self.s[i] not in self.k:
                self.k.update({self.s[i]:1})
            else:
                self.k[self.s[i]]=  self.k[self.s[i]] + 1
        j=0
        for ky in self.k:
            if self.k[ky]%2==0:
                count += self.k[ky]
            elif self.k[ky] > 1: # 'ccc'
                count +=  self.k[ky] -1
                self.k[ky] =1
                j += 1
            else:   #'abcccdd'
                j +=1
        if j>0:
            count += 1
        return count