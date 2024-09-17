#timecomplexity O(n)
#spacecomplexity O(1) becouse number of character are fix a-Z. what if character are not fix?
# logic using hash set
"""
storing in hash set if not present in the set if it is then incriment count by 2
which mean character repeadted 2 times
at end set left with single count character only means incriment count by 1
"""
class Solution:
    def longestPalindrome(self, s: str) -> int:
        #set
            hash=set()
        count=0#
        if s==None or len(s)==0: return
        for char in s:
            if char not in hash:
                hash.add(char)
            else:
                hash.remove(char)
                count +=2
        if hash!=set():
            count +=1
        return count



        """
        char=[0]*52
        count=0
        if s==None or len(s)==0: return
        for ch in s:
            if char[ord(ch)-ord('_')]==0:
                char[ord(ch)-ord('_')]=1
            else:
                char[ord(ch)-ord('_')]=0
                count +=2
        if 1 in char:
            count +=1
        return count


        """

        
