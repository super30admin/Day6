# // Time Complexity : O(n) for hashmap traversal
# // Space Complexity :O(1) for A-z hashmap
# // Did this code successfully run on Leetcode :Yes
# // Any problem you faced while coding this :Took me some time to figure out I needed an isOdd function to deal with odd condition.


# // Your code here along with comments explaining your approach
#abbccaayyd
# let us use a hashmap for the items. We will use the value ;
# we will take (value//2) * 2 for total values;
# We will use isOdd variable to see if there are any '1's

class Solution:
    def longestPalindrome(self, s: str) -> int:
        maps1 = self.letterMap(s)                   # hashMap {'a': 2, 'b': 2, 'c': 2, 'e': 1, 'f': 1}
        count = 0                                   # counter for palindrome
        isOdd = False                               # event when '1's are present
        for value in maps1.values():
            count += (value//2)*2
            if value%2 ==1:
                isOdd = True    
        if isOdd :
            return count +1
        else:
            return count

    
    def letterMap(self,s:str) ->  dict:             # basic frequency map
        hMap = {}
        for i in s:
            if i in hMap:
                hMap[i] +=1                 
            else:
                hMap[i] = 1
        return hMap 

strng = 'aabbccef'
x = Solution().longestPalindrome(strng)  
y = Solution().letterMap(strng)
print(x,y)
            