#Problem 3 : https://leetcode.com/problems/longest-palindrome/
#Test Cases Passed on LeetCode
#Space Complexity-O(n)
#Time Complexity-O(n)
class Solution:
    def longestPalindrome(self, s: str) -> int:
       
        sum=0
        all_freq = {} 
  
        for i in s: 
            if i in all_freq: 
                all_freq[i] += 1
            else: 
                all_freq[i] = 1
                
                
        for keys in all_freq:
            if all_freq[keys]%2==0:
                sum+=all_freq[keys]
            else:
                sum+=all_freq[keys]-1
        
        if sum==len(s):
            return sum
        else:
            return sum+1


sol=Solution()
s=input("Enter string: ")
print()
output=sol.longestPalindrome(s)
print("Output-longest palindrome size :")
print(output)
