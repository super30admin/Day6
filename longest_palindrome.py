'''
Approach: Create a set and traverse through string s. If a character in s is present in set, remove the character and increment count by 2. If element not present in set, add the element. In the end, if set is not empty add 1 to count and return count. 

Time Complexity: O(n)
Space complexity: O(1)

Passes all testcases in leetcode
'''

class Solution:
    def longestPalindrome(self, s: str) -> int:
        res = set()
        count = 0
        for i in s:
            if i in res:
                res.remove(i)
                count += 2
            else:
                res.add(i)
        if len(res)>0:
            count += 1
        return count
                
        
