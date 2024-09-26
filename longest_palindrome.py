#time complexity:O(n), we have to iterate over the whole str
#space complexity:O(1), hash set will be of constant len at max 26 hence constant
#passed all cases on LeetCode: yes
#difficulty faced: how to think of hash set
# comments:in the code
#https://leetcode.com/problems/longest-palindrome

class Solution:
    def longestPalindrome(self, s: str) -> int:
        
        #save all the unique chars in this set and remove when we find duplicate
        #add len by 2 when we remove duplicate chars indicating we can form palindrome with those 2
        #in the end all the characters which were only present once will remain so we can add any 1 in the middle to form palindrome, hence we return len+1 in this case
        save_set = set()
        palindrome_len = 0
        
        if s is None or len(s)==0: return 0
        
        for i in range(0,len(s)):
            
            if s[i] not in save_set:
                
                save_set.add(s[i])
            else:
                save_set.remove(s[i])
                palindrome_len += 2
                
        if len(save_set): return palindrome_len+1
        else: return palindrome_len
                