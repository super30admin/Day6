class Solution:
    def longestPalindrome(self, s):


        hashset = []
        length = 0

        for x in s:
            if (x not in hashset):
                hashset.append(x)

            else:
                length += 2
                hashset.remove(x)

        
        if (length%2 == 0 and hashset):
            length +=1 

        return length


#TC = O(n)
#SC : o(n) 
        
