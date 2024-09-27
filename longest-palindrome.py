"""
Runtime Complexity:
O(n) - because we will go through each character in the string and the length of string can be n. 
O(1) - though the size of our string may be larger but our hashset will contain only 26 alphabet letters if the given string contains only lowercase alphabet.
Yes, the code worked on leetcode.
The idea behind the algorithm is to iterate through the string and check if the character is already present in hashset or not. If the set contains the character then it means 
the occurence is already present so we remove two elements and add 2 to the count else we add the new character to the set if the character was not encountered 
previously. We then check if the map is empty or not, if its not empty it means we still have characters with odd occurence so we may add any one of them in our palindrome
so we add 1 to the count and finally return the count.
"""


class Solution:
    def longestPalindrome(self, s: str) -> int:
        if len(s)==0:
            return 0
        result = set()
        count = 0
        for i in s:
            if i in result:
                count+=2
                result.remove(i)
            else:
                result.add(i)
        if len(result)!=0:
            count+=1
        return count
            
        
        
                
        
