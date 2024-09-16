#Time Complexity : O(n) where n -> length of s
#Space Complexity : O(1) as there are 26 alphabets
#Did your code run on leetcode : yes
#approach : used set to store char in s. when traversing through s we check whether character in s are present in set or not.
#if present we inrement length of pallimdrome by 2 and remove element from set. if not we add character in set. 
#after completing all iterations if set is not empty increment length by 1

class Solution:
    def longestPalindrome(self, s: str) -> int:
        store_set = set()
        length = 0
        for x in s:
            if x in store_set:
                length += 2
                store_set.remove(x)
            else:
                store_set.add(x)
                
        if len(store_set) != 0:
            length +=1
        return length
                
            
        
