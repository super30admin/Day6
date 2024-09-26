#Time Complexity:   o(N)
# Space Complexity:o(1)

# we add all the even characters
# we convert the odd characters into even charaters and add them
# if odd characters are present we can only add atmost one of them as middle
# We create a set and add the characters when passing through the string
# If the character already exists we remove the element from the set and increase the size by two, Else we add it into the set
# after traversing if there is are still elements present in the set that means odd charcters are detected. We add 1 and return the sum
class Solution:
    def longestPalindrome(self, s: str) -> int:
        
        x = set()
        size = 0
        for a in s:
            if a in x:
                size +=2
                x.remove(a)
            else:
                x.add(a)
        if(len(x) >0 ):
            return size +1
        else:
            return size