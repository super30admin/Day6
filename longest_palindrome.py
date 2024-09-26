from collections import Counter
class Solution:
    def longestPalindrome(self, s: str) -> int:

        mycount = Counter(s)
        count = 0
        flag = False
        flagcount = 0
        print (mycount)
        for i in mycount.values():
            if i % 2 == 0:
                print (i)
                count = count + i
            elif not flag:
                flag = True
                flagcount = i
                #print (i)
            else:
                x = i - 1
                count = count + x         
        count = count + flagcount
        return (count)
    
        """
        :type s: str
        :rtype: int
        """
        