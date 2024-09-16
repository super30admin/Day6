#Time Complexity: O(n)
#Space Complexity: O(n)
class solution():
    def longestPalindrome(self,s):#s is the given string
        #initialize new hashset hs
        hs = set()
        
        #initialize count to keep count of pairs in the given string
        count = 0
        
        #go through the string character by character
        for char in s:
            letter = char #extracted the char and stored in variable
            #letter exist in hashset: increase count and remove from hashset
            if letter in hs:
                count +=2
                hs.remove(letter)
            else:
                #add letter to hashset
                hs.add(letter)
                
        #hashset empty: return count        
        if hs==None or len(hs)==0:
            return count
        else:
            #hashset not empty, solo letter present in hashset, increase count by 1
            return (count+1)
