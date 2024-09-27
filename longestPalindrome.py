""" Time Complexity : O(n) as it loops throught the list only once, for each single look up and append operation its O(1) so can be ignored
// Space Complexity :
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No, solved it after the lectrure


// Your code here along with comments explaining your approach """


def longestPalindrome(s) -> int:
    check = []
    count = 0
        
    for i in range(len(s)):
        if s[i] not in check :
                
            check.append(s[i])
                
        else:
            count = count + 2
            check.remove(s[i])
                
    if len(check) == 0:
        return count
    else: 
        return count + 1



count = longestPalindrome("abccccdd") #answer should be 7

print(count) 





        
        
        
